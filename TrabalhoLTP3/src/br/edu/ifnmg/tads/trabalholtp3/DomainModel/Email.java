/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DomainModel;

/**
 *
 * @author Rodrigo
 */
public class Email {
    
    private int codemail;
    private String endereco;
    private Pessoa pessoa;
    
    public Email(){
        codemail = 0;
        endereco = "";
    }
       
    public int getCodemail() {
        return codemail;
    }

    public void setCodemail(int codemail) {
        this.codemail = codemail;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    } 

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Email other = (Email) obj;
        if (this.codemail != other.codemail) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Email{" + "codemail=" + codemail + ", endereco=" + endereco + ", pessoa=" + pessoa + '}';
    }
    
    
}
