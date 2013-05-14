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
    
    public Telefone(int cod, int aarea, int anumero, Pessoa apessoa){
        codtelefone = cod;
        area = aarea;
        numero = anumero;
        pessoa = apessoa;
    }
    
    public Telefone(){
        codtelefone = 0;
        area = 0;
        numero = 0;
    }
    
    public int getCodtelefone() {
        return codtelefone;
    }

    public void setCodtelefone(int codtelefone) throws ErroValidacaoException{
        if (codtelefone > 0) {
            this.codtelefone = codtelefone;
        } else {
            throw new ErroValidacaoException("Código Telefone Inválido. Insira um código maior que 0.");
        }
    }
    public int getArea() {
        return area;
    }

    public void setArea(int area) throws ErroValidacaoException{
        if (area > 0){ 
            this.area = area;
        } else {
            throw new ErroValidacaoException("Código Área Inválido. Insira um código maior que 0.");
        } 
            
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws ErroValidacaoException{
        if (numero > 0) {
            this.numero = numero;
        } else {
            throw new ErroValidacaoException("Número Inválido. Insira um número maior que 0.");
        }
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
        if (this.area != other.area) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }
    
    
    @Override
    public String toString() {
        return "Telefone{" + "codtelefone=" + codtelefone + ", area=" + area + ", numero=" + numero + ", pessoa=" + pessoa + '}';
    }
    
    
    
}
