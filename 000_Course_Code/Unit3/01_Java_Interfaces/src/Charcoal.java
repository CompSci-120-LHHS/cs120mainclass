public class Charcoal implements IWritingInstrument, ICombustionSource{

    public void Charcoal(){};//empty constructor

    public void burn() {
        System.out.println("The charcoal is burning"); 
    }
    public void extinguish() {
        System.out.println("The charcoal is out"); 
    }
     public void drawCircle() {
        System.out.println("The charcoal drew a smudgy circle"); 
    }
     public void drawLine() {
        System.out.println("The charcoal drew a thick line"); 
    }
}
