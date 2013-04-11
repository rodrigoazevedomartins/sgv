/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DomainModel;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
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

    public void setNome(String nome) {
        this.nome = nome;
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

    public void setDatanasc(Date datanasc) {
        this.datanasc = datanasc;
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
    
    

}
