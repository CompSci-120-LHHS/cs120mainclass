import java.util.Scanner; //imports the package from java API
import java.io.File; //imports File class
import java.io.FileNotFoundException;

public class ScannerFIle {
    public static void main(String[] args) throws FileNotFoundException {
        //Declare variables used in the program
        int num1;
        double num2;
        String name;
        
        //Initialize a scanner object
        File fileToRead = new File("input.txt");
        Scanner inputFile = new Scanner(fileToRead);

        //Read Input From keyboard
        System.out.print("The following text was read from your file: ");
        num1 = inputFile.nextInt(); 
        System.out.print("Age: " + num1); 
        num2 = inputFile.nextDouble();
        System.out.print("PI: " + num2); 
        name = inputFile.next();
        System.out.print("Name: " + name);
        inputFile.close();
    }
}
