/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DataAccess;

import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Pessoa;
import br.edu.ifnmg.tads.trabalholtp3.InterfaceUsuario.frmCadUsuario;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
    
/**
 *
 * @author Rodrigo
 */
public class PessoaDAO {
    private BD bd;
    
    public PessoaDAO(){
        bd = new BD();
    }
    
    
    public int Consultacodpessoa(){
        int codpessoa = 0;    
        try {
                
                PreparedStatement comando = bd.getConexao().prepareStatement("select max(codpessoa) as codpessoa from pessoa");
                ResultSet resultado = comando.executeQuery();
                resultado.first();
                codpessoa = (resultado.getInt("codpessoa"));
                System.out.println(codpessoa);
                
            } catch (SQLException ex) {
                Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        return codpessoa;

        
    
        
    }
    
    public boolean Salvar(Pessoa pessoa){
        try{
            if (pessoa.getCodpessoa() == 0){
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into pessoa(nome, nomemae, nomepai, rg, cpf, naturalidade) values (?,?,?,?,?,?)");
                comando.setString(1, pessoa.getNome());
                comando.setString(2, pessoa.getNomemae());
                comando.setString(3, pessoa.getNomepai());
                comando.setString(4, pessoa.getRg());
                comando.setInt(5, pessoa.getCpf());
                //comando.setDate(6, (Date) pessoa.getDatanasc());
                comando.setString(6, pessoa.getNaturalidade());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update pessoa set nome = ?, nomemae = ?, nomepai = ?, rg = ?, cpf = ?, datanasc = ?, naturalidade = ? where codpessoa = ?");
                comando.setString(1, pessoa.getNome());
                comando.setString(2, pessoa.getNomemae());
                comando.setString(3, pessoa.getNomepai());
                comando.setString(4, pessoa.getRg());
                comando.setInt(5, pessoa.getCpf());
                comando.setDate(6, (Date) pessoa.getDatanasc());
                comando.setString(7, pessoa.getNaturalidade());
                comando.setInt(8, pessoa.getCodpessoa());
                comando.executeUpdate();
            }
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EmailDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
