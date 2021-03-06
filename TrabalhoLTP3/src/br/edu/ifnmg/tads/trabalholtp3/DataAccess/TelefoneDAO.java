/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DataAccess;

import br.edu.ifnmg.tads.trabalholtp3.DomainModel.ErroValidacaoException;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Telefone;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
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
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into telefone(area, numero, codpessoa, status) values (?,?,?,?)");
                comando.setInt(1, telefone.getArea());
                comando.setInt(2, telefone.getNumero());
                comando.setInt(3, telefone.getPessoa().getCodpessoa());
                comando.setInt(4, 1);
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
    
    public List<Telefone> Abrir(int cod){
        List<Telefone> telefones = new LinkedList<>();    
        try {
                PreparedStatement comando = bd.getConexao().prepareStatement("select * from telefone where codpessoa = ? and status = 1");
                comando.setInt(1, cod);
                ResultSet resultado = comando.executeQuery();
                while(resultado.next()){
                    Telefone telefone = new Telefone();
                    telefone.setCodtelefone(resultado.getInt("codtelefone"));
                    telefone.setArea(resultado.getInt("area"));
                    telefone.setNumero(resultado.getInt("numero"));
                    telefones.add(telefone);
                }                
                return telefones;
            } catch (SQLException | ErroValidacaoException ex) {
                Logger.getLogger(TelefoneDAO.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }       
    }
    
    public boolean Apagar(int cod){
            try {
                PreparedStatement comando = bd.getConexao().prepareStatement("update telefone set status = 0 where codtelefone = ?");
                comando.setInt(1, cod);
                comando.executeUpdate();
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(TelefoneDAO.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        
    }
}
