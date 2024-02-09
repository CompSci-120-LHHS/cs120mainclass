public class TextFormat {
    public static void main(String[] args) throws Exception {

        /*---------------------EXAMPLE-1 START -------------------- */
        // // //This Example demonstrates the format() method for composing strings by inputing str vars  
        // // //Declare variables used in the program
        // int num1 = 2;
        // double num2 = 1.02e8;
        // String name = "Venus";

        // String phrase = String.format("The planet %2$s is the %1$d'nd from the sun, at a distance of %3$e km", num1, name, num2); 
        // //%2$s can be read as: Take the second variable in the list (%2) and format as a string ($s)...See Table in the lecture notes        
        // System.out.println(phrase);
        
        /*---------------------EXAMPLE-1 END -------------------- */


        /*---------------------EXAMPLE-2 START -------------------- */
        // // //This Example demonstrates the printf() method for composing strings by inputing str vars  
        // // //Declare variables used in the program
        // int num1 = 2;
        // double num2 = 1.02e8;
        // String name = "Venus";

        // String phrase = "The planet %2$s is the %1$d'nd from the sun, at a distance of %3$e km"; 
        // //%2$s can be read as: Take the second variable in the list (%2) and format as a string ($s)...See Table in the lecture notes        
        // System.out.printf(phrase, num1, name, num2);
        
        /*---------------------EXAMPLE-2 END -------------------- */


        /*---------------------EXAMPLE-3 START -------------------- */
        // //This Example demonstrates simple concatentation and is a less elegant way of composing larger strings  
        // //Declare variables used in the program
        // int num1 = 2;
        // double num2 = 1.02e8;
        // String name = "Venus";

        // String phrase = "The planet " + name + " is the " + num1 + "'nd from the sun, at a distance of " + num2 + " km";                 
        // System.out.print(phrase);
        
        /*---------------------EXAMPLE-3 END -------------------- */


        /*---------------------EXAMPLE-4 START -------------------- */
        // //This Example demonstrates several string methods  
        // //Declare variables used in the program
        // String exampleString = "LHHS-499 Cliffe Street-Fredericton";
                      
        // System.out.println(exampleString.length());  //returns int equal to number of char in string
        // System.out.println(exampleString.toLowerCase());
        // System.out.println(exampleString.toUpperCase());
        // System.out.println(exampleString.indexOf("Fredericton")); //returns starting position of matching string
        // System.out.println(exampleString.substring(0,4)); //Slices a string according to index values

        // //Spliting String Based on Delimiters ""
        // int start = exampleString.indexOf("-");
        // String nextSegment = exampleString.substring(start+1);
        // int next = nextSegment.indexOf("-");
        // String school = exampleString.substring(0, start);
        // String address = exampleString.substring((start+1), (next+start+1));
        // String city = exampleString.substring((next+start+2));
        // System.out.printf("1: %1$s\n2: %2$s \n3: %3$s",school, address,city);

        /*---------------------EXAMPLE-4 END -------------------- */

    }
}
