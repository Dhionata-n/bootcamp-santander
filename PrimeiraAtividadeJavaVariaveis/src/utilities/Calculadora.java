package utilities;

public class Calculadora {
    private float calculo;
    
    public Float calculadora(float valor1, float valor2, int operacao){
        // 1 = soma, 2 = divisao, 3 = multiplicação, 4 = subtração
        if(operacao == 1 ){
    calculo = valor1 + valor2;

        }
        if(operacao == 2 ){
            calculo = valor1 / valor2;
        
                }
        if(operacao == 3 ){
                    calculo = valor1 * valor2;
                
                        }
        if(operacao == 4 ){
                            calculo = valor1 - valor2;
                        
                                }

        return this.calculo;
    }
}
