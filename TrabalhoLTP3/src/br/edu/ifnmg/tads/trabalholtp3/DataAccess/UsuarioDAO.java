/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DataAccess;

import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rodrigo
 */
public class UsuarioDAO {
    private BD bd;
    
    public UsuarioDAO(){
        bd = new BD();
    }
    
    public boolean Salvar(Usuario usuario){
        try {
            if (usuario.getCodusuario() == 0){
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into usuario(usuario, senha, codpessoa) values (?,?,?)");
                comando.setString(1, usuario.getNomeUsuario());
                comando.setString(2, usuario.getSenhaUsuario());
                comando.setInt(3, usuario.getPessoa().getCodpessoa());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update usuario set usuario = ?, senha = ? where codpessoa = ?");
                comando.setString(1, usuario.getNomeUsuario());
                comando.setString(2, usuario.getSenhaUsuario());
                comando.setInt(3, usuario.getPessoa().getCodpessoa());
                comando.executeUpdate();
            }
            return true;
         } catch (SQLException ex) {
                    Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
         }

    }
    
}
