/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DomainModel;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.text.SimpleDateFormat;
/**
 *
 * @author Rodrigo
 */
public class Pessoa {
    private int codpessoa;
    private String nome;
    private String nomepai;
    private String nomemae;
    private String rg;
    private int cpf;
    private Date datanasc;
    private String naturalidade;
    private List<Endereco> enderecos;
    private List<Email> emails;
    private List<Telefone> telefones;
    
    public Pessoa(){
        codpessoa = 0;
        nome = "";
        nomepai = "";
        nomemae = "";
        rg = "";
        cpf = 0;
        datanasc = new Date();
        naturalidade = "";
        enderecos = new LinkedList<Endereco>();
        emails = new LinkedList<Email>();
        telefones = new LinkedList<Telefone>();
    }
    
    public int getCodpessoa() {
        return codpessoa;
    }

    public void setCodpessoa(int codpessoa) {
        this.codpessoa = codpessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception{
        if ((nome.length() >= 3) && (nome.length() <= 250)){
            this.nome = nome;
        } else {
        throw new Exception("Nome Inválido. Insira um nome com no minimo 3 caracteres e com no máximo 250 caracteres.");
        }
    }

    public String getNomepai() {
        return nomepai;
    }

    public void setNomepai(String nomepai) {
        this.nomepai = nomepai;
    }

    public String getNomemae() {
        return nomemae;
    }

    public void setNomemae(String nomemae) {
        this.nomemae = nomemae;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Date getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(Date datanasc) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataminima = sdf.parse("01/01/1900"); //converte a string em data
        
        if (datanasc.after(dataminima)){
            this.datanasc = datanasc;
        } else {
            throw new Exception("Data de Nascimento Inválida. Insira uma data superior ou igual a 01/01/1900.");
        }
    }
    
    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
    
    public void addEmails(Email ema){
        if(!emails.contains(ema)){
            emails.add(ema);
        }
    }
    
    public void removeEmails(Email ema){
        if(emails.contains(ema)){
            emails.remove(ema);
        }
    }
    
    public void addEnderecos(Endereco end){
        if(!enderecos.contains(end)){
            enderecos.add(end);
        }
    }
    
    public void removeEnderecos(Endereco end){
        if(enderecos.contains(end)){
            enderecos.remove(end);
        }
    }
    
    public void addTelefones(Telefone tel){
        if(!telefones.contains(tel)){
            telefones.add(tel);
        }
    }
    
    public void removeTelefones(Telefone tel){
        if(telefones.contains(tel)){
            telefones.remove(tel);
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
        final Pessoa other = (Pessoa) obj;
        if (this.codpessoa != other.codpessoa) {
            return false;
        }
        return true;
    }

    

   @Override
    public String toString() {
        return "Pessoa{" + "codpessoa=" + codpessoa + ", nome=" + nome + ", nomepai=" + nomepai + ", nomemae=" + nomemae + ", rg=" + rg + ", cpf=" + cpf + ", datanasc=" + datanasc + ", naturalidade=" + naturalidade + ", enderecos=" + enderecos + ", emails=" + emails + ", telefones=" + telefones + '}';
    }
    
    
    

}