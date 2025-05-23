package model;

import java.util.Date;

public class Pagamento {
    private int ID_Pagamento;
    private Pedido pedido;
    private double valorPago;
    private String formaPagamento;
    private Date dataPagamento;

    public Pagamento(int ID_Pagamento, Pedido pedido, double valorPago, String formaPagamento, Date dataPagamento) {
        this.ID_Pagamento = ID_Pagamento;
        this.pedido = pedido;
        this.valorPago = valorPago;
        this.formaPagamento = formaPagamento;
        this.dataPagamento = dataPagamento;
    }

    public int getID_Pagamento() {
        return ID_Pagamento;
    }

    public void setID_Pagamento(int ID_Pagamento) {
        this.ID_Pagamento = ID_Pagamento;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    public void resumoPagamento(){}
}
