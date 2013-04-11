/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DomainModel;

/**
 *
 * @author Rodrigo
 */
public class Endereco {
    
    private int codendereco;
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private int cep;
    private String estado;
    private String pais;
    private Pessoa pessoa;
    
    public Endereco(){
        codendereco = 0;
        rua = "";
        numero = 0;
        complemento = "";
        bairro = "";
        cidade = "";
        cep = 0;
        estado = "";
        pais = "";
        
    }
    
    public int getCodendereco() {
        return codendereco;
    }

    public void setCodendereco(int codendereco) {
        this.codendereco = codendereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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
        final Endereco other = (Endereco) obj;
        if (this.codendereco != other.codendereco) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Endereco{" + "codendereco=" + codendereco + ", rua=" + rua + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", cep=" + cep + ", estado=" + estado + ", pais=" + pais + ", pessoa=" + pessoa + '}';
    }
    
    
    
}