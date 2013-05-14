/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DataAccess;

import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Cliente;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.ErroValidacaoException;
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
public class ClienteDAO {
    private BD bd;
    
    public ClienteDAO(){
        bd = new BD();
    }
    
    public boolean Salvar(Cliente cliente){
        try {
            if (cliente.getCodcliente()==0){
                PreparedStatement comando;
                comando = bd.getConexao().prepareStatement("insert into cliente(codpessoa) values (?)");
                comando.setInt(1, cliente.getPessoa().getCodpessoa());
                comando.executeUpdate();
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
    }
    
    public List<Cliente> listarClientes(){
        try{
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from cliente c INNER JOIN pessoa p ON (p.codpessoa = c.codpessoa) ORDER BY c.codcliente ASC");
            ResultSet resultado = comando.executeQuery();
            List<Cliente> clientes = new LinkedList<>();
            while(resultado.next()){
                    Cliente cliente = new Cliente();
                    cliente.setCodcliente(resultado.getInt("codcliente"));
                    cliente.setCodpessoa(resultado.getInt("codpessoa"));
                    cliente.setNome(resultado.getString("nome"));
                    cliente.setRg(resultado.getString("rg"));
                    cliente.setCpf(resultado.getInt("cpf"));
                    clientes.add(cliente);
                    
            }
            
            return clientes;
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (ErroValidacaoException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<Cliente> buscarClientes(Cliente filtro){
        try{
            String sql = "select * from cliente c INNER JOIN pessoa p ON (p.codpessoa = c.codpessoa)";
            String where = "";
            String order = " ORDER BY c.codcliente ASC";

            if (filtro.getCodcliente() > 0){
                where = "c.codcliente = " + filtro.getCodcliente();
            }
            
            if (filtro.getNome().length() > 0){
                if (where.length() > 0)
                    where = where + " and ";
                where = where + "p.nome like '%" + filtro.getNome() + "%'";
            }
            
            if (filtro.getRg().length() > 0){
                if (where.length() > 0)
                    where = where + " and ";
                where = where + "p.rg like '%" + filtro.getRg() + "%'";
            }
            
            if (filtro.getCpf() > 0){
                if (where.length() > 0)
                    where = where + " and ";
                where = where + "p.cpf =" + filtro.getCpf();
            }
            
            if (where.length() > 0){
                sql = sql + " where " + where;
            }
            
            sql = sql + order;
            
            Statement comando = bd.getConexao().createStatement();
            
            ResultSet resultado = comando.executeQuery(sql);
            List<Cliente> clientes = new LinkedList<>();
            while(resultado.next()){
                    Cliente cliente = new Cliente();
                    cliente.setCodcliente(resultado.getInt("codcliente"));
                    cliente.setCodpessoa(resultado.getInt("codpessoa"));
                    cliente.setNome(resultado.getString("nome"));
                    cliente.setRg(resultado.getString("rg"));
                    cliente.setCpf(resultado.getInt("cpf"));
                    clientes.add(cliente);
            }
            
            return clientes;
            
        } catch (SQLException | ErroValidacaoException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public Cliente Abrir(int cod){
        try {
            Cliente cliente = new Cliente();
            
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from cliente where codcliente = ?");
            comando.setInt(1, cod);
            ResultSet resultado = comando.executeQuery();
            resultado.first();
            cliente.setCodcliente(resultado.getInt("codcliente"));
            cliente.setCodpessoa(resultado.getInt("codpessoa"));
   
            return cliente;
        } catch (SQLException | ErroValidacaoException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
