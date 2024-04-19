public class FireWood implements ICombustionSource{

    public String woodType = "cedar";

    public void FireWood(){}; //empty constructor
    
    public void FireWood(String woodtype){ 
        this.woodType = woodtype;
    };

    

    public void burn(){
        System.out.println("Firewood is burning");
        };
    public void extinguish(){
        System.out.println("Firewood is now out");
    };

}
