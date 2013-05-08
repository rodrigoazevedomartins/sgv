/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.InterfaceUsuario;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Rodrigo
 */
@Entity
@Table(name = "produto", catalog = "sgv", schema = "")
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.findByCodproduto", query = "SELECT p FROM Produto p WHERE p.codproduto = :codproduto"),
    @NamedQuery(name = "Produto.findByNome", query = "SELECT p FROM Produto p WHERE p.nome = :nome"),
    @NamedQuery(name = "Produto.findByDescricao", query = "SELECT p FROM Produto p WHERE p.descricao = :descricao"),
    @NamedQuery(name = "Produto.findByValorUnitarioVenda", query = "SELECT p FROM Produto p WHERE p.valorUnitarioVenda = :valorUnitarioVenda"),
    @NamedQuery(name = "Produto.findByValorUnitarioCompra", query = "SELECT p FROM Produto p WHERE p.valorUnitarioCompra = :valorUnitarioCompra"),
    @NamedQuery(name = "Produto.findByEstoque", query = "SELECT p FROM Produto p WHERE p.estoque = :estoque")})
public class Produto implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codproduto")
    private Integer codproduto;
    @Column(name = "nome")
    private String nome;
    @Column(name = "descricao")
    private String descricao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor_unitario_venda")
    private Double valorUnitarioVenda;
    @Column(name = "valor_unitario_compra")
    private Double valorUnitarioCompra;
    @Column(name = "estoque")
    private Integer estoque;

    public Produto() {
    }

    public Produto(Integer codproduto) {
        this.codproduto = codproduto;
    }

    public Integer getCodproduto() {
        return codproduto;
    }

    public void setCodproduto(Integer codproduto) {
        Integer oldCodproduto = this.codproduto;
        this.codproduto = codproduto;
        changeSupport.firePropertyChange("codproduto", oldCodproduto, codproduto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public Double getValorUnitarioVenda() {
        return valorUnitarioVenda;
    }

    public void setValorUnitarioVenda(Double valorUnitarioVenda) {
        Double oldValorUnitarioVenda = this.valorUnitarioVenda;
        this.valorUnitarioVenda = valorUnitarioVenda;
        changeSupport.firePropertyChange("valorUnitarioVenda", oldValorUnitarioVenda, valorUnitarioVenda);
    }

    public Double getValorUnitarioCompra() {
        return valorUnitarioCompra;
    }

    public void setValorUnitarioCompra(Double valorUnitarioCompra) {
        Double oldValorUnitarioCompra = this.valorUnitarioCompra;
        this.valorUnitarioCompra = valorUnitarioCompra;
        changeSupport.firePropertyChange("valorUnitarioCompra", oldValorUnitarioCompra, valorUnitarioCompra);
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        Integer oldEstoque = this.estoque;
        this.estoque = estoque;
        changeSupport.firePropertyChange("estoque", oldEstoque, estoque);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codproduto != null ? codproduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.codproduto == null && other.codproduto != null) || (this.codproduto != null && !this.codproduto.equals(other.codproduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.tads.trabalholtp3.InterfaceUsuario.Produto[ codproduto=" + codproduto + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
