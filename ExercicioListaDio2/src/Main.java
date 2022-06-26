import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> investigacao = new ArrayList<>();
        List<String> question = new ArrayList<>();
        question.add("Telefonou para a vítima ?");
        question.add("Esteve no local do crime ?");
        question.add("Mora perto da vítima ?");
        question.add("Devia para a vítima ?");
        question.add("Já trabalhou com a vítima ?");

        for(int i = 0; i<question.size();i++){
            System.out.println(question.get(i));
            investigacao.add(i,sc.next());
        }
        int cont =0;
        for(int i = 0; i<question.size();i++){
           if(investigacao.get(i).contains("s")||investigacao.get(i).contains("S")){
               cont++;
            };
        }
        if(cont <3){
            System.out.println("Supeito");
        }
        else if(cont>=3 && cont<=4){
            System.out.println("Cumplice");
        }
        else if(cont>4){
            System.out.println("Assasino");
        }
        else{
            System.out.println("Inocente");
        }



        System.out.println(investigacao);






    }
}