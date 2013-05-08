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

    public boolean Salvar(Produto obj) {
        try {
            if (obj.getCodproduto() == 0) {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into produto(nome,descricao, valor_unitario_venda, valor_unitario_compra, estoque) values(?,?,?,?,?)");
                comando.setString(1, obj.getNome());
                comando.setString(2, obj.getDescricao());
                comando.setDouble(3, obj.getValorunitariovenda());
                comando.setDouble(4, obj.getValorunitariocompra());
                comando.setInt(5, obj.getEstoque());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update produto set nome = ?, descricao = ?, valor_unitario_venda = ?, valor_unitario_compra = ?, estoque = ? where id = ?");
                comando.setString(1, obj.getNome());
                comando.setString(2, obj.getDescricao());
                comando.setDouble(3, obj.getValorunitariovenda());
                comando.setDouble(4, obj.getValorunitariocompra());
                comando.setInt(5, obj.getEstoque());
                comando.setInt(6, obj.getCodproduto());
                comando.executeUpdate();
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public Produto Abrir(int id) throws ErroValidacaoException {
        try {
            Produto produto = new Produto(0, "", "", 0, 0, 0);

            PreparedStatement comando = bd.getConexao().prepareStatement("select * from produtos where id = ?");
            comando.setInt(0, id);
            ResultSet resultado = comando.executeQuery();

            resultado.first();

            produto.setCodproduto(resultado.getInt("id"));
            produto.setNome(resultado.getString("nome"));
            produto.setValorunitariovenda(resultado.getDouble("valor"));

            return produto;

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Apagar(Produto obj) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("delete from produtos where id = ?");
            comando.setInt(0, obj.getCodproduto());
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public List<Produto> listarTodos() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from produtos ");
            ResultSet resultado = comando.executeQuery();
            // Cria uma lista de produtos vazia
            List<Produto> produtos = new LinkedList<>();
            while(resultado.next()){
                Produto tmp = new Produto();
            }
            return produtos;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
