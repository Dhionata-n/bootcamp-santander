import model.Gato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Dada uma lista com 7 notas  de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6] faça:

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List <Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas);
        System.out.println();
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
        System.out.println();
        System.out.println("Adicionar a lista a nota 8.0 na posição 4");
        System.out.println();
        notas.add(4, 8d);
        System.out.println();
        System.out.println(notas);
        System.out.println();
        System.out.println("Substitua a nota 5 pela nota 6");
        System.out.println();
        notas.set(notas.indexOf(5d),6d);
        System.out.println(notas);
        System.out.println();
        System.out.println("Confira se a nota 5 está na lista: " + notas.contains(5d) );
        System.out.println();
        System.out.println("Informe todas as notas na ordem que foram informadas: ");
        System.out.println();
        for (Double nota : notas
        ) System.out.println(nota);
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas);
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;

        while (iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma das notas: " + soma);

        System.out.println("Exiba a media das notas: " + soma/notas.size());
        System.out.println();
        notas.remove(0d);
        System.out.println("Remova a nota Zero:"  + "\n" + notas);
        System.out.println();
        System.out.println("Remova as notas menores que 7 e exiba na lista: ");
        System.out.println();

        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()){
            double next = iterator2.next();
            if(next<7) iterator2.remove();
        }
        System.out.println(notas);
        System.out.println("Apague toda lista: ");
        notas.clear();
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());


        //Criar uma lista para exibir o nome-idade-cor de gatos contendo os gatos abaixo:
        /** Gato 1 = nome: Jon, idade: 18, cor: preto;
         *  Gato2 = nome: Simba, idade: 6, cor: tigrado;
         *  Gato3 = nome: Jon, idade: 12, cor: amarelo;

         */

        List<Gato> gatos = new ArrayList<>();
        gatos.add(new Gato("Jon", 18, "preto"));
        gatos.add(new Gato("Simba", 6, "tigrado"));
        gatos.add(new Gato("Jon", 12, "amarelo"));
        System.out.println(gatos);

        System.out.println("--\tOrdem de inserção\t---");
        System.out.println(gatos);
        System.out.println("--\tOrdem aleatoria\t---");
        Collections.shuffle(gatos);
        System.out.println(gatos);
        System.out.println("--\tOrdem natural\t---");
        Collections.sort(gatos);

        System.out.println(gatos);
        Collections.sort(gatos,new Gato.ComparatorIdade());
        System.out.println(gatos);
        Collections.sort(gatos,new Gato.ComparatorCor());
        System.out.println(gatos);
        Collections.sort(gatos,new Gato.ComparatorNomeIdadeCor());
        System.out.println(gatos);










    }
}