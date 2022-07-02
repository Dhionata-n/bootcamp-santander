package Utilites;

import java.util.Date;

public class Movimentacao {

    private String descricao;
    private Date data;
    private Double valor;


    public Movimentacao(String descricao, Double valor) {
        this.descricao = descricao;
        this.data = new Date();
        this.valor = valor;
    }
    @Override
    public String toString(){
        DataUtil dataUtil = new DataUtil();
        String dataFormatada = dataUtil.converterDateParaDataEHora(data);
        return this.descricao+ " \n" + dataFormatada + " - R$ "+this.valor;

    }


    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Date getData() {
        return data;
    }


    public Double getValor() {
        return valor;
    }
}
