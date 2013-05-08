/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DataAccess;

import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Telefone;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rodrigo
 */
public class TelefoneDAO {
        private BD bd;
    
        public TelefoneDAO(){
            bd = new BD();
        }
    
    public boolean Salvar(Telefone telefone){
       try {
            if (telefone.getCodtelefone() == 0){
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into telefone(area, numero, codpessoa) values (?,?,?)");
                comando.setInt(1, telefone.getArea());
                comando.setInt(2, telefone.getNumero());
                comando.setInt(3, telefone.getPessoa().getCodpessoa());
                comando.executeUpdate();
                
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update telefone set area = ?, numero = ? where codtelefone = ?");
                comando.setInt(1, telefone.getArea());
                comando.setInt(2, telefone.getNumero());
                comando.setInt(3, telefone.getCodtelefone());
                comando.executeUpdate();
            }
            
            return true;
       } catch (SQLException ex) {
                    Logger.getLogger(TelefoneDAO.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
       }
    }

}
