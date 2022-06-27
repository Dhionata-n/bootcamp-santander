
import mod.Serie;

import java.net.SocketTimeoutException;
import java.text.Format;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas =new HashSet<>(Arrays.asList(7d,8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);
        System.out.println();
        System.out.println("Confira se a nota 5 esta no conjunto: " + notas.contains(5d));
        System.out.println();
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }


        System.out.printf("Exiba a soma dos valores: %.2f%n",
                 soma);
        System.out.printf("Exiba a soma dos valores: %.2f",
                soma/notas.size());
        System.out.println();

        System.out.println("Remova a nota Zero");
        notas.remove(0d);
        System.out.println(notas);

        Iterator<Double> iterator1 = notas.iterator();

        while (iterator1.hasNext()){
          double next = iterator1.next();;
          if (next<7)iterator1.remove();
        }
        System.out.println(notas);
        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        //7d,8.5, 9.3, 5d, 7d, 0d, 3.6
        notas2.add(7d);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba as notas em ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);

        System.out.println(notas3);
        System.out.println("Apague todo conjunto");
        notas.clear();
        System.out.println("Confira se esta fazio: " + notas.isEmpty());
        /*Dadas as seguintes informações sobre minhas séries
        favoritas, crie um conjunto e ordene este conjunto
        exibindo:
        (nome - genero - tempo de espisodio)
        Série 1 = nome: got, genero: fantasia, tempoEpisodio: 60
        Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
        Série 3 = nome: that '70s, genero: comédia, tempoEpisodio: 25
     */
    Set<Serie> minhaSerie = new HashSet<>(){{
        add(new Serie("got","fantasia",60));
        add(new Serie("dark","drama",60));
        add(new Serie("that '70s","comédia",25));
    }};
        for (Serie serie:minhaSerie) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getDuracao());


        System.out.println();
        System.out.println();

        Set<Serie> minhaSerie2 = new LinkedHashSet<>(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("that '70s","comédia",25));
        }};
        for (Serie serie:minhaSerie2) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getDuracao());

        System.out.println();
        Set<Serie> minhaSerie3 = new TreeSet<>(minhaSerie2);
        for (Serie serie:minhaSerie3) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getDuracao());
        System.out.println();
        System.out.println();
        Set<Serie> minhaSerie4 = new TreeSet<>( new Serie.ComparatorNomeGeneroTempo());
                minhaSerie4.addAll(minhaSerie);
        for (Serie serie:minhaSerie4) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getDuracao());

    }


}