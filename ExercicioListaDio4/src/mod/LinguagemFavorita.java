package mod;

import java.util.Comparator;
import java.util.Objects;

public class LinguagemFavorita implements Comparator<LinguagemFavorita> {

    private String nome;
    private Integer anoDeCriacao;
    private  String ide;

    public LinguagemFavorita() {
    }

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {


        return linguagem1.getIde().compareTo(linguagem2.getIde());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome) && anoDeCriacao.equals(that.anoDeCriacao) && ide.equals(that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }
    public static class ComparatorNome implements Comparator<LinguagemFavorita>{


        @Override
        public int compare(LinguagemFavorita s1, LinguagemFavorita s2) {
            int nome = s1.getNome().compareTo(s2.getNome());
            return nome;


        }
    }
    public static class ComparatorIde implements Comparator<LinguagemFavorita>{


        @Override
        public int compare(LinguagemFavorita s1, LinguagemFavorita s2) {
            int ide = s1.getIde().compareTo(s2.getIde());
            return ide;


        }
    }
    public static class ComparatorAnoNome implements Comparator<LinguagemFavorita>{


        @Override
        public int compare(LinguagemFavorita s1, LinguagemFavorita s2) {
            int ano = Integer.compare(s1.getAnoDeCriacao(),s2.getAnoDeCriacao());
            if(ano!= 0) return ano;

            int nome = s1.getNome().compareTo(s2.getNome());
            return nome;



        }
    }

    public static class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita>{


        @Override
        public int compare(LinguagemFavorita s1, LinguagemFavorita s2) {
            int nome = s1.getNome().compareTo(s2.getNome());
            if(nome!= 0)return nome;
            int ano = Integer.compare(s1.getAnoDeCriacao(),s2.getAnoDeCriacao());
            if(ano!= 0) return ano;

            int ide = s1.getIde().compareTo(s2.getIde());
            return ide;



        }
    }
}



