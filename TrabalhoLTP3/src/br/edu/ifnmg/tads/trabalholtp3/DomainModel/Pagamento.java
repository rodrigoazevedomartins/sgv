/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DomainModel;

/**
 *
 * @author Rodrigo
 */
public class Pagamento {

    private int codpagamento;
    private String tipo;
    
    public Pagamento(){
        codpagamento = 0;
        tipo = "";
    }

    public int getCodpagamento() {
        return codpagamento;
    }

    public void setCodpagamento(int codpagamento) {
        this.codpagamento = codpagamento;
    }

    public String getNomeTipo() {
        return tipo;
    }

    public void setNomeTipo(String tipo) {
        this.tipo = tipo;
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
        final Pagamento other = (Pagamento) obj;
        if (this.codpagamento != other.codpagamento) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pagamento{" + "codpagamento=" + codpagamento + ", tipo=" + tipo + '}';
    }
    
    
}
