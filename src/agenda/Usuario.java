package agenda;

import java.sql.Date;

public class Usuario {
    /*`id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `senha` TEXT NOT NULL,
  `nascimento` DATE NOT NULL,
  `endereco` VARCHAR(45) NOT NULL,
  `telefone` BIGINT(11) NOT NULL,
  `email` VARCHAR(100) NOT NULL,*/
    
    private int id;
    private String nome;
    private String senha;
    private Date nascimento;
    private String endereco;
    private int telefone;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
