
package br.com.unit.saber_supremo;
import java.util.Scanner;

public class Aluno extends Pessoa{
    
    private int codigo;
    private String interesse;
    private double desconto;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setInteresse(String interesse) {
        this.interesse = interesse;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    

    @Override
    public void cadastrar(){
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digie o nome do Aluno: ");
        setNome(sc.nextLine());
        
        System.out.println("Digite o RG do Aluno: ");
        setRg(sc.nextLine());
        
        System.out.println("Digite o CPF do Aluno");
        setCpf(sc.nextLine());
        
        System.out.println("Digite o ano de nascimento do Aluno: ");
        setAnoNasc(sc.nextInt());
        
        System.out.println("Digite o mes de nascimento do Aluno: ");
        setMesNasc(sc.nextInt());
        
        System.out.println("Digite o dia de nascimento do Aluno: ");
        setDiaNasc(sc.nextInt());
        
        System.out.println("Digite o sexo do Aluno: ");
        setSexo(sc.nextLine());
       
        System.out.println("Digite o codigo do Aluno: ");
        setCodigo(sc.nextInt());
        
        System.out.println("Digite o interesse do Aluno: ");
        setInteresse(sc.nextLine());
        
        System.out.println("Digite o desconto do Aluno: ");
        setDesconto(sc.nextDouble());
      
        
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

