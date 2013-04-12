/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DomainModel;

import java.util.Objects;

/**
 *
 * @author Rodrigo
 */
public class Usuario extends Pessoa{
    private int codusuario;
    private String usuario;
    private String senha;
    private Pessoa pessoa;

    public Usuario() {
        codusuario = 0;
        usuario = "";
        senha = "";   
    }
        
    public int getCodusuario() {
        return codusuario;
    }

    public void setCodusuario(int codusuario) {
        this.codusuario = codusuario;
    }

    public String getNomeUsuario() {
        return usuario;
    }

    public void setNomeUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenhaUsuario() {
        return senha;
    }

    public void setSenhaUsuario(String senha) {
        this.senha = senha;
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
        final Usuario other = (Usuario) obj;
        if (this.codusuario != other.codusuario) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "codusuario=" + codusuario + ", usuario=" + usuario + ", senha=" + senha + ", pessoa=" + pessoa + '}';
    }


}
