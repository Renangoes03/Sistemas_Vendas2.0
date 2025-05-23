package model;

import java.util.List;

public class CarrinhoCompras {
    private int ID_carrinho_Compras;
    private Cliente cliente;
    private List<ItemPedido> itens;

    public CarrinhoCompras( int ID_carrinho_Compras, Cliente cliente,  List<ItemPedido> itens) {
        this.ID_carrinho_Compras = ID_carrinho_Compras;
        this.cliente = cliente;
        this.itens = itens;
    }

    public int getID_carrinho_Compras() {
        return ID_carrinho_Compras;
    }

    public void setID_carrinho_Compras(int ID_carrinho_Compras) {
        this.ID_carrinho_Compras = ID_carrinho_Compras;
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
    public void adicionarItem(Produto produto, int quantidade) {}
    public void removerItem(Produto produto, int quantidade) {}
    public void limpar(){}
    public double getTotal(){return 0;}
    public void setTotal(double valor_Unitario) {}
    public void finalizarCarrinho(Pedido pedido) {}
}

