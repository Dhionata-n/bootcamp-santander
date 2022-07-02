package Utilites;

import Utilites.Interfaces.Operacoes;

public abstract class Conta implements Operacoes {
    protected int agencia;
    protected int numero;
    protected Double saldo = 0d;

    protected Cliente cliente;
    private static final int AGENCIA_PADRAO = 1 ;
    private static  int SEQUENCIAL = 1 ;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero =  SEQUENCIAL++;
        this.cliente = cliente;
    }





    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }
   protected void infosComuns() {
       System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Numero da Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println("----------------------");

    }


    @Override
    public void sacar(Double valor) {
        this.saldo -=valor;
    }

    @Override
    public void depositar(Double valor) {
        this.saldo +=valor;
    }

    @Override
    public void transferir(Double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
