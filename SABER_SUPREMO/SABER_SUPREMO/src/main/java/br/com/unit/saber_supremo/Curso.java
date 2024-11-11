package br.com.unit.saber_supremo;

public class Curso {
    private String titulo;
    private String descricao;
    private Double valor;
    private String sala;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Curso(String titulo, String descricao, Double valor, String sala) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.valor = valor;
        this.sala = sala;
    }
    
    public void exibirCurso() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Descricao: " + this.descricao);
        System.out.println("Valor: " + this.valor);
        System.out.println("Sala: " + this.sala);
    }
    
    public void calcularNumMinAluno() {
        double professorSalario = 8568.43;
        double valorCurso = 865.23;
        int minAlunos = (int) Math.ceil(professorSalario / valorCurso);
        System.out.println("Número mínimo de alunos: " + minAlunos);
    }
}
