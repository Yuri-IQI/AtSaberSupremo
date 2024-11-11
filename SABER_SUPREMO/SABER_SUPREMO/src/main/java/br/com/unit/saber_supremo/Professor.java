package br.com.unit.saber_supremo;

public class Professor extends Funcionario {
    private String formacao;
    private String nivelProfessor;
    private String disciplina;

    public Professor(String formacao, String nivelProfessor, String disciplina, String nome, String rg, String cpf, int anoNasc, int mesNasc, int diaNasc, String sexo, int matricula, String setor, String cargo, int nivelFuncionario) {
        super(nome, rg, cpf, anoNasc, mesNasc, diaNasc, sexo, matricula, setor, cargo, nivelFuncionario);
        this.formacao = formacao;
        this.nivelProfessor = nivelProfessor; 
        this.disciplina = disciplina;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getNivelProfessor() {
        return nivelProfessor;
    }

    public void setNivelProfessor(String nivelProfessor) {
        this.nivelProfessor = nivelProfessor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    @Override
    public void exibir() {
        System.out.println("Formacao: " + this.formacao);
        System.out.println("Nivel do Professor: " + this.nivelProfessor);
        System.out.println("Disciplina: " + this.disciplina);
    }
}
