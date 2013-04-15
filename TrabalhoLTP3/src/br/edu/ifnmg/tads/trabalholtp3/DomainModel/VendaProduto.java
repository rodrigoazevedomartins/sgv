/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DomainModel;

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

    public VendaProduto(){
        codvendaproduto = 0;
        quantidade = 0;
        valor_unitario = 0;
    }

    public int getCodvendaproduto() {
        return codvendaproduto;
    }

    public void setCodvendaproduto(int codvendaproduto) {
        this.codvendaproduto = codvendaproduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(double valor_unitario) throws Exception{
        if (valor_unitario > 0){
            this.valor_unitario = valor_unitario;
        } else {
        throw new Exception("Valor Unitário Inválido. Insira um valor maior que 0.");
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
    public String toString() {
        return "VendaProduto{" + "codvendaproduto=" + codvendaproduto + ", quantidade=" + quantidade + ", valor_unitario=" + valor_unitario + ", produto=" + produto + ", venda=" + venda + '}';
    }
    
    
    
    }
