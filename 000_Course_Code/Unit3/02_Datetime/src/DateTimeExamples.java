
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeExamples {

    public static int schoolDayCount(LocalDate start, LocalDate end){
        int count = 0; //initialize day count to zero
        int difference = (int) start.until(end, ChronoUnit.DAYS);
        LocalDate date = start;
        for (int i = 0; i < difference; i++){
            if (date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY){
                
                System.out.print(count);
                System.out.print(" - ");
                System.out.print(date);
                System.out.print(" - ");
                System.out.println(date.getDayOfWeek());
                count++;               
                date = date.plusDays(1);
            }else{
                date = date.plusDays(1);               
            }
        }
        return count;
    } 

    public static void main(String[] args) throws Exception {

        LocalDate today = LocalDate.now();
        LocalDate classStart = LocalDate.of(2024, 02,1);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
       
        System.out.print("Today's Date Is: ");
        System.out.println(today.format(dtf));

        //Print Days Since Start of Class
        long sinceClassStart = classStart.until(today, ChronoUnit.DAYS); 
        System.out.printf("There have been %d DAYS since the start of class\n", sinceClassStart);
        System.out.printf("...OR %d DAYS not including weekends\n", schoolDayCount(classStart, today));
    }
}



 