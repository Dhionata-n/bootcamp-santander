package Utilites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
    public String converterDateParaDataEHora(Date date) {
        SimpleDateFormat teste = new SimpleDateFormat("dd/MM/yyy HH:mm");


        return teste.format(date);


    }

    public String converterDateParaData(Date date) {
        SimpleDateFormat teste = new SimpleDateFormat("dd/MM/yyy");


        return teste.format(date);


    }

    public String converterDateParaHora(Date date) {
        SimpleDateFormat teste = new SimpleDateFormat("HH:mm");


        return teste.format(date);

    }
}
