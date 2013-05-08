/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DomainModel;

import java.util.Objects;

/**
 *
 * @author Rodrigo
 */
public class Produto {
    private int codproduto;
    private String nome;
    private String descricao;
    private double valor_unitario_venda;
    private double valor_unitario_compra;
    private int estoque;
    
    public Produto(){
        codproduto = 0;
        nome = "";
        descricao = "";
        valor_unitario_compra = 0;
        valor_unitario_venda = 0;
        estoque = 0;
    }
    
    public Produto(int cod, String nomea, String descricaoa, double valorunivenda, double valorunicompra, int estoquea){
        codproduto = cod;
        nome = nomea;
        descricao = descricaoa;
        valor_unitario_venda = valorunivenda;
        valor_unitario_compra = valorunicompra;
        estoque = estoquea;
    }

    public int getCodproduto() {
        return codproduto;
    }

    public void setCodproduto(int codproduto) throws ErroValidacaoException{
        if (codproduto > 0){
            this.codproduto = codproduto;
        } else {
            throw new ErroValidacaoException("Código Produto Inválido. Insira um código maior que 0.");
        }
    }   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws ErroValidacaoException{
        if ((nome.length() >= 3) && (nome.length() <= 250)){
            this.nome = nome;
        } else {
            throw new ErroValidacaoException("Nome Inválido. Insira um nome com no minimo 3 caracteres e com no máximo 250 caracteres.");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) throws ErroValidacaoException{
        if ((nome.length() >= 3) && (nome.length() <= 250)){
            this.descricao = descricao;
        } else {
            throw new ErroValidacaoException("Descrição Inválida. Insira uma descrição com no minimo 3 caracteres e com no máximo 250 caracteres.");
        }
    }
    public double getValorunitariovenda() {
        return valor_unitario_venda;
    }

    public void setValorunitariovenda(double valor_unitario_venda) throws ErroValidacaoException{
        if (valor_unitario_venda > 0){
            this.valor_unitario_venda = valor_unitario_venda;
        } else {
        throw new ErroValidacaoException("Valor Unitário Venda Inválido. Insira um valor maior que 0.");
        }
    }

    public double getValorunitariocompra() {
        return valor_unitario_compra;
    }

    public void setValorunitariocompra(double valor_unitario_compra) throws ErroValidacaoException{
        if (valor_unitario_compra > 0){
            this.valor_unitario_compra = valor_unitario_compra;
        } else {
        throw new ErroValidacaoException("Valor Unitário Compra Inválido. Insira um valor maior que 0.");
        }    
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) throws ErroValidacaoException{
        if (estoque > 0){
            this.estoque = estoque;
        } else {
        throw new ErroValidacaoException("Estoque Inválido. Insira um valor maior que 0.");
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (this.codproduto != other.codproduto) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }

   
    
    
    
    
}
