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
    
    public Email(int cod, String aendereco, Pessoa apessoa){
        codemail = cod;
        endereco = aendereco;
        pessoa = apessoa;
    }
    
    public Email(){
        codemail = 0;
        endereco = "";
    }
       
    public int getCodemail() {
        return codemail;
    }

    public void setCodemail(int codemail) throws ErroValidacaoException{
        if (codemail > 0) {
            this.codemail = codemail;
        } else {
            throw new ErroValidacaoException("Código Email Inválido. Insira um código maior que 0.");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) throws ErroValidacaoException{
        if ((endereco.length() >=3) && (endereco.length() <=250)){
            this.endereco = endereco;
        } else {
            throw new ErroValidacaoException("Email Inválido. Insira um email com no minimo 3 caracteres e com no máximo 250 caracteristicas.");
        }
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    } 

    @Override
    public String toString() {
        return "Email{" + "codemail=" + codemail + ", endereco=" + endereco + ", pessoa=" + pessoa + '}';
    }
    
    
}
