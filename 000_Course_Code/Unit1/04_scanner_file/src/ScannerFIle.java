import java.util.Scanner; //imports the package from java API
import java.io.File; //imports File class
import java.io.FileNotFoundException; //imports File Exceptions
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ScannerFile {
    public static void main(String[] args) throws FileNotFoundException {
        
        /*---------------------EXAMPLE-1 START -------------------- */
        // //This Example reads a text file line by line and casts variables  
        // //Declare variables used in the program
        // int num1;
        // double num2;
        // String name;
        
        // //Initialize a scanner object
        // File fileToRead = new File("src/input.txt");
        // Scanner inputFile = new Scanner(fileToRead);

        // //Read Input From keyboard
        // System.out.println("The following text was read from your file");
        // System.out.println("*****************************************");
        // num1 = inputFile.nextInt(); 
        // System.out.println("Age: " + num1); 
        // num2 = inputFile.nextDouble();
        // System.out.println("PI: " + num2); 
        // name = inputFile.next();
        // System.out.println("Name: " + name);
        // System.out.println("*****************************************");
        // inputFile.close();
        /*---------------------EXAMPLE-1 END -------------------- */


        
        /*---------------------EXAMPLE-2 START -------------------- */
        // //This Example reads a text file line by line and casts only String objects 
        // //Declare variables used in the program
        // String num1;
        // String num2;
        // String name;
        
        // //Initialize a scanner object
        // File fileToRead = new File("src/input.txt");
        // Scanner inputFile = new Scanner(fileToRead);

        // //Read Input From keyboard
        // System.out.println("The following text was read from your file");
        // System.out.println("*****************************************");
        // num1 = inputFile.next(); 
        // System.out.println("Age: " + num1); 
        // num2 = inputFile.next();
        // System.out.println("PI: " + num2); 
        // name = inputFile.next();
        // System.out.println("Name: " + name);
        // System.out.println("*****************************************");        
        // inputFile.close();
        /*---------------------EXAMPLE-2 END -------------------- */

        /*---------------------EXAMPLE-3 START -------------------- */
        // //This Example Loops over all lines in a text file and numbers them        
        // int lineFile = 0; //initialize first line as zero
        // String lineText = null;
        
        // //Initialize a scanner object
        // FileReader fileToRead = new FileReader("src/longtext.txt");
        // try{
        //     BufferedReader line = new BufferedReader(fileToRead);

        //     while((lineText = line.readLine()) != null){
        //         lineFile++;
        //         System.out.print(lineFile + ": ");
        //         System.out.println(lineText);
        //     }
        //     line.close();

        // }catch(IOException e){
        //     e.printStackTrace();
        // }                
        /*---------------------EXAMPLE-3 END -------------------- */

    }
}
