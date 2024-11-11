package br.com.unit.saber_supremo;

public class Coordenador extends Professor {
    private String area;
    private Double plusSalario;

    public Coordenador(String formacao, String nivelProfessor, String disciplina, String nome, String rg, String cpf, 
                       int anoNasc, int mesNasc, int diaNasc, String sexo, int matricula, String setor, 
                       String cargo, int nivelFuncionario, String area) {
        super(formacao, nivelProfessor, disciplina, nome, rg, cpf, anoNasc, mesNasc, diaNasc, sexo, matricula, setor, cargo, nivelFuncionario);
        this.area = area;
        this.plusSalario = 0.0;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Double getPlusSalario() {
        return plusSalario;
    }

    public void setPlusSalario(Double plusSalario) {
        this.plusSalario = plusSalario;
    }

    public void cadastrarCoordenadorProf(String area, Double salarioBase) {
        this.area = area;
        this.calcularPlusSalario(salarioBase);
    }

    @Override
    public void exibir() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Area de atuação: " + this.area);
        System.out.println("Salario com Plus: " + this.plusSalario);
    }

    public void calcularPlusSalario(Double salarioBase) {
        this.plusSalario = salarioBase + (salarioBase * 0.15);
    }
}
