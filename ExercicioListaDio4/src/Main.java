import mod.LinguagemFavorita;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ordem de inserção: ");
        Set<LinguagemFavorita> minhaLinguagem = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java",1991,"InteliJ"));
            add(new LinguagemFavorita("Python",1990,"PyCharm"));
            add(new LinguagemFavorita("C#",2000,"VS Code"));
        }};
        for (LinguagemFavorita linguagemFavorita:minhaLinguagem) System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        System.out.println();
        System.out.println();
        System.out.println("Ordem Natural");
        Set<LinguagemFavorita> minhaLinguagem2 = new TreeSet<>( new LinguagemFavorita.ComparatorNome());
            minhaLinguagem2.addAll(minhaLinguagem);
        for (LinguagemFavorita linguagemFavorita:minhaLinguagem2) System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());

        System.out.println();
        System.out.println();
        System.out.println("Ordem Ide");
        Set<LinguagemFavorita> minhaLinguagem3 = new TreeSet<>( new LinguagemFavorita.ComparatorIde());
        minhaLinguagem3.addAll(minhaLinguagem);
        for (LinguagemFavorita linguagemFavorita:minhaLinguagem3) System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());

        System.out.println();
        System.out.println();

        System.out.println("Ano e Nome");
        Set<LinguagemFavorita> minhaLinguagem4 = new TreeSet<>( new LinguagemFavorita.ComparatorAnoNome());
        minhaLinguagem4.addAll(minhaLinguagem);
        for (LinguagemFavorita linguagemFavorita:minhaLinguagem4) System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());

        System.out.println();
        System.out.println();

        System.out.println("Nome, Ano e Ide");
        Set<LinguagemFavorita> minhaLinguagem5 = new TreeSet<>( new LinguagemFavorita.ComparatorNomeAnoIde());
        minhaLinguagem5.addAll(minhaLinguagem);
        for (LinguagemFavorita linguagemFavorita:minhaLinguagem5) System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());

        System.out.println();
        System.out.println();



    }
}