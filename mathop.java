import java.util.Scanner;
public class mathop {
    public static void main(String[] args) {
        //declaring scanner
        Scanner scanner = new Scanner(System.in);
        //Taking user input, converting it into a double
        System.out.println("Pick a number");
        String x = scanner.nextLine();
        double operand1 = Double.parseDouble(x);

        //taking the user input, converting it into a double
        System.out.println("Pick another number larger than the first");
        String y = scanner.nextLine();
        double operand2 = Double.parseDouble(y);

        showResults(operand1, operand2);
    }
    public static void showResults( double num1, double num2) {
        System.out.println(num1 + " plus " + num2 +" equals " + (num1 + num2));
        System.out.println(num1 + " minus " + num2 + " equals " + (num1 - num2));
        System.out.println(num1 + " multiplied by " + num2 + " equals " + (num1 * num2));
        System.out.println(num1 + " divided by " + num2 + " equals " + (num1 / num2));
        System.out.println("The  of " + num1 + " and " + num2 + " equals " + (num1%num2));

    }
}