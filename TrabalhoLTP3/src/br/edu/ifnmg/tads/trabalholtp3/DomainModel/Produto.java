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
        valor_unitario_venda = 0;
        valor_unitario_venda = 0;
        estoque = 0;
    }

    public int getCodproduto() {
        return codproduto;
    }

    public void setCodproduto(int codproduto) {
        this.codproduto = codproduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorunitariovenda() {
        return valor_unitario_venda;
    }

    public void setValorunitariovenda(double valor_unitario_venda) {
        this.valor_unitario_venda = valor_unitario_venda;
    }

    public double getValorunitariocompra() {
        return valor_unitario_compra;
    }

    public void setValorunitariocompra(double valor_unitario_compra) {
        this.valor_unitario_compra = valor_unitario_compra;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
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
        return "Produto{" + "codproduto=" + codproduto + ", nome=" + nome + ", descricao=" + descricao + ", valor_unitario_venda=" + valor_unitario_venda + ", valor_unitario_compra=" + valor_unitario_compra + ", estoque=" + estoque + '}';
    }
    
    
    
    
}
