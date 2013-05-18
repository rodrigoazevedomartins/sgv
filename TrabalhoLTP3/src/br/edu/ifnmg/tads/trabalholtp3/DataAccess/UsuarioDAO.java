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
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
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
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into usuario(usuario, senha, codpessoa, status) values (?,?,?,?)");
                comando.setString(1, usuario.getNomeUsuario());
                comando.setString(2, usuario.getSenhaUsuario());
                comando.setInt(3, usuario.getPessoa().getCodpessoa());
                comando.setInt(4, 1);
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update usuario set usuario = ?, senha = ? where codusuario = ?");
                comando.setString(1, usuario.getNomeUsuario());
                comando.setString(2, usuario.getSenhaUsuario());
                comando.setInt(3, usuario.getCodusuario());
                comando.executeUpdate();
            }
            return true;
         } catch (SQLException ex) {
                    Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
         }

    }
    
    
    public List<Usuario> buscarUsuarios(Usuario filtro){
        try{
            String sql = "select * from usuario u INNER JOIN pessoa p ON (p.codpessoa = u.codpessoa)";
            String where = "";
            String order = " ORDER BY u.codusuario ASC";

            if (filtro.getCodusuario()> 0){
                where = "u.codusuario = " + filtro.getCodusuario();
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
                sql = sql + " where " + where + " and u.status = 1";
            }
            
            sql = sql + order;
            
            Statement comando = bd.getConexao().createStatement();
            
            ResultSet resultado = comando.executeQuery(sql);
            List<Usuario> usuarios = new LinkedList<>();
            while(resultado.next()){
                    Usuario usuario = new Usuario();
                    usuario.setCodusuario(resultado.getInt("codusuario"));
                    usuario.setCodpessoa(resultado.getInt("codpessoa"));
                    usuario.setNome(resultado.getString("nome"));
                    usuario.setRg(resultado.getString("rg"));
                    usuario.setCpf(resultado.getInt("cpf"));
                    usuarios.add(usuario);
            }
            
            return usuarios;
            
        } catch (SQLException | ErroValidacaoException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<Usuario> ListarUsuario(){
        try{
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from usuario u INNER JOIN pessoa p ON (p.codpessoa = u.codpessoa) where u.status = 1 ORDER BY u.codpessoa ASC");
            ResultSet resultado = comando.executeQuery();
            List<Usuario> usuarios = new LinkedList<>();
            while(resultado.next()){
                    Usuario usuario = new Usuario();
                    usuario.setCodusuario(resultado.getInt("codusuario"));
                    usuario.setCodpessoa(resultado.getInt("codpessoa"));
                    usuario.setNome(resultado.getString("nome"));
                    usuario.setRg(resultado.getString("rg"));
                    usuario.setCpf(resultado.getInt("cpf"));
                    usuarios.add(usuario);
            }
            
            return usuarios;
            
        } catch (SQLException | ErroValidacaoException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }    
    }
    
    public Usuario Abrir(int cod){
        Usuario usuario = new Usuario();
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from usuario where codusuario = ?");
            comando.setInt(1, cod);
            ResultSet resultado = comando.executeQuery();
            resultado.first();
            usuario.setCodusuario(resultado.getInt("codusuario"));
            usuario.setNomeUsuario(resultado.getString("usuario"));
            usuario.setSenhaUsuario(resultado.getString("senha"));
            usuario.setCodpessoa(resultado.getInt("codpessoa"));
            return usuario;
            
        } catch (SQLException | ErroValidacaoException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public boolean Apagar(int cod){
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("update usuario set status = 0 where codusuario = ?");
            comando.setInt(1, cod);
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
