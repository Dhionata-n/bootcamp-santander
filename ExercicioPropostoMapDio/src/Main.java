import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Crie um dicionario e relacione os estados e suas populações: ");
        Map<String, Integer> estados = new HashMap(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);

        }};

        System.out.println(estados);
        System.out.println();
        System.out.println("Substitua a população do estado do RN por 3.534.165 ");
        estados.put("RN", 3534165);
        System.out.println();
        System.out.println(estados);
        System.out.println();
        System.out.println("Confira se o estado PB está na lista: " + estados.containsKey("PB") + " Caso false, adicione.");
        System.out.println();
        estados.put("PB", 4039277);
        System.out.println();
        System.out.println(estados);
        System.out.println();
        System.out.println("Exiba a população de PE " + estados.get("PE"));
        System.out.println();
        System.out.println("Exiba todos os estados na ordem em que foi informado: ");
        System.out.println();
        Map<String, Integer> estados1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);

        }};

        System.out.println(estados1);
        System.out.println();
        System.out.println("Exiba todos os estados em ordem Alfabetica: ");
        System.out.println();
        Map<String, Integer> estados2 = new TreeMap<>(estados1);
        System.out.println(estados2);
        System.out.println();
        System.out.println("Exiba o estado com a menor população: " + Collections.min(estados2.values()));
        System.out.println();
        System.out.println("Exiba o estado com a maior população: " + Collections.max(estados2.values()));
        System.out.println();

        Iterator<Integer> iterator = estados.values().iterator();
        int soma = 0;
        while (iterator.hasNext()){
            soma= iterator.next();

        }
        System.out.println("Exiba a soma da população desses estados: " + soma);
        System.out.println();
        System.out.println("Exiba a média da população da lista: " + soma/estados.size());
        System.out.println();
        System.out.println("Remova os estados com população menor que 4.000.000");
        Iterator<Integer> iterator1 = estados.values().iterator();

        while (iterator1.hasNext()){
            int valor = iterator1.next();
           if(valor<4000000) iterator1.remove();

        }

        System.out.println(estados);
        System.out.println();
        System.out.println("Apague a Lista de estados: ");
        estados.clear();
        System.out.println();
        System.out.println("Lista Apagada : " + estados.isEmpty());

    }
}