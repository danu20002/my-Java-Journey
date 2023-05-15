import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class timedate {
    public static void main (String args[]){
      LocalDate India=LocalDate.now();
        System.out.println("The present date in INDIA is :"+India);
        LocalTime Itime=LocalTime.now();
        System.out.println("THE time In INDIA is Right now is :"+Itime);
        LocalDateTime danu=LocalDateTime.now();
        DateTimeFormatter formaut=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
//        String formatdate=danu.format(formaut);
        System.out.println(danu.format(formaut));
        LocalTime amnu=LocalTime.now();
        System.out.println(amnu);
        }
    }

