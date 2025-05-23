package model;

public class Cliente {
    private int ID_Cliente;
    private String nome;
    private String endereco;
    private String email;
    private String senha;
    private String telefone;
    private String CPF;
    private String fotoPerfil;
    private String dataCadastro;

    public Cliente(){} //Algunf Framework, necessitam de um construtor (objeto) vazio (ex: Hibernate, Spring) Eles exigem um construtor vazio pra instanciar classes
    //Usar serialização (ex: salvar/ler JSON ou XML)	Também precisam de construtor sem parâmetros

    public Cliente(String nome, int ID_Cliente, String endereco, String email, String senha, String telefone, String CPF, String fotoPerfil, String dataCadastro) {
        this.nome = nome;
        this.ID_Cliente = ID_Cliente;
        this.endereco = endereco;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.CPF = CPF;
        this.fotoPerfil = fotoPerfil;
        this.dataCadastro = dataCadastro;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public void editarConta(){}
    //public void alterarEmail(novoEmail: String){}
    //public void alterarTelefone(novoTelefone: String)
    //public void alterarEndereco(novoEndereco: String)
    //public void alterarSenha(novaSenha: String)
    //public void atualizarFoto(caminhoFoto: String)

}
