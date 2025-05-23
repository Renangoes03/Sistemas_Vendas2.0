package model;

import java.util.Date;

public class Produto {
    private String ID_produto;
    private String nome_Produto;
    private String descricao;
    private double quantidade;
    private double valor;
    private Date data_Cadastro;

    public Produto(String ID_produto, String nome_Produto, String descricao, double quantidade, double valor, Date data_Cadastro) {
        this.ID_produto = ID_produto;
        this.nome_Produto = nome_Produto;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
        this.data_Cadastro = data_Cadastro;
    }

    public String getID_produto() {
        return ID_produto;
    }

    public void setID_produto(String ID_produto) {
        this.ID_produto = ID_produto;
    }

    public String getNome_Produto() {
        return nome_Produto;
    }

    public void setNome_Produto(String nome_Produto) {
        this.nome_Produto = nome_Produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData_Cadastro() {
        return data_Cadastro;
    }

    public void setData_Cadastro(Date data_Cadastro) {
        this.data_Cadastro = data_Cadastro;
    }

    public void atualizarEstoque( int qtd){}
    public void exibirInformacoes(){}

}
