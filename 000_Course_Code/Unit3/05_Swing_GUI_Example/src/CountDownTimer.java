import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;


public class CountDownTimer {

    public static LocalDateTime endOfSchool = LocalDateTime.of(2024, 6, 25, 15, 25, 0);
    public static DateTimeFormatter dft = DateTimeFormatter.ofPattern("hh:mm:ss");

    public static String timeCountdown(LocalDateTime end, LocalDateTime current){        
        long remainingDay = ChronoUnit.DAYS.between(current,end);
        long remainingHour = ChronoUnit.HOURS.between(current,end)%24;
        long remainingMinutes = ChronoUnit.MINUTES.between(current,end)%60;
        long remainingSecond = ChronoUnit.SECONDS.between(current,end)%60;
        String ClockString = String.format("%1$d : %2$d : %3$d : %4$d", remainingDay, remainingHour, remainingMinutes, remainingSecond);
        return ClockString;
    }

    public static void main(String[] args) throws Exception {
        //Variables
        LocalDateTime current;
        
        //Labels
        JLabel countdown = new JLabel("DD : HH : MM : SS");
        countdown.setForeground(Color.white);
        countdown.setFont(new Font("Arial", Font.BOLD, 50));
        countdown.setHorizontalAlignment(JLabel.CENTER);
        countdown.setVerticalAlignment(JLabel.CENTER);

        JLabel currentTime = new JLabel("The Current Time Is");
        currentTime.setForeground(Color.white);
        currentTime.setHorizontalAlignment(JLabel.CENTER);
        currentTime.setVerticalAlignment(JLabel.CENTER);

        //Panels
        JPanel upperPanel = new JPanel();   
        upperPanel.setBackground(Color.GRAY);
        upperPanel.setBounds(0, 0, 500, 100);
        upperPanel.setLayout(new BorderLayout());

        JPanel middlePanel = new JPanel();
        middlePanel.setBackground(Color.BLACK);
        middlePanel.setBounds(0, 100, 500, 200);
        middlePanel.setLayout(new BorderLayout());

        JPanel lowerPanel = new JPanel();
        lowerPanel.setBackground(Color.GRAY);
        lowerPanel.setBounds(0, 300, 500, 100);
        lowerPanel.setLayout(new BorderLayout());

        JPanel statusPanel = new JPanel();
        statusPanel.setBackground(Color.GRAY);
        statusPanel.setBounds(0, 400, 500, 100);
        statusPanel.setLayout(new BorderLayout());                   
        
        //Set main frame for the app
        Root root = new Root();
        root.add(upperPanel);
        root.add(middlePanel);
        root.add(lowerPanel);
        root.add(statusPanel);
        middlePanel.add(countdown);       
        upperPanel.add(currentTime);

        while (true) {            
            current = LocalDateTime.now();
            String currentTimeString = String.format("Current Time Is: %s", current.format(dft));
            // currentTime.setText(current.format(dft));
            currentTime.setText(currentTimeString);
            countdown.setText(timeCountdown(endOfSchool, current));
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch(Exception e){
                System.out.println(e.fillInStackTrace());
            }            
        }
        
    }
}
