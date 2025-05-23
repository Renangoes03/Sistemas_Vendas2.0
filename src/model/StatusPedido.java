package model;

public enum StatusPedido {
    aberto ("ABERTO"),
    finalizado ("FINALIZADO"),
    cancelado ("CANCELADO");

    private String statusPedido;
    private StatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }
}
