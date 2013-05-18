/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DataAccess;

import br.edu.ifnmg.tads.trabalholtp3.DomainModel.ErroValidacaoException;
import br.edu.ifnmg.tads.trabalholtp3.DomainModel.Produto;
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
public class ProdutoDAO {
    private BD bd;

    public ProdutoDAO() {
        bd = new BD();
    }

    public boolean Salvar(Produto produto) {
        try {
            if (produto.getCodproduto() == 0) {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into produto(nome,descricao, valor_unitario_venda, valor_unitario_compra, estoque, status) values(?,?,?,?,?,?)");
                comando.setString(1, produto.getNome());
                comando.setString(2, produto.getDescricao());
                comando.setDouble(3, produto.getValorunitariovenda());
                comando.setDouble(4, produto.getValorunitariocompra());
                comando.setInt(5, produto.getEstoque());
                comando.setInt(6, 1);
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update produto set nome = ?, descricao = ?, valor_unitario_venda = ?, valor_unitario_compra = ?, estoque = ? where codproduto = ?");
                comando.setString(1, produto.getNome());
                comando.setString(2, produto.getDescricao());
                comando.setDouble(3, produto.getValorunitariovenda());
                comando.setDouble(4, produto.getValorunitariocompra());
                comando.setInt(5, produto.getEstoque());
                comando.setInt(6, produto.getCodproduto());
                comando.executeUpdate();
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
        public List<Produto> listarProdutos() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from produto where status = 1 ORDER BY codproduto ASC");
            ResultSet resultado = comando.executeQuery();
            List<Produto> produtos = new LinkedList<>();
            while(resultado.next()){
                Produto produto = new Produto();
                produto.setCodproduto(resultado.getInt("codproduto"));
                produto.setNome(resultado.getString("nome"));
                produto.setDescricao(resultado.getString("descricao"));
                produto.setEstoque(resultado.getInt("estoque"));
                produto.setValorunitariocompra(resultado.getDouble("valor_unitario_compra"));
                produto.setValorunitariovenda(resultado.getDouble("valor_unitario_venda"));
                produtos.add(produto);
            }
            return produtos;
        } catch (SQLException | ErroValidacaoException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<Produto> buscarProdutos(Produto filtro){
        
        try {
        String sql = "select * from produto";
        String where = "";
        String order = " ORDER BY codproduto ASC";
        
        if (filtro.getCodproduto() > 0){
            where = "codproduto = " + filtro.getCodproduto();
        }
        
        if (filtro.getNome().length() > 0){
            if (where.length() > 0){
                where = where + " and ";
            }
            where = where + "nome like '%" + filtro.getNome() + "%'";
        }
        
        if (filtro.getDescricao().length() > 0){
            if (where.length() > 0){
                where = where + " and ";
            }
            where = where + "descricao like '%" + filtro.getDescricao() + "%'";
        }
        
        if (filtro.getEstoque() > 0){
            if (where.length() > 0){
                where = where + " and ";
            }
            where = where + "estoque = " + filtro.getEstoque();
        }
        
        if (where.length() > 0){
            sql = sql + " where " + where + " and status = 1";
        }
        
        sql = sql + order;
        
        
        Statement comando = bd.getConexao().createStatement();
        ResultSet resultado = comando.executeQuery(sql);
        List<Produto> produtos = new LinkedList<>();
        while(resultado.next()){
            Produto produto = new Produto();
            produto.setCodproduto(resultado.getInt("codproduto"));
            produto.setNome(resultado.getString("nome"));
            produto.setDescricao(resultado.getString("descricao"));
            produto.setEstoque(resultado.getInt("estoque"));
            produtos.add(produto);
        }
        return produtos;
        } catch (SQLException | ErroValidacaoException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }   
    }     
        
    public Produto Abrir(int cod){
        try {
            Produto produto = new Produto();
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from produto where codproduto = ?");
            comando.setInt(1, cod);
            ResultSet resultado = comando.executeQuery();
            resultado.first();
            produto.setCodproduto(resultado.getInt("codproduto"));
            produto.setNome(resultado.getString("nome"));
            produto.setDescricao(resultado.getString("descricao"));
            produto.setValorunitariovenda(resultado.getDouble("valor_unitario_venda"));
            produto.setValorunitariocompra(resultado.getDouble("valor_unitario_compra"));
            produto.setEstoque(resultado.getInt("estoque"));
            return produto;
        } catch (SQLException | ErroValidacaoException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    

    public boolean Apagar(int cod) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("update produto set status = 0 where codproduto = ?");
            comando.setInt(1, cod);
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
