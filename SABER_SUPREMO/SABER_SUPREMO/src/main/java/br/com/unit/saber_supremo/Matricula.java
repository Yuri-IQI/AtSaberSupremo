
package br.com.unit.saber_supremo;


// Matricula.java
import java.util.Date;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    private Date dataMatricula;
    private boolean ativa;

    public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataMatricula = new Date(); // Data atual
        this.ativa = true; // A matrícula é ativa por padrão
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public String toString() {
        return "Matrícula{" +
                "aluno=" + aluno.getNome() +
                ", curso=" + curso.getNome() +
                ", dataMatricula=" + dataMatricula +
                ", ativa=" + ativa +
                '}';
    }
}
