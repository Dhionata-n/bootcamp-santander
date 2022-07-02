package Utilites;

import Utilites.Interfaces.Operacoes;

import java.util.ArrayList;
import java.util.Date;

public abstract class Conta implements Operacoes {
    protected int agencia;
    protected int numero;
    protected Double saldo = 0d;

    protected ArrayList<Movimentacao> movimentacoes;

    protected Date dataAbertura;
    protected Cliente cliente;
    private static final int AGENCIA_PADRAO = 1 ;
    private static  int SEQUENCIAL = 1 ;


    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero =  SEQUENCIAL++;
        this.cliente = cliente;
        this.dataAbertura = new Date();
        this.movimentacoes = new ArrayList<Movimentacao>();
        Movimentacao movimentacao = new Movimentacao("Abertura de conta", saldo);
        this.movimentacoes.add(movimentacao);

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
       System.out.println("************************************");
       System.out.println();

       DataUtil data = new DataUtil();

       System.out.println("Gerado em: " + data.converterDateParaDataEHora(new Date()) );
       System.out.println();

       for (Movimentacao movimentacao  :this.movimentacoes) {
           System.out.println(movimentacao);
       }
       System.out.println("Saldo atual: " + this.saldo);
       System.out.println();
       System.out.println("************************************");
       System.out.println("************************************");
       System.out.println("************************************");

    }


    @Override
    public void sacar(Double valor) {
        this.saldo -=valor;
        Movimentacao movimentacao = new Movimentacao("Retirada de valor", valor);
        this.movimentacoes.add(movimentacao);
    }

    @Override
    public void depositar(Double valor) {
        this.saldo +=valor;
        Movimentacao movimentacao = new Movimentacao("Deposito", valor);
        this.movimentacoes.add(movimentacao);
    }

    @Override
    public void transferir(Double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    @Override
    public void operacoes(){
        System.out.println("Menu: ");
        System.out.println("Digite a operaçao que deseja realizar: ");
        System.out.println("Deposito - Opção 1");
        System.out.println("Saque - Opção 2");
        System.out.println("Extrato - Opção 3");
        System.out.println("Sair - Opção 4");


    }
}
