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

    public void setCodpagamento(int codpagamento) throws ErroValidacaoException{
        if(codpagamento > 0){
            this.codpagamento = codpagamento;
        } else {
            throw new ErroValidacaoException("Código Pagamento Inválido. Insira um código maior que 0.");
        }
    }
    public String getNomeTipo() {
        return tipo;
    }

    public void setNomeTipo(String tipo) throws ErroValidacaoException{
        if ((tipo.length() >=3) && (tipo.length() <=250)){
            this.tipo = tipo;
        } else {
            throw new ErroValidacaoException("Tipo Pagamento Inválido. Insira um tipo com no minimo 3 caracteres e com no máximo 250 caracteristicas.");
        }
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
