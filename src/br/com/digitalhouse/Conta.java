package br.com.digitalhouse;

public abstract class Conta {
    private Cliente novoCliente;
    protected double saldo = 0;

    public abstract void depositar(double deposito);

    public abstract void sacar(double saque);

    public abstract void consultar();



}
