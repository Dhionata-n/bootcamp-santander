import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> temperatura = new ArrayList<>();

        for(int i =0; i<6;i++){
            System.out.println("Informe a temperatura do Mês "+ (i+1) + " :" );
            temperatura.add(i,sc.nextDouble());

        }
        Iterator<Double> iterator =temperatura.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            double next =iterator.next();
            soma +=next;
        }
        double media = soma/6;
        System.out.printf("A média de temperatura foi de: %.2f",media);
        System.out.print("ºC");
        System.out.println();
        System.out.println("Os meses que tiveram temperatura acima da média foram: ");
        for(int i =0; i<6;i++){
           if(temperatura.get(i)>media) {
               if (i == 0) System.out.println(" Mês "+(i + 1) + "  Janeiro " + temperatura.get(i) + "ºC");
               if (i == 1) System.out.println(" Mês "+(i + 1) + " Fevereiro " + temperatura.get(i) + "ºC");
               if (i == 2) System.out.println(" Mês "+(i + 1) + "  Março " + temperatura.get(i) + "ºC");
               if (i == 3) System.out.println(" Mês "+(i + 1) + "  Abril " + temperatura.get(i) + "ºC");
               if (i == 4) System.out.println(" Mês "+(i + 1) + "  Maio " + temperatura.get(i) + "ºC");
               if (i == 5) System.out.println(" Mês "+(i + 1) + "  Junho " + temperatura.get(i) + "ºC");
           };
        }






    }
}