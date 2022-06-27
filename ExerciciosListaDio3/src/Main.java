import mod.Cores;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Cores cor = new Cores();
        Set<Cores> arcoIris =new TreeSet<>(){{

            add( new Cores("Vermelho"));
            add( new Cores("Laranja"));
            add( new Cores("Amarelo"));
            add( new Cores("Verde"));
            add( new Cores("Azul"));
            add( new Cores("Anil"));
            add( new Cores("Violeta"));



        }};
        System.out.println("Exiba todas as cores uma abaixo da Outra");
        String inverso = " ";
        for (Cores cores:arcoIris
             ){
           inverso = cores +"\n" + inverso;
            System.out.println(cores);}
        System.out.println();
        System.out.println(inverso);

        System.out.println("A quantidade de cores que o arco iris tem: " + arcoIris.size() + " Cores");
        System.out.println();
        Iterator<Cores> iterator = arcoIris.iterator();

        while (iterator.hasNext()){
            String next = String.valueOf(iterator.next());
            if (next.contains("v")||next.contains("V")) System.out.println(next);
            else {iterator.remove();}

        }
        for (Cores cores:arcoIris
        ){

            System.out.println(cores);}

        arcoIris.clear();
        System.out.println("O conjunto foi limpo " + arcoIris.isEmpty());




    }
}