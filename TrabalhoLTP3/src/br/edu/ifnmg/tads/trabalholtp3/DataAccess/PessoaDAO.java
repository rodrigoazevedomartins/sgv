/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DataAccess;

import br.edu.ifnmg.tads.trabalholtp3.DomainModel.ErroValidacaoException;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Pessoa;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
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
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into pessoa(nome, nomemae, nomepai, rg, cpf, naturalidade, status) values (?,?,?,?,?,?,?)");
                comando.setString(1, pessoa.getNome());
                comando.setString(2, pessoa.getNomemae());
                comando.setString(3, pessoa.getNomepai());
                comando.setString(4, pessoa.getRg());
                comando.setInt(5, pessoa.getCpf());
                //comando.setDate(6, (java.sql.Date) pessoa.getDatanasc());
                comando.setString(6, pessoa.getNaturalidade());
                comando.setInt(7, 1);
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update pessoa set nome = ?, nomemae = ?, nomepai = ?, rg = ?, cpf = ?, naturalidade = ? where codpessoa = ?");
                comando.setString(1, pessoa.getNome());
                comando.setString(2, pessoa.getNomemae());
                comando.setString(3, pessoa.getNomepai());
                comando.setString(4, pessoa.getRg());
                comando.setInt(5, pessoa.getCpf());
                //comando.setDate(6, (java.sql.Date) pessoa.getDatanasc());
                comando.setString(6, pessoa.getNaturalidade());
                comando.setInt(7, pessoa.getCodpessoa());
                comando.executeUpdate();
            }
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public Pessoa Abrir(int cod){
        try {
            Pessoa pessoa = new Pessoa();
            PreparedStatement comando;
            comando = bd.getConexao().prepareStatement("select * from pessoa where codpessoa = ?");
            comando.setInt(1, cod);
            ResultSet resultado = comando.executeQuery();
            resultado.first();
            pessoa.setCodpessoa(resultado.getInt("codpessoa"));
            pessoa.setNome(resultado.getString("nome"));
            pessoa.setNomemae(resultado.getString("nomemae"));
            pessoa.setNomepai(resultado.getString("nomepai"));
            pessoa.setRg(resultado.getString("rg"));
            pessoa.setCpf(resultado.getInt("cpf"));
            //pessoa.setDatanasc(resultado.getDate("datanasc"));
            pessoa.setNaturalidade(resultado.getString("naturalidade"));
            return pessoa;
        } catch (SQLException | ErroValidacaoException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }            
    }
    
    public boolean Apagar(int cod){
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("update pessoa set status = 0 where codpessoa = ?");
            comando.setInt(1, cod);
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    
    }
}
