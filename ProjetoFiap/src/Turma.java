
public class Turma {
    private String nome;
    private String periodo;
    private String sala;
    private Curso curso;
    private Aluno alunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
    
    public Aluno getAlunos() {
        return alunos;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setAlunos(Aluno alunos) {
        this.alunos = alunos;
    }

    public String getAll() {
        return "Nome: " + this.nome + 
        "\nPeríodo: " + this.periodo +
        "\nSala: " + this.sala + 
        "\n\nCurso: " + this.curso.getAll() +
        "\n\nAlunos: " + this.alunos.getAll();
    }

    public void setAll(String nome, String periodo, String sala, Curso curso, Aluno aluno) {
        this.nome = nome;
        this.periodo = periodo;
        this.sala = sala;
        this.curso = curso;
        this.alunos = aluno;
    }
}