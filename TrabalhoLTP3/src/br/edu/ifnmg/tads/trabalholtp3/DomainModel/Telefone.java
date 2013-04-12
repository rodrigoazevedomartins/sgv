/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DomainModel;

/**
 *
 * @author Rodrigo
 */
public class Telefone {
    private int codtelefone;
    private int area;
    private int numero;
    private Pessoa pessoa;

    public Telefone(){
        codtelefone = 0;
        area = 0;
        numero = 0;
    }
    
    public int getCodtelefone() {
        return codtelefone;
    }

    public void setCodtelefone(int codtelefone) {
        this.codtelefone = codtelefone;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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
        final Telefone other = (Telefone) obj;
        if (this.codtelefone != other.codtelefone) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Telefone{" + "codtelefone=" + codtelefone + ", area=" + area + ", numero=" + numero + ", pessoa=" + pessoa + '}';
    }
    
    
    
}
