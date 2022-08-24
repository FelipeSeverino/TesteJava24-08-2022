package testeJunior;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class Questao1_Data {
    public static void main(String[] args) {
        String data = "01/05/2018";

        System.out.println(convertData(data));

    }

    public static String convertData(String data) {
        SimpleDateFormat formatoDeRetorno = new SimpleDateFormat("yyyy MM");

        List<SimpleDateFormat> formatosData = new ArrayList<SimpleDateFormat>();
        formatosData.add(new SimpleDateFormat("dd/MM/yyyy"));
        formatosData.add(new SimpleDateFormat("dd MM yyyy"));
        formatosData.add(new SimpleDateFormat("ddMMyyyy"));
        formatosData.add(new SimpleDateFormat("yyyy MM dd"));

        for (SimpleDateFormat formato : formatosData) {
            try {
                return formatoDeRetorno.format(formato.parse(data)).toString();
            } catch (ParseException pe) {
            }
        }
        return null;
    }
}

