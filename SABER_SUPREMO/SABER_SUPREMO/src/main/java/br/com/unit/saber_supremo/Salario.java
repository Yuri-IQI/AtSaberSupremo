
package br.com.unit.saber_supremo;

public class Salario {
    
    private double salarioBruto;
    private double salarioLiquido;
    private double inss;
    private double irrf;
    private double planoSaude;

    public Salario(double salarioBruto, double salarioLiquido, double inss, double irrf, double planoSaude) {
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
        this.inss = inss;
        this.irrf = irrf;
        this.planoSaude = planoSaude;
    }
    
    
    
    
    public void calcularSalario(){
        
        salarioLiquido = salarioBruto - (inss + irrf + planoSaude);
        
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }
    
}
