import java.util.Scanner; //imports the package from java API

public class ScannerInput {
    public static void main(String[] args) throws Exception {
        //Declare variables used in the program
        int num1;
        double num2;
        double sum;
        double product;
        double div;
        String name;
        
        //Initialize a scanner object
        Scanner scan = new Scanner(System.in);

        //Read Input From keyboard
        System.out.print("Hello User, Please Enter An Integer: "); //this will show a prompt in your terminal
        num1 = scan.nextInt(); //This reads the value from the prompt after pressing 'enter'
        System.out.print("Enter a float: "); //this will show a prompt in your terminal
        num2 = scan.nextDouble(); //This reads the value from the prompt after pressing 'enter'
        System.out.print("Enter your name: ");
        name = scan.next(); 

        //Working with the stored input
        sum = num1 + num2;
        product = num1 * num2;
        div = num1 / num2;

        System.out.println("Thank you " + name);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);
        System.out.println("Division of " + num1 + " and " + num2 + " is: " + div);
        scan.close();
    }
}
