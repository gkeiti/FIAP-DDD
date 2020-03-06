package br.com.fiap.modelo;

public class Curso {
    private String nome;
    private String cargaHoraria;
    private String tipo;
    private Disciplina disciplinas;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDisciplinas() {
        return disciplinas.getAll();
    }

    public void setDisciplinas(Disciplina disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getAll() {
        return "Nome: " + this.nome + 
        "\nCarga Horária: " + this.cargaHoraria + 
        "\nTipo: " + this.tipo + 
        "\n\nDisciplinas: " + this.disciplinas.getAll();
    }

    public void setAll(String nome, String cargaHoraria, String tipo, Disciplina disciplina) { 
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.tipo = tipo;
        this.disciplinas = disciplina;
    }
}