import java.awt.Color;
import javax.swing.*;

public class Root extends JFrame{

   public ImageIcon icon = new ImageIcon("LHHS_Logo_64x64.png");

    public Root(){
        
        this.setTitle("LHHS Summer Holiday Countdown");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(Color.GRAY);
        this.setLayout(null);
        this.setVisible(true);
        
    }

}
