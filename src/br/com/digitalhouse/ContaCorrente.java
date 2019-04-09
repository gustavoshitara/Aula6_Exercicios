package br.com.digitalhouse;

public class ContaCorrente extends Conta{
    private double limite;
    private Cheque novoCheque;

    public ContaCorrente(double novoLimite){
        limite = novoLimite;
    }

    @Override
    public void depositar(double deposito) {
        saldo = saldo + deposito;
    }

    public double depositarCheque(Cheque novoCheque.valor)

}
