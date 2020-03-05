
public class Disciplina {
    private String nome;
    private String cargaHoraria;
    private String ementa;
    private Professor professor;

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

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getProfessor() {
        return professor.getAll();
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getAll() {
        return "Nome: " + nome +
        "\nCarga Horária: " + cargaHoraria +
        "\nEmenta: " + ementa +
        "\n\nProfessor: " + professor.getAll();
    }

    public void setAll(String nome, String cargaHoraria, String ementa, Professor professor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.ementa = ementa;
        this.professor = professor;
    }
}