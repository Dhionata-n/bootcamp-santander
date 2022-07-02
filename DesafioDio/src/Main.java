import Utilites.*;
import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.event.CaretListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Observação a opção de transferir existe, porém, ainda estou apredendo como implementa-la, to pensando que a possivel soluçao será gerar
        // as contas e colocar todas em uma Lista e ir alterando as mesmas conforme necessidade.

        Cliente cliente = new Cliente();
        System.out.println("Bem vindo ao banco Dio.me SA ");
        System.out.println("Para Abertura de conta siga os passos Abaixo: ");
        System.out.println("Informe o tipo de conta que deseja Criar: 1 - Poupança | 2 - Conta Corrente");
        int tipoConta = sc.nextInt();
        System.out.println("Informe o nome do Cliente");
        cliente.setNome(sc.next());
        sc.nextLine();

        int numero = 0;
        boolean operacao = true;
        boolean menu = true;

        switch (tipoConta) {

            case 1:
                Conta poupanca = new ContaPoupanca(cliente);
                double valor = 0d;

                while (menu) {
                    poupanca.operacoes();
                    numero = sc.nextInt();
                    operacao = true;


                    while (operacao) {
                        switch (numero) {

                            case 1:
                                System.out.println("Informe o valor do deposito: ");
                                valor = sc.nextDouble();
                                poupanca.depositar(valor);
                                operacao = false;
                                break;
                            case 2:
                                System.out.println("Informe o valor do Saque: ");
                                valor = sc.nextDouble();
                                poupanca.sacar(valor);
                                operacao = false;
                                break;
                            case 3:
                                poupanca.imprimirExtrato();
                                operacao = false;
                                break;
                            case 4:
                                menu = false;
                                operacao = false;
                                break;
                            default:
                                System.out.println("O numero escolhido é invalido, ");
                        }
                    }

                }
                break;


            case 2:
                Conta corrente = new ContaCorrente(cliente);
                while (menu) {
                    corrente.operacoes();
                    numero = sc.nextInt();
                    operacao = true;

                    while (operacao) {
                        switch (numero) {
                            case 1:
                                System.out.println("Informe o valor do deposito: ");
                                valor = sc.nextDouble();
                                corrente.depositar(valor);
                                operacao = false;
                                System.out.println("Deposito realizado com Sucesso!! ");
                                break;
                            case 2:
                                System.out.println("Informe o valor do Saque: ");
                                valor = sc.nextDouble();
                                corrente.sacar(valor);
                                operacao = false;
                                System.out.println("Saque realizado com Sucesso!! ");
                                break;
                            case 3:
                                corrente.imprimirExtrato();
                                operacao = false;
                                break;
                            case 4:
                                menu = false;
                                operacao = false;
                                break;
                            default:
                                System.out.println("O numero escolhido é invalido, ");
                        }

                    }

                }
                break;


        }


    }
}