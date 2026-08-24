import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter operator: ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int e;
        
        if (operator == '+') {
            e = a + b;
        } else if (operator == '-') {
            e = a - b;
        } else if (operator == '*') {
            e = a * b;
        } else if (operator == '/') {
            e = a / b;
        } else {
            System.out.println("Invalid operator.");
            scanner.close();
            return;
        }   

        System.out.println("The result is: " + e);
        scanner.close();
    }
}