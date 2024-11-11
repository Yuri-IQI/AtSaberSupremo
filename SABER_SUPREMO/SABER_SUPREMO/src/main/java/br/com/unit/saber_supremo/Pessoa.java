
package br.com.unit.saber_supremo;


abstract class Pessoa {
    
    private String nome;
    private String rg;
    private String cpf;
    private int anoNasc;
    private int mesNasc;
    private int diaNasc;
    private String sexo;

    public Pessoa(String nome, String rg, String cpf, int anoNasc, int mesNasc, int diaNasc, String sexo) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.anoNasc = anoNasc;
        this.mesNasc = mesNasc;
        this.diaNasc = diaNasc;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }

    public int getDiaNasc() {
        return diaNasc;
    }

    public void setDiaNasc(int diaNasc) {
        this.diaNasc = diaNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public abstract void cadastrar();
    
    public abstract void exibir();
    
 
    
    
}
