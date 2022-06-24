import java.util.Scanner;

import utilities.Calculadora;
import utilities.Emprestimo;
import utilities.Saudacao;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();
        float valor1, valor2;
        int tipo;
        float calculo;
        String operacao = " " ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        valor1 = sc.nextFloat();
        System.out.println("Informe o segundo valor: ");
        valor2 = sc.nextFloat();
        System.out.println("Informe a operação (1) = Soma, (2) = Divisão, (3) = Multiplicação, (4) = Subtração ");
        tipo = sc.nextInt();
        if(tipo == 1){
            operacao = "Soma";
        }
        if(tipo == 2){
            operacao = "Divisão";
        }
        if(tipo == 3){
            operacao = "Multiplicação";
        }
        if(tipo == 4){
            operacao = "Subtração";
        }
        
       calculo = calculadora.calculadora(valor1, valor2, tipo);

        System.out.println("O resultado da Operação: " + operacao + " é: "+ calculo);

        Saudacao saudacao = new Saudacao();
        System.out.println();
        int horas;
        System.out.println("Informe as horas: ");
        horas = sc.nextInt();

        String comprimento = saudacao.saudacao(horas);

        System.out.println(comprimento);

        System.out.println();

        double valorSolicitado;
        int qntParcela;
        System.out.println("Informe o valor do emprestimo que deseja contratar: ");
        valorSolicitado = sc.nextDouble();
        System.out.println("Informe a quantidade de parcelas: de 1 a 6 25% de juros, de 7 a 12 50% de 13 a 24 200%");
        qntParcela = sc.nextInt();

        Emprestimo emprestimo = new Emprestimo();

        double totalAPagar = emprestimo.emprestimo(valorSolicitado, qntParcela);
        double parcelas = totalAPagar/qntParcela;

        System.out.println("O valor solicitado foi de: R$ " + valorSolicitado + "\n"+
        "****************************************" +"\n"+ 
        "O valor total a pagar é de R$: " + totalAPagar+"\n"
        + " Em "+ qntParcela+" parcela (s) de R$ "+ parcelas);

        
    }
}
