package utilities;

public class Saudacao {
private  String saudacao;
    public String saudacao(Integer hora){
       
        if(hora>=0 && hora <=12){
            saudacao = "Bom dia!!";

        }
        if(hora>12 && hora <18){
            saudacao = "Boa tarde!!";

        }
        if(hora>=18 && hora <23){
            saudacao = "Boa noite!!";

        }


        return this.saudacao;

    }
    
}
