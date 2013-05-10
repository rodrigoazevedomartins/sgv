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
    
    public Endereco(int cod, String arua, int anumero, String acomplemento, String abairro, String acidade, int acep, String aestado, String apais, Pessoa apessoa){
        codendereco = cod;
        rua = arua;
        numero = anumero;
        complemento = acomplemento;
        bairro = abairro;
        cidade = acidade;
        cep = acep;
        estado = aestado;
        pais = apais;
        pessoa = apessoa;
    }
    
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

    public void setCodendereco(int codendereco) throws ErroValidacaoException{
        if (codendereco > 0){
            this.codendereco = codendereco;    
        } else {
            throw new ErroValidacaoException("Código Endereço Inválido. Insira um código maior que 0.");
        }
        
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) throws ErroValidacaoException{
        if ((rua.length() >= 3) && (rua.length() <= 250)){
            this.rua = rua;
        } else {
            throw new ErroValidacaoException("Rua Inválida. Insira uma rua com no minimo 3 caracteres e com no máximo 250 caracteres.");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws ErroValidacaoException {
        if (numero > 0) {
            this.numero = numero;
        } else {
            throw new ErroValidacaoException("Número Inválido. Insira um número maior que 0.");
        }
    }
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) throws ErroValidacaoException {
        if ((complemento.length() >= 3) && (complemento.length() <= 250)){ 
            this.complemento = complemento;
        } else {
            throw new ErroValidacaoException("Complemento Inválido. Insira um complemento com no minimo 3 caracteres e com no máximo 250 caracteristicas.");
        }
    }
    
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) throws ErroValidacaoException{
        if ((bairro.length() >= 3) && (bairro.length() <= 250)){    
            this.bairro = bairro;
        } else {
            throw new ErroValidacaoException("Baiiro Inválido. Insira um bairro com no minimo 3 caracteres e com no máximo 250 caracteristicas.");
        } 
    }
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) throws ErroValidacaoException {
        if ((cidade.length() >= 3) && (cidade.length() <= 250)){
            this.cidade = cidade;    
        } else {
            throw new ErroValidacaoException("Cidade Inválida. Insira uma cidade com no minimo 3 caracteres e com no máximo 250 caracteristicas.");
        }
        
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

    public void setEstado(String estado) throws ErroValidacaoException{
        if ((estado.length()>=3) && (estado.length() <= 250)){
            this.estado = estado;
        } else {
            throw new ErroValidacaoException("Estado Inválido. Insira um estado com no minimo 3 caracteres e com no máximo 250 caracteristicas.");
        }
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) throws ErroValidacaoException{
        if ((pais.length()>=3) && (pais.length() <= 250)){
            this.pais = pais;
        } else {
            throw new ErroValidacaoException("País Inválido. Insira um país com no minimo 3 caracteres e com no máximo 250 caracteristicas.");
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
        return "Endereco{" + "codendereco=" + codendereco + ", rua=" + rua + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", cep=" + cep + ", estado=" + estado + ", pais=" + pais + ", pessoa=" + pessoa + '}';
    }
    
    
    
}