package utilities;

public class Emprestimo {

    private double totalAPagar;
    
    public Float emprestimo (Double valorSolicitado, Integer qntParcela){
        // de 1 a 6 parcelas 25 %juros, de 7 a 12 parcelas 50% de juros, de 13 a 24 200% de juros
        if(qntParcela <= 6 ){
            totalAPagar =   valorSolicitado + valorSolicitado*0.25;
        }
        if(qntParcela >6 &&  qntParcela <=12 ){
            totalAPagar =   valorSolicitado + valorSolicitado*0.5;

        }
        if(qntParcela >12 &&  qntParcela <=24 ){
            totalAPagar =   valorSolicitado + valorSolicitado*2;
        }

        return (float) this.totalAPagar;


    }
    
}
