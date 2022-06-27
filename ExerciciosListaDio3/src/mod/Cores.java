package mod;

import java.util.Objects;

public class Cores implements Comparable<Cores> {

    private String cores;

    public Cores() {
    }

    public Cores(String cores) {
        this.cores = cores;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cores cores1 = (Cores) o;
        return cores.equals(cores1.cores);
    }

    @Override
    public String toString() {
        return "{" +
                cores + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(cores);
    }

    @Override
    public int compareTo(Cores cores) {
        return this.getCores().compareTo(cores.getCores());

    }
}
