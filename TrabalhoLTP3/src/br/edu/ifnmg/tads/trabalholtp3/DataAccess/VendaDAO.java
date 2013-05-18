/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DataAccess;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Cliente;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.ErroValidacaoException;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Pagamento;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Usuario;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Venda;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rodrigo
 */
public class VendaDAO {
    private BD bd;
    
    public VendaDAO(){
        bd = new BD();
    }
    
    public int Consultacodvenda(){
        try {
            int cod;
            PreparedStatement comando = bd.getConexao().prepareStatement("select max(codvenda) as codvenda from venda");
            ResultSet resultado = comando.executeQuery();
            resultado.first();
            cod = resultado.getInt("codvenda");
            return cod;
            
        } catch (SQLException ex) {
            Logger.getLogger(VendaProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public boolean Salvar(Venda venda){
        try {     
        if (venda.getCodvenda() == 0){
               PreparedStatement comando = bd.getConexao().prepareStatement("insert into venda(codpagamento, codcliente, codusuario, status) values(?,?,?,?)");
               //comando.setDate(1, (Date) venda.getDatavenda());
               comando.setInt(1, venda.getPagamento().getCodpagamento());
               comando.setInt(2, venda.getCliente().getCodcliente());
               comando.setInt(3, venda.getUsuario().getCodusuario());
               comando.setInt(4, 1);
               comando.executeUpdate();
        } else {
               PreparedStatement comando = bd.getConexao().prepareStatement("update venda set datavenda = ?, codpagamento = ?, codcliente = ?, codusuario = ? where codvenda = ?");
               comando.setDate(1, (Date) venda.getDatavenda());
               comando.setInt(2, venda.getPagamento().getCodpagamento());
               comando.setInt(3, venda.getCliente().getCodcliente());
               comando.setInt(4, venda.getUsuario().getCodusuario());
               comando.setInt(5, venda.getCodvenda());
               comando.executeUpdate();
        }
        return true;
        } catch (SQLException ex) {
                Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
                return false;
        }   
    }
    
    public Venda Abrir(int codvenda){
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("SELECT v.codvenda, pu.nome as nomeusuario, pc.nome as nomecliente, pa.tipo as tipopagamento FROM venda v INNER JOIN cliente c ON (c.codcliente = v.codcliente) INNER JOIN usuario u ON (u.codusuario = v.codusuario) INNER JOIN pessoa pu ON (pu.codpessoa = u.codpessoa) INNER JOIN pessoa pc ON (pc.codpessoa = c.codpessoa) INNER JOIN pagamento pa ON (pa.codpagamento = v.codpagamento) INNER JOIN vendaproduto vp ON (vp.codvenda = v.codvenda) INNER JOIN produto p ON(p.codproduto = vp.codproduto) where v.codvenda = ?");
            comando.setInt(1, codvenda);
            ResultSet resultado = comando.executeQuery();
            resultado.first();
            Venda venda = new Venda();
            Cliente cliente = new Cliente();
            Usuario usuario = new Usuario();
            Pagamento pagamento = new Pagamento();
            cliente.setNome(resultado.getString("nomecliente"));
            usuario.setNome(resultado.getString("nomeusuario"));
            pagamento.setNomeTipo(resultado.getString("tipopagamento"));
            venda.setCodvenda(resultado.getInt("codvenda"));
            venda.setCliente(cliente);
            venda.setUsuario(usuario);
            venda.setPagamento(pagamento);
            
            return venda;
        } catch (SQLException | ErroValidacaoException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<Venda> listarVendas(){
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("SELECT v.codvenda, pu.nome as nomeusuario, pc.nome as nomecliente, pa.tipo as tipopagamento FROM venda v INNER JOIN cliente c ON (c.codcliente = v.codcliente) INNER JOIN usuario u ON (u.codusuario = v.codusuario) INNER JOIN pessoa pu ON (pu.codpessoa = u.codpessoa) INNER JOIN pessoa pc ON (pc.codpessoa = c.codpessoa) INNER JOIN pagamento pa ON (pa.codpagamento = v.codpagamento) INNER JOIN vendaproduto vp ON (vp.codvenda = v.codvenda) INNER JOIN produto p ON(p.codproduto = vp.codproduto) where v.status = 1 GROUP BY vp.codvenda ORDER BY v.codvenda");
            ResultSet resultado = comando.executeQuery();
            List<Venda> vendas = new LinkedList<>();
            while(resultado.next()){
                Venda venda = new Venda();
                Cliente cliente = new Cliente();
                Usuario usuario = new Usuario();
                Pagamento pagamento = new Pagamento();
                cliente.setNome(resultado.getString("nomecliente"));
                usuario.setNome(resultado.getString("nomeusuario"));
                pagamento.setNomeTipo(resultado.getString("tipopagamento"));
                venda.setCodvenda(resultado.getInt("codvenda"));
                venda.setCliente(cliente);
                venda.setUsuario(usuario);
                venda.setPagamento(pagamento);
                vendas.add(venda);
            }
            return vendas;
        } catch (SQLException | ErroValidacaoException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<Venda> buscarVendas(Venda filtro){
        try {
            String sql = "SELECT v.codvenda, pu.nome as nomeusuario, pc.nome as nomecliente, pa.tipo as tipopagamento FROM venda v INNER JOIN cliente c ON (c.codcliente = v.codcliente) INNER JOIN usuario u ON (u.codusuario = v.codusuario) INNER JOIN pessoa pu ON (pu.codpessoa = u.codpessoa) INNER JOIN pessoa pc ON (pc.codpessoa = c.codpessoa) INNER JOIN pagamento pa ON (pa.codpagamento = v.codpagamento) INNER JOIN vendaproduto vp ON (vp.codvenda = v.codvenda) INNER JOIN produto p ON(p.codproduto = vp.codproduto)";
            String where = "";
            String order = " GROUP BY vp.codvenda ORDER BY v.codvenda";

            if (filtro.getCodvenda() > 0){
                where = "v.codvenda = " + filtro.getCodvenda();
            }

            if (filtro.getCliente().getNome().length() > 0){
                if (where.length() > 0)
                      where = where + " and ";
                where = "pc.nome like '%" + filtro.getCliente().getNome() + "%'";
            }

            if (filtro.getUsuario().getNome().length() > 0){
                if (where.length() > 0)
                    where = where + " and ";
                where = "pu.nome like '%" + filtro.getUsuario().getNome() + "%'";
            }

            if (filtro.getPagamento().getNomeTipo().length() > 0){
                if (where.length() > 0)
                    where = where + " and ";
                where = "pa.tipo like '%" + filtro.getPagamento().getNomeTipo() + "%'";

            }

            if (where.length() > 0)
                sql = sql + " where " + where + " and v.status = 1";
            sql = sql + order;

            System.out.print(sql);
        
            Statement comando;
            comando = bd.getConexao().createStatement();
            ResultSet resultado = comando.executeQuery(sql);
            List<Venda> vendas = new LinkedList<>();
            while(resultado.next()){
                Venda venda = new Venda();
                Cliente cliente = new Cliente();
                Usuario usuario = new Usuario();
                Pagamento pagamento = new Pagamento();
                cliente.setNome(resultado.getString("nomecliente"));
                usuario.setNome(resultado.getString("nomeusuario"));
                pagamento.setNomeTipo(resultado.getString("tipopagamento"));
                venda.setCodvenda(resultado.getInt("codvenda"));
                venda.setCliente(cliente);
                venda.setUsuario(usuario);
                venda.setPagamento(pagamento);
                vendas.add(venda);

            }
            return vendas;
        } catch (SQLException | ErroValidacaoException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
        
        //return filtro;
    }
    
    public boolean Apagar(int cod) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("update venda set status = 0 where codvenda = ?");
            comando.setInt(1, cod);
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
}
