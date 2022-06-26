package br.com.dio.model;

import java.util.Objects;

public class Gato {

    private String name;
    private String color;
    private Integer ager;

    public Gato() {
    }

    public Gato(String name, String color, Integer ager) {
        this.name = name;
        this.color = color;
        this.ager = ager;
    
    }

    @Override
    public String toString() {
        return "Gato{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", ager=" + ager +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(name, gato.name) && Objects.equals(color, gato.color) && Objects.equals(ager, gato.ager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, ager);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAger() {
        return ager;
    }

    public void setAger(Integer ager) {
        this.ager = ager;
    }
}
