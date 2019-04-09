package br.com.digitalhouse;

public class ContaPoupanca extends Conta{
    private double taxaJuros;

    public ContaPoupanca(){

    }

    public ContaPoupanca(double novoSaldo, double novaTaxaJuros){
        saldo = novoSaldo;
        taxaJuros = novaTaxaJuros;
    }

    public double getTaxaJuros(){return taxaJuros;}
    public void setTaxaJuros(double novaTaxaJuros){
        taxaJuros = novaTaxaJuros;
    }

    @Override
    public void depositar(double deposito) {
        saldo = saldo + deposito;
    }

    @Override
    public boolean sacar(double saque) {
        saldo = saldo - saque;
    }

    public void recolherJuros() {

    }
}


