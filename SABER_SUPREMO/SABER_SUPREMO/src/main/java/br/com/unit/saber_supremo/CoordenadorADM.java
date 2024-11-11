
package br.com.unit.saber_supremo;

public class CoordenadorADM extends Funcionario {
    public CoordenadorADM(String nome, int idade, String nivel) {
        super(nome, idade, nivel);
    }

    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        return salarioBase * 1.135; 
   
    }
}
}
