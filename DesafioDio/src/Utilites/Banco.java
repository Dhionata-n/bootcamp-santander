package Utilites;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private ArrayList<Conta> contas;

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
