/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DataAccess;

import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Endereco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rodrigo
 */
public class EnderecoDAO {
    private BD bd;
    
    public EnderecoDAO(){
        bd = new BD();
    }
    
    public boolean Salvar(Endereco endereco){
        try{
        if (endereco.getCodendereco() == 0){
            PreparedStatement comando = bd.getConexao().prepareStatement("insert into endereco(rua, numero, complemento, bairro, cidade, cep, estado, pais, codpessoa) values (?,?,?,?,?,?,?,?,?)");
                comando.setString(1, endereco.getRua());
                comando.setInt(2, endereco.getNumero());
                comando.setString(3, endereco.getComplemento());
                comando.setString(4, endereco.getBairro());
                comando.setString(5, endereco.getCidade());
                comando.setInt(6, endereco.getCep());
                comando.setString(7, endereco.getEstado());
                comando.setString(8, endereco.getPais());
                comando.setInt(9, endereco.getPessoa().getCodpessoa());
                comando.executeUpdate();
        } else {
            PreparedStatement comando = bd.getConexao().prepareStatement("update endereco set rua = ?, numero = ?, complemento = ?, bairro = ?, cidade = ?, cep = ?, estado = ?, pais = ? where codendereco = ?");
                comando.setString(1, endereco.getRua());
                comando.setInt(2, endereco.getNumero());
                comando.setString(3, endereco.getComplemento());
                comando.setString(4, endereco.getBairro());
                comando.setString(5, endereco.getCidade());
                comando.setInt(6, endereco.getCep());
                comando.setString(7, endereco.getEstado());
                comando.setString(8, endereco.getPais());
                comando.setInt(9, endereco.getCodendereco());
                comando.executeUpdate();
        }
                return true;
        } catch (SQLException ex) {
                Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
                return false;
        }
    }
}
