package model;

public class ItemPedido {
    private int ID_itemPedido;
    Produto produto;
    private int quantidade;
    private double valor_Unitario;

    public int getID_itemPedido() {
        return ID_itemPedido;
    }

    public void setID_itemPedido(int ID_itemPedido) {
        this.ID_itemPedido = ID_itemPedido;
    }

    public double getValor_Unitario() {
        return valor_Unitario;
    }

    public void setValor_Unitario(double valor_Unitario) {
        this.valor_Unitario = valor_Unitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public void subtotal(){}
}
