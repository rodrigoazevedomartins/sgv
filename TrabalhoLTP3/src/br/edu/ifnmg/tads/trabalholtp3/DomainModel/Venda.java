/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.trabalholtp3.DomainModel;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
public class Venda {
    private int codvenda;
    private Date datavenda;
    private double valortotal;
    private Cliente cliente;
    private Usuario usuario;
    private Pagamento pagamento;
    private List <VendaProduto> produtos;
    
    public Venda(int cod, Cliente acliente, Usuario ausuario, Pagamento apagamento){
        codvenda = cod;
        //datavenda = data;
        cliente = acliente;
        usuario = ausuario;
        pagamento = apagamento;
    }
    
    public Venda(){
        codvenda = 0;
        datavenda = new Date();
        valortotal = 0;
        produtos = new LinkedList<VendaProduto>();
    }

    public int getCodvenda() {
        return codvenda;
    }

    public void setCodvenda(int codvenda) throws ErroValidacaoException{
        if (codvenda > 0){
        this.codvenda = codvenda;
        } else {
            throw new ErroValidacaoException("Código Venda Inválido. Insira um código maior que 0.");
        }
    }
    
    public Date getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(Date datavenda) throws ErroValidacaoException, ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataminima = sdf.parse("31/12/1899"); //converte a string em data
        
        if (datavenda.after(dataminima)){
            this.datavenda = datavenda;
        } else {
            throw new ErroValidacaoException("Data de Venda Inválida. Insira uma data superior ou igual a 01/01/1900.");
        }
    }

    public double getValortotal() {
        return valortotal;
    }

    public void setValortotal(double valortotal) throws ErroValidacaoException{
        if (valortotal > 0){
            this.valortotal = valortotal;
        } else {
            throw new ErroValidacaoException("Valo Total Inválido. Insira um valor maior que 0.");
        }
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public List<VendaProduto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<VendaProduto> produtos) {
        this.produtos = produtos;
    }
    
    public void addProdutos(VendaProduto vp){
        if(!produtos.contains(vp)){
            produtos.add(vp);
            valortotal += (vp.getProduto().getValorunitariovenda() * vp.getQuantidade());
        }
    }
    
    public void removeProdutos(VendaProduto vp){
        if(produtos.contains(vp)){
            produtos.remove(vp);
            valortotal -= (vp.getProduto().getValorunitariovenda() * vp.getQuantidade());
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
        final Venda other = (Venda) obj;
        if (this.codvenda != other.codvenda) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + codvenda;
    }

    
    
    
    
}
