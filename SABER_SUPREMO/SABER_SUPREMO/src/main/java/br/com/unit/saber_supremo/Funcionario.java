
package br.com.unit.saber_supremo;


public class Funcionario extends Pessoa {
    
    private int matricula;
    private String setor;
    private String cargo;
    private int nivel;

    public Funcionario(String nome, String rg, String cpf, int anoNasc, int mesNasc, int diaNasc, String sexo, int matricula, String setor, String cargo, int nivel) {
        super(nome, rg, cpf, anoNasc, mesNasc, diaNasc, sexo);
        this.matricula = matricula;
        this.setor = setor;
    }

    @Override
    public void cadastrar() {
     
    }

    @Override
    public void exibir() {
        
        System.out.println("Nome: " + getNome());
        System.out.println("RG: " + getRg());
        System.out.println("CPF: "+ getCpf());
        System.out.println("Data de Nascimento: "+ getDiaNasc() + "/"+ getMesNasc()+ "/"+ getAnoNasc());
        System.out.println("Sexo: "+ getSexo());
        System.out.println("");
        
    }
    
    
    
}
