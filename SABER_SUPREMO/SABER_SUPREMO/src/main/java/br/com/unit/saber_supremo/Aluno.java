
package br.com.unit.saber_supremo;

public class Aluno extends Pessoa{
    
    private int codigo;
    private String interesse;
    private double desconto;

    public Aluno(String nome, String rg, String cpf, int anoNasc, int mesNasc, int diaNasc, String sexo, int codigo, String interesse, double desconto) {
        super(nome, rg, cpf, anoNasc, mesNasc, diaNasc, sexo);
        this.codigo = codigo;
        this.interesse = interesse;
        this.desconto = desconto;
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
        System.out.println("Codigo: "+ codigo);
        System.out.println("Interesse: "+ interesse);
        System.out.println("Desconto: "+ desconto);
        
       
    }
    
}
