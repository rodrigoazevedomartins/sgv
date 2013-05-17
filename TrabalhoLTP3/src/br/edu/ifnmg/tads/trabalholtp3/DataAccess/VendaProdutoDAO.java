/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DataAccess;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.ErroValidacaoException;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Produto;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Venda;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.VendaProduto;
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
public class VendaProdutoDAO {
    private BD bd;
    
    public VendaProdutoDAO(){
        bd = new BD();
    }
       
    public boolean Salvar(VendaProduto itens){
        try {
            if (itens.getCodvendaproduto() == 0){
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into vendaproduto(codvenda, codproduto, quantidade) values(?, ?, ?)");
                comando.setInt(1, itens.getVenda().getCodvenda());
                comando.setInt(2, itens.getProduto().getCodproduto());
                comando.setInt(3, itens.getQuantidade());
                comando.executeUpdate();
            }
            return true;
        } catch (SQLException ex) {
                Logger.getLogger(VendaProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
                return false;
        }
    }
    
    public List<VendaProduto> ListarItens(int codvenda){
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("SELECT vp.codvendaproduto as codvendaproduto, vp.codproduto as codproduto, vp.codvenda as codvenda, vp.quantidade as quantidade, p.valor_unitario_venda as valor, p.nome as nomeproduto from vendaproduto vp INNER JOIN produto p ON (p.codproduto = vp.codproduto) where codvenda = ? ORDER BY codvendaproduto");
            comando.setInt(1, codvenda);
            ResultSet resultado = comando.executeQuery();
            List<VendaProduto> itens = new LinkedList<>();
            while(resultado.next()){
                VendaProduto item = new VendaProduto();
                Produto produto = new Produto();
                Venda venda = new Venda();
                item.setCodvendaproduto(resultado.getInt("codvendaproduto"));
                item.setQuantidade(resultado.getInt("quantidade"));
                produto.setCodproduto(resultado.getInt("codproduto"));
                produto.setNome(resultado.getString("nomeproduto"));
                produto.setValorunitariovenda(resultado.getDouble("valor"));
                item.setProduto(produto);
                venda.setCodvenda(resultado.getInt("codvenda"));
                item.setVenda(venda);
                itens.add(item);
            }
            return itens;
        } catch (SQLException | ErroValidacaoException ex) {
            Logger.getLogger(VendaProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    public List<VendaProduto> BuscarItens(VendaProduto filtro){
        try {
            String sql = "SELECT vp.codvendaproduto as codvendaproduto, vp.codproduto as codproduto, vp.codvenda as codvenda, vp.quantidade as quantidade, p.valor_unitario_venda as valor, p.nome as nomeproduto from vendaproduto vp INNER JOIN produto p ON (p.codproduto = vp.codproduto)";
            String where = "";
            String order = " ORDER BY codvendaproduto";

            if (filtro.getCodvendaproduto()> 0){
                where = "vp.codvendaproduto = " + filtro.getCodvendaproduto();
            }

            if (filtro.getProduto().getNome().length() > 3){
                if (where.length() > 0)
                      where = where + " and ";
                where = "p.nome like '%" + filtro.getProduto().getNome() + "%'";
            }
            
            if (where.length() > 0)
                sql = sql + " where " + where + " and vp.codvenda = " + filtro.getVenda().getCodvenda();
            sql = sql + order;

            //System.out.print(sql);
        
            Statement comando;
            comando = bd.getConexao().createStatement();
            ResultSet resultado = comando.executeQuery(sql);
            List<VendaProduto> itens = new LinkedList<>();
            while(resultado.next()){
                VendaProduto item = new VendaProduto();
                Produto produto = new Produto();
                Venda venda = new Venda();
                item.setCodvendaproduto(resultado.getInt("codvendaproduto"));
                item.setQuantidade(resultado.getInt("quantidade"));
                produto.setCodproduto(resultado.getInt("codproduto"));
                produto.setNome(resultado.getString("nomeproduto"));
                produto.setValorunitariovenda(resultado.getDouble("valor"));
                item.setProduto(produto);
                venda.setCodvenda(resultado.getInt("codvenda"));
                item.setVenda(venda);
                itens.add(item);

            }
            return itens;
        } catch (SQLException | ErroValidacaoException ex) {
            Logger.getLogger(VendaProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
    public boolean Apagar(int cod) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("update vendaproduto set status = 0 where codvenda = ?");
            comando.setInt(1, cod);
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(VendaProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
   
}
