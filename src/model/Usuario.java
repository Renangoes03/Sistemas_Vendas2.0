package model;

import java.util.Date;

public class Usuario {
    private  int ID_usuario;
    private  String nome;
    private  String apelido;
    private  String senha;
    private  Date dataNasc;
    private  String perfil;
    private  Cliente cliente;

    public Usuario( String nome, String senha, String perfil, Cliente cliente, Date dataNasc, int ID_usuario, String apelido ) {
        this.nome = nome;
        this.senha = senha;
        this.perfil = perfil;
        this.cliente = cliente;
        this.dataNasc = dataNasc;
        this.ID_usuario = ID_usuario;
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getID_usuario() {
        return ID_usuario;
    }

    public void setID_usuario(int ID_usuario) {
        this.ID_usuario = ID_usuario;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void login(){}
    public void logout(){}
}
