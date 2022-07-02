package Utilites.Interfaces;

import Utilites.Conta;

public interface Operacoes {
     void sacar(Double valor);
     void depositar(Double valor);
     void transferir(Double valor, Conta contaDestino);

     void imprimirExtrato();

     void operacoes();

}
