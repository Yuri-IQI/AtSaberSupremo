
package br.com.unit.saber_supremo;
import java.util.Scanner;

public class Funcionario extends Pessoa {
    
    private int matricula;
    private String setor;
    private String cargo;
    private int nivel;

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Funcionario() {
    }
    

    @Override
    public void cadastrar() {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digie o nome do Funcionario: ");
        setNome(sc.nextLine());
        
        System.out.println("Digite o RG do Funcionario: ");
        setRg(sc.nextLine());
        
        System.out.println("Digite o CPF do Funcionario");
        setCpf(sc.nextLine());
        
        System.out.println("Digite o ano de nascimento do Funcionario: ");
        setAnoNasc(sc.nextInt());
        
        System.out.println("Digite o mes de nascimento do Funcionario: ");
        setMesNasc(sc.nextInt());
        
        System.out.println("Digite o dia de nascimento do Funcionario: ");
        setDiaNasc(sc.nextInt());
        
        System.out.println("Digite o sexo do Funcionario: ");
        setSexo(sc.nextLine());
       
        System.out.println("Digite a matricula do Funcionario: ");
        setMatricula(sc.nextInt());
        
        System.out.println("Digite o setor do Funcionario: ");
        setSetor(sc.nextLine());
        
        System.out.println("Digite o cargo do Funcionario: ");
        setCargo(sc.nextLine());
        
        System.out.println("Digite o nivel do Funcionario: ");
        setNivel(sc.nextInt());
      
 
    }

    @Override
    public void exibir() {
        
        System.out.println("Nome: " + getNome());
        System.out.println("RG: " + getRg());
        System.out.println("CPF: "+ getCpf());
        System.out.println("Data de Nascimento: "+ getDiaNasc() + "/"+ getMesNasc()+ "/"+ getAnoNasc());
        System.out.println("Sexo: "+ getSexo());
        System.out.println("Matricula: " + matricula);
        System.out.println("Setor: " + setor);
        System.out.println("Cargo" + cargo);
        System.out.println("Nivel: "+ nivel);
        
    }
    
    
    
}

