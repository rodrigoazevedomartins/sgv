/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DomainModel;

/**
 *
 * @author Rodrigo
 */
public class Cliente extends Pessoa {

    private int codcliente;
    private Pessoa pessoa;
    
    public Cliente(int cod, Pessoa apessoa){
        codcliente = cod;
        pessoa = apessoa;
    }
    
    public Cliente(){
        codcliente = 0;
    }

    public int getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(int codcliente) throws ErroValidacaoException{
        if (codcliente > 0){
            this.codcliente = codcliente;
        } else {
            throw new ErroValidacaoException("Código Cliente Inválido. Insira um código maior que 0.");
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
        final Cliente other = (Cliente) obj;
        if (this.codcliente != other.codcliente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getNome();
    }

    

    
    
    
    
    
}
