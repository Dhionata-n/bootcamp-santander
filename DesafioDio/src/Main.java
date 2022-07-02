import Utilites.Cliente;
import Utilites.Conta;
import Utilites.ContaCorrente;
import Utilites.ContaPoupanca;

import javax.swing.event.CaretListener;

public class Main {
    public static void main(String[] args) {

      Cliente cliente = new Cliente();
      cliente.setNome("Dhionatan");
      Conta cc = new ContaCorrente(cliente);
      Conta poupanca = new ContaPoupanca(cliente);
      cc.imprimirExtrato();
      poupanca.imprimirExtrato();
      cc.depositar(50d);
      poupanca.depositar(1000d);
      cc.imprimirExtrato();
      poupanca.imprimirExtrato();
      poupanca.sacar(500d);
      cc.transferir(25d,poupanca);
      cc.imprimirExtrato();
      poupanca.imprimirExtrato();



    }
}