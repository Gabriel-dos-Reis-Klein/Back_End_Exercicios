package org.estudantes.estudantes;

public class estudante {
    private String nome;
    private int codigo;
    private String curso;
    private String email;
    private String telefone;

    // Construtor vazio (necessário para JSON)
    public estudante() {}

    public estudante(String nome, int codigo, String curso, String email, String telefone) {
        this.nome = nome;
        this.codigo = codigo;
        this.curso = curso;
        this.email = email;
        this.telefone = telefone;
    }

    // Getters e setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}