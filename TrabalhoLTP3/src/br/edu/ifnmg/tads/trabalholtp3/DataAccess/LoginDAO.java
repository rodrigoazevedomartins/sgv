/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DataAccess;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.ErroValidacaoException;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Rodrigo
 */
public class LoginDAO {
    private BD bd;
    
    public LoginDAO(){
        bd = new BD();
    }
    
    public int Login(Usuario usuario){
        try {
            PreparedStatement comando;
            comando = bd.getConexao().prepareStatement("select * from usuario where usuario like ? and senha like password(?) and status = 1");
            comando.setString(1, usuario.getNomeUsuario());
            comando.setString(2, usuario.getSenhaUsuario());
            ResultSet resultado = comando.executeQuery();
            resultado.first();
            Usuario usuariologado = new Usuario();
            usuario.setNomeUsuario(resultado.getString("usuario"));
            usuario.setCodusuario(resultado.getInt("codusuario"));
            return 1;
        } catch (SQLException | ErroValidacaoException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        
    }
            
            
            
}
