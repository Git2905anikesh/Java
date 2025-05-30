import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter the first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number (b): ");
        double b = scanner.nextDouble();

        // Display operation options
        System.out.println("Choose an operation:");
        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo)");

        // Input operation
        System.out.print("Enter the operation number (1-5): ");
        int operation = scanner.nextInt();

        // Calculate and display result
        switch (operation) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                if (b != 0) {
                    System.out.println("Result: " + (a % b));
                } else {
                    System.out.println("Error: Modulo by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation selected.");
        }

        scanner.close();
    }
}

