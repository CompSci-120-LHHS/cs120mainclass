import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;


public class DateTimeAdvanced {

    public static LocalDateTime endofSchool;  
    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM:dd:mm:ss");
    
    
    public static String timeRemainingCalculator(LocalDateTime end){        
        LocalDateTime currentDate = LocalDateTime.now(); 
        // long remainingMonth = ChronoUnit.MONTHS.between(currentDate, end);
        long remainingDay = ChronoUnit.DAYS.between(currentDate, end);
        long remainingHour = ChronoUnit.HOURS.between(currentDate, end)%24;
        long remainingMinute = ChronoUnit.MINUTES.between(currentDate, end)%60;
        long remainingSecond = ChronoUnit.SECONDS.between(currentDate, end)%60;



        String clockString = String.format("%1$d : %2$d : %3$d : %4$d (D:H:M:S)", remainingDay, remainingHour, remainingMinute, remainingSecond);
        return clockString;       
    }

    public static void main(String[] args){

        endofSchool = LocalDateTime.of(2024, 6, 25, 3, 25, 0);

        while(true){            
            System.out.println(timeRemainingCalculator(endofSchool));
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch(Exception e){
                System.out.println(e.fillInStackTrace());
            }
        }
    }
}
