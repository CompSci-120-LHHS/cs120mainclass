public class InterfaceExample {
    
    //Create a method that take an ICombustionSource object as an argument
    public static void burnIt(ICombustionSource source){
        source.burn();    
    }
    public static void main(String[] args) throws Exception {
        
        //Charcoal implements both IWritingInstument and ICombustionSources
        //So it can call the burnIt method without sharing a superclass with paper

        Charcoal charcoal = new Charcoal();
        charcoal.burn();
        burnIt(charcoal);
        System.out.println(ICombustionSource.igniteTemp); //access interface attributes
    
        FireWood campfire = new FireWood();
        campfire.burn();
        System.out.println(campfire.woodType);

    
    }
}
