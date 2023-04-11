
package datahora;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataHora {

    public static void main(String[] args) {
       Calendar calendario = new GregorianCalendar();
       int ano = calendario.get(Calendar.YEAR);
        System.out.println("Ano: "+ ano);
        int mes = calendario.get(Calendar.MONTH) +1;
        System.out.println("Mes/ano: "+ mes+"/"+ano);
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        String data =  dia+"/"+mes+"/"+ano;
        System.out.println("Dia/Mes/ano: "+ data);
        int indice = calendario.get(Calendar.DAY_OF_WEEK);
        String semana [] = {
            "Dom", "Seg", "Ter", "Qua",
            "Qui", "Sex", "Sab"
        };
        System.out.println("Dia da semana: "+ indice);
        System.out.println("Hoje é : "+ semana[indice -1]);
        
        int hora = calendario.get(Calendar.HOUR);
        int minuto = calendario.get(Calendar.MINUTE);
        int segundo = calendario.get(Calendar.SECOND);
        
        String horario = hora+":"+ minuto+":"+segundo;
        
        if(minuto < 10 ){
            horario = hora+":0"+minuto+":"+segundo;
            if(segundo < 10){
                 horario = hora+":0"+minuto+":0"+segundo;
            }
        }
        
        
        System.out.println("Agora são: "+ horario);
        
        
    }
    
}
