
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SistemaAcademico extends JFrame {
    private List<Aluno> alunos;
    private List<Funcionario> funcionarios;
    private Curso curso;

    public SistemaAcademico() {
        alunos = new ArrayList<>();
        funcionarios = new ArrayList<>();
        curso = new Curso(865.23);

        setTitle("Sistema Acadêmico");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 1));

        JButton btnCadastrarAluno = new JButton("Cadastrar Aluno");
        JButton btnCadastrarFuncionario = new JButton("Cadastrar Funcionário");
        JButton btnCalcularSalarioFuncionario = new JButton("Calcular Salário de Funcionário");
        JButton btnCalcularSalarioCoordenador = new JButton("Calcular Salário do Coordenador");
        JButton btnCalcularMinimoAlunos = new JButton("Calcular Mínimo de Alunos");
        JButton btnSair = new JButton("Sair");

        add(btnCadastrarAluno);
        add(btnCadastrarFuncionario);
        add(btnCalcularSalarioFuncionario);
        add(btnCalcularSalarioCoordenador);
        add(btnCalcularMinimoAlunos);
        add(btnSair);

        btnCadastrarAluno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarAluno();
            }
        });

        btnCadastrarFuncionario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarFuncionario();
            }
        });

        btnCalcularSalarioFuncionario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularSalarioFuncionario();
            }
        });

        btnCalcularSalarioCoordenador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularSalarioCoordenador();
            }
        });

        btnCalcularMinimoAlunos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularMinimoAlunos();
            }
        });

        btnSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void cadastrarAluno() {
        String nome = JOptionPane.showInputDialog("Nome do Aluno:");
        String idadeStr = JOptionPane.showInputDialog("Idade do Aluno:");
        int idade = Integer.parseInt(idadeStr);
        Aluno aluno = new Aluno(nome, idade);
        alunos.add(aluno);
        JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!");
    }

    private void cadastrarFuncionario() {
        String nome = JOptionPane.showInputDialog("Nome do Funcionário:");
        String idadeStr = JOptionPane.showInputDialog("Idade do Funcionário:");
        int idade = Integer.parseInt(idadeStr);
        String nivel = JOptionPane.showInputDialog("Nível do Funcionário (A, B, C, D, E):");
        Funcionario funcionario = new Funcionario(nome, idade, nivel);
        funcionarios.add(funcionario);
        JOptionPane.showMessageDialog(this, "Funcionário cadastrado com sucesso!");
    }

    private void calcularSalarioFuncionario() {
        String nome = JOptionPane.showInputDialog("Nome do Funcionário:");
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                JOptionPane.showMessageDialog(this, "Salário do Funcionário " + nome + ": R$ " + funcionario.calcularSalario());
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Funcionário não encontrado.");
    }

    private void calcularSalarioCoordenador() {
        String nome = JOptionPane.showInputDialog("Nome do Coordenador:");
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Coordenador && funcionario.getNome().equalsIgnoreCase(nome)) {
                JOptionPane.showMessageDialog(this, "Salário do Coordenador " + nome + ": R$ " + funcionario.calcularSalario());
