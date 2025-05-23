package model;

import java.util.Date;
import java.util.List;

public class Pedido {
    private int ID_pedido;
    private Date data_Pedido;
    private StatusPedido StatusPedido;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private String formaPagamento;

    public Pedido(int ID_pedido, Date data_Pedido, StatusPedido statusPedido, Cliente cliente, List<ItemPedido> itens, String formaPagamento) {
        this.ID_pedido = ID_pedido;
        this.data_Pedido = data_Pedido;
        StatusPedido = statusPedido;
        this.cliente = cliente;
        this.itens = itens;
        this.formaPagamento = formaPagamento;
    }

    public int getID_pedido() {
        return ID_pedido;
    }

    public void setID_pedido(int ID_pedido) {
        this.ID_pedido = ID_pedido;
    }

    public Date getData_Pedido() {
        return data_Pedido;
    }

    public void setData_Pedido(Date data_Pedido) {
        this.data_Pedido = data_Pedido;
    }

    public StatusPedido getStatusPedido() {
        return StatusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        StatusPedido = statusPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public void adicionarItem(Produto  produto, int quantidade) {}
    public void calcularTotal() {}
    public void finalizarPedido() {}
    public void CancelarPedido() {}

    public void Resumo(){}
}

