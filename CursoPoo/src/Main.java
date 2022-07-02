import entites.Carro;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String modelo, cor;
        int capacidade;
        double precoGasolina;
        System.out.println("Informe o Modelo do carro: ");
        modelo = sc.next();
        System.out.println("Informe a cor do Carro: ");
        cor = sc.next();
        System.out.println("Informe a capacidade maxima: ");
        capacidade = sc.nextInt();
        System.out.println("Informe o preço da galosina: ");
        precoGasolina = sc.nextDouble();
        Carro carro = new Carro(cor,modelo,capacidade);
        System.out.println("O valor para encher o tanque do carro: " + carro.getModelo() + " Cor: " +carro.getCor() + " é de R$ " + carro.totalParaEncherOTanque(precoGasolina));

    }
}