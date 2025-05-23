package model;

import java.util.Date;
import java.util.List;

public class Venda {
    private int ID_venda;
    private Date data_venda;
    private double valor;
    private Cliente cliente;
    private List<ItemVenda> itens;

    public Venda(List<ItemVenda> itens, Cliente cliente, double valor, Date data_venda, int ID_venda) {
        this.itens = itens;
        this.cliente = cliente;
        this.valor = valor;
        this.data_venda = data_venda;
        this.ID_venda = ID_venda;
    }

    public int getID_venda() {
        return ID_venda;
    }

    public void setID_venda(int ID_venda) {
        this.ID_venda = ID_venda;
    }

    public Date getData_venda() {
        return data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }
    public void total(){
        float total = 0;
        for (ItemVenda itemVenda : itens) {}
    }
    public void resumoVenda(){}
    public void cancelarVenda(){}
}
