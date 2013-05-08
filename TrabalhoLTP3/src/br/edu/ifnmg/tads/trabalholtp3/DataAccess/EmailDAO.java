/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DataAccess;

import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Email;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
/**
 *
 * @author Rodrigo
 */
public class EmailDAO {
    private BD bd;
    
    public EmailDAO(){
        bd = new BD();
    }
    
    /**
     *
     * @param email
     * @return
     */
    public boolean Salvar(Email email){
        try {
        if (email.getCodemail() == 0){
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into email(endereco, codpessoa) values(?, ?)");
                comando.setString(1, email.getEndereco());
                System.out.println(email.getPessoa().getCodpessoa());
                comando.setInt(2, email.getPessoa().getCodpessoa());
                comando.executeUpdate();
                
        } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update email set endereco = ? where codemail = ?");
                comando.setString(1, email.getEndereco());
                comando.setInt(2, email.getCodemail());
                comando.executeUpdate();
        }
        return true;
        } catch (SQLException ex) {
                Logger.getLogger(EmailDAO.class.getName()).log(Level.SEVERE, null, ex);
                return false;
        }
    }
}
