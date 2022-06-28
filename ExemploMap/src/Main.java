

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Map<String, Double> carros = new HashMap(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 16.1);
            put("Kwid", 15.6);

        }};

        System.out.println(carros);
        System.out.println();
        System.out.println("Substitua o consumo do gol por 15,2 km/l");
        carros.put("Gol", 15.2);
        System.out.println(carros);
        System.out.println("Confira se o modelo tucson esta dentro da lista: " + carros.containsKey("Tucson"));
        System.out.println();
        System.out.println("Exiba o consumo do Uno: " + carros.get("Uno"));
        System.out.println();
        System.out.println("Exiba os modelos: ");
        System.out.println();
        System.out.println(carros.keySet());
        System.out.println("Exiba os consumos dos carros: ");
        System.out.println(carros.values());
        System.out.println("Consumo mais eficiente : ");
        System.out.println(Collections.max(carros.values()));
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String eficiente = "";
        for (Map.Entry<String, Double> entry:entries
             ) {
            if(entry.getValue().equals(Collections.max(carros.values()))){
                eficiente = entry.getKey();
                System.out.println("O modelo mais eficiente é : " + eficiente + " Ele faz : " + Collections.max(carros.values()) + " Km/l");
            }
            
        }
        System.out.println("Modelo menos eficiente: ");

        for (Map.Entry<String, Double> entry:entries
        ) {
            if(entry.getValue().equals(Collections.min(carros.values()))){
                eficiente = entry.getKey();
                System.out.println("O modelo menos eficiente é : " + eficiente + " Ele faz : " + Collections.min(carros.values()) + " Km/l");
            }

        }
        Iterator<Double> iterator = carros.values().iterator();
        Double soma= 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Soma dos valores: " + soma);
        System.out.printf("Exiba a media: %.2f%n", soma/ carros.size());
        System.out.println("Remova os modelos que o consumo seja = 16.1");
        Iterator<Double> iterator1 = carros.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next().equals(16.1)) iterator1.remove();
        }
        System.out.println(carros);
        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carros1 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 16.1);
            put("Kwid", 15.6);

        }};

        System.out.println(carros1);
        System.out.println();
        System.out.println("Exiba os carros ordenado pelo Modelo");
        Map<String, Double> carros2 = new TreeMap<>(carros1);
        System.out.println();
        System.out.println(carros2);
        System.out.println();
        System.out.println("Apague os carros: ");
        carros.clear();
        System.out.println("Carros apagados: " + carros.isEmpty());

    }
}