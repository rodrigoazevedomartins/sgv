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
public class VendaProduto {
    private int codvendaproduto;
    private int quantidade;
    private double valor_unitario;
    private Produto produto;
    private Venda venda;

    public VendaProduto(int cod, int qtde, double valor, Produto vpproduto, Venda vpvenda){
        codvendaproduto = 0;
        quantidade = qtde;
        valor_unitario = valor;
        produto = vpproduto;
        venda = vpvenda;
    }
    
    public VendaProduto(){
        codvendaproduto = 0;
        quantidade = 0;
        valor_unitario = 0;
    }

    public int getCodvendaproduto() {
        return codvendaproduto;
    }

    public void setCodvendaproduto(int codvendaproduto) throws ErroValidacaoException{
        if (codvendaproduto > 0){
            this.codvendaproduto = codvendaproduto;
        } else {
            throw new ErroValidacaoException("Código VendaProduto Inválido. Insira um código maior que 0.");
        }
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) throws ErroValidacaoException{
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            throw new ErroValidacaoException("Quantidade Inválida. Insira uma quantidade maior que 0.");
        }
    }

    public double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(double valor_unitario) throws ErroValidacaoException{
        if (valor_unitario > 0){
            this.valor_unitario = valor_unitario;
        } else {
        throw new ErroValidacaoException("Valor Unitário Inválido. Insira um valor maior que 0.");
        }
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final VendaProduto other = (VendaProduto) obj;
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (Double.doubleToLongBits(this.valor_unitario) != Double.doubleToLongBits(other.valor_unitario)) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        if (!Objects.equals(this.venda, other.venda)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + codvendaproduto;
    }
    
    
    
    
    
    
    
    }
