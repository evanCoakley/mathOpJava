import java.util.Scanner;
public class mathop {

    public static void main(String[] args) {

        //declaring scanner
        Scanner scanner = new Scanner(System.in);

        //Taking user input, converting it into a double
        System.out.println("Pick a number");
        String x = scanner.nextLine();
        double operand1 = Double.parseDouble(x);

        System.out.println("Pick another number");
        String y = scanner.nextLine();
        double operand2 = Double.parseDouble(y);

        //saving the math in seperate variables
        double sum = (operand1 + operand2);
        double difference = operand1 - operand2;
        double product = operand1 * operand2;
        double quotient = operand1 / operand2;
        double remainder = operand1 % operand2;

        //passing values into method
        showResults(sum, difference, product, quotient, remainder);
    }
    public static void showResults( double sum, double difference, double product, double quotient, double remainder) {
        System.out.println("The sum equals "+ sum);
        System.out.println("The difference  " + difference);
        System.out.println("When multiplied, the product is " + product);
        System.out.println("When divided, the quotient is " + quotient);
        System.out.println("The remainder JUST so happens to be " + remainder);


    }
}