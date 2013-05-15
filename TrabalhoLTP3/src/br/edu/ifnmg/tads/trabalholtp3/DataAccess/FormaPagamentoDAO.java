/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DataAccess;

import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Pagamento;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.ErroValidacaoException;
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
public class FormaPagamentoDAO {
    private BD bd;
    
    public FormaPagamentoDAO(){
        bd = new BD();
    }
    
    public boolean Salvar(Pagamento forma){
        try {
            if (forma.getCodpagamento() == 0){

                    PreparedStatement comando = bd.getConexao().prepareStatement("insert into pagamento(tipo) values(?)");
                    comando.setString(1, forma.getNomeTipo());
                    comando.executeUpdate();
            } else {
                    PreparedStatement comando = bd.getConexao().prepareStatement("update pagamento set tipo = ? where codpagamento = ?");
                    comando.setString(1, forma.getNomeTipo());
                    comando.setInt(2, forma.getCodpagamento());
                    comando.executeUpdate();
            }       
            return true;
        } catch (SQLException ex) {
                Logger.getLogger(FormaPagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
                return false;
        }
    }
    
    public List<Pagamento> ListarTodos(){     
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from pagamento order by codpagamento ASC");
            ResultSet resultado = comando.executeQuery();
            List<Pagamento> formas = new LinkedList<>();
            while(resultado.next()){
                Pagamento forma = new Pagamento();
                forma.setCodpagamento(resultado.getInt("codpagamento"));
                forma.setNomeTipo(resultado.getString("tipo"));
                formas.add(forma);
            }
            
            return formas;
        } catch (SQLException | ErroValidacaoException ex) {
            Logger.getLogger(FormaPagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<Pagamento> buscarFormas(Pagamento filtro){
        try {
            String sql = "select * from pagamento";
            String where = "";
            String order = " ORDER BY codpagamento ASC";

            if (filtro.getCodpagamento() > 0){
                where = "codpagamento = " + filtro.getCodpagamento();
            }

            if (filtro.getNomeTipo().length() > 0){
                if (where.length() > 0)
                    where = where + " and ";
                where = "tipo like '%" + filtro.getNomeTipo() + "%'";
            }

            if (where.length() > 0){
                sql = sql + " where " + where;
            }
            sql = sql + order;
            System.out.print(sql);
            Statement comando = bd.getConexao().createStatement();
            ResultSet resultado = comando.executeQuery(sql);
            List<Pagamento> formas = new LinkedList<>();
            while(resultado.next()){
                Pagamento forma = new Pagamento();
                forma.setCodpagamento(resultado.getInt("codpagamento"));
                forma.setNomeTipo(resultado.getString("tipo"));
                formas.add(forma);
            }
        
            return formas;
        } catch (SQLException | ErroValidacaoException ex) {
            Logger.getLogger(FormaPagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public Pagamento Abrir(int cod){
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from pagamento where codpagamento = ?");
            comando.setInt(1, cod);
            ResultSet resultado = comando.executeQuery();
            resultado.first();
            Pagamento forma = new Pagamento();
            forma.setCodpagamento(resultado.getInt("codpagamento"));
            forma.setNomeTipo(resultado.getString("tipo"));
            return forma;
        } catch (SQLException | ErroValidacaoException ex) {
            Logger.getLogger(FormaPagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    public boolean Apagar(int cod){
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("delete from pagamento where codpagamento = ?");
            comando.setInt(1, cod);
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(FormaPagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
}
