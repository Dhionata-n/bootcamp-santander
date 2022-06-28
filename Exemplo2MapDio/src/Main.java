import utilites.Livros;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Criar uma lista de livros e ordenar
        // Autor: Hawking, Stephen - Livro: Uma breve Historia do Tempo - Páginas: 256
        // Autor: Duhigg, Charles - Livro: O poder do hábito - Páginas: 408
        // Autor: Harari, Yuval Noah - Livro: 21 Lições para o Século 21 - Páginas: 432

        System.out.println("--\tOrdem aleatória--\t--");
        Map<String, Livros> livros = new HashMap<>(){{
            put("Hawking, Stephen", new Livros(" Uma breve Historia do Tempo", 256));
            put("Duhigg, Charles", new Livros(" O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livros(" 21 Lições para o Século 21", 432));

        }};
        for (Map.Entry<String, Livros> livro:livros.entrySet()
             ) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
            
        }

        System.out.println("--\tOrdem inserção--\t--");
        Map<String, Livros> livros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livros(" Uma breve Historia do Tempo", 256));
            put("Duhigg, Charles", new Livros(" O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livros(" 21 Lições para o Século 21", 432));

        }};
        for (Map.Entry<String, Livros> livro:livros1.entrySet()
        ) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        }

        System.out.println("Ordem alfabetica autores: ");
        System.out.println();
        Map<String, Livros> livros2 = new TreeMap<>(livros1);
        for (Map.Entry<String, Livros> livro:livros2.entrySet()
        ) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        }
        System.out.println();
        System.out.println("Nome do livro");
        Set<Map.Entry<String, Livros>> livros3 = new TreeSet<>( new Livros.comparatorNome());
        livros3.addAll(livros2.entrySet());
        for (Map.Entry<String, Livros> livro:livros3
        ) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        }
        System.out.println();
        System.out.println("Numero de paginas");

        Set<Map.Entry<String, Livros>> livros4 = new TreeSet<>( new Livros.comparatorPaginas());
        livros4.addAll(livros2.entrySet());
        for (Map.Entry<String, Livros> livro:livros4
        ) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaganinas()+" pgs");

        }



    }
}