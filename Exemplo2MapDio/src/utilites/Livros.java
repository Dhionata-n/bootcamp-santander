package utilites;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class Livros {
    private String nome;
    private Integer paganinas;

    public Livros() {
    }

    public Livros(String nome, Integer paganinas) {
        this.nome = nome;
        this.paganinas = paganinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaganinas() {
        return paganinas;
    }

    public void setPaganinas(Integer paganinas) {
        this.paganinas = paganinas;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", paganinas=" + paganinas +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livros livros = (Livros) o;
        return nome.equals(livros.nome) && paganinas.equals(livros.paganinas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paganinas);
    }

    public static class comparatorNome implements Comparator<Map.Entry<String, Livros>>{

        @Override
        public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
            return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
        }
    }
    public static class comparatorPaginas implements Comparator<Map.Entry<String, Livros>>{

        @Override
        public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
            return Integer.compare(l1.getValue().getPaganinas(),l2.getValue().getPaganinas());
        }
    }
}
