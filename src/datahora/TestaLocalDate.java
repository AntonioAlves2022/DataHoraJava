
package datahora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class TestaLocalDate {
    public static void main(String[] args) {
        String strAniver = "23/12/1981";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        LocalDateTime dataAniver = LocalDate
                .parse(strAniver, dtf)
                .atStartOfDay();
        LocalDateTime hoje = LocalDateTime.now();
        
        long diasEntreDatas = ChronoUnit
                .MONTHS
                .between(dataAniver, hoje);
        
        System.out.println("Ja vivi " +(int)diasEntreDatas +" meses");
        
         
    }
}
