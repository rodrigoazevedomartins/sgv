/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DataAccess;

import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    
    private boolean Salvar(Cliente cliente){
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
    
}
