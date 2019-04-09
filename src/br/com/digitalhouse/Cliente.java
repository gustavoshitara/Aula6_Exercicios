package br.com.digitalhouse;

public class Cliente {
    private int numero;
    private String sobrenome;
    private int rg;
    private int cpf;

    public int getNumero(){return numero;}
    public void setNumero(int novoNumero){
        numero = novoNumero;
    }

    public String getSobrenome(){return sobrenome;}
    public void setSobrenome(String novoSobrenome){
        sobrenome = novoSobrenome;
    }

    public int getRg(){return rg;}
    public void setRg(int novoRg){
        rg = novoRg;
    }

    public int getCpf(){return cpf;}
    public void setCpf(int novoCpf){
        cpf = novoCpf;
    }
}
