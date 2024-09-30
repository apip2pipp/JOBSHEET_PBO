import java.util.Scanner;

public class taskCalculator_14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        double number1 = sc14.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc14.next().charAt(0);

        System.out.print("Enter the second number: ");
        double number2 = sc14.nextDouble();

        // Processing: Calculate the result based on the operator
        double result = 0;
        boolean hasilValid = true;

        switch (operator) {
            case '+':
                result = add(number1, number2);
                break;
            case '-':
                result = subtract(number1, number2);
                break;
            case '*':
                result = multiply(number1, number2);
                break;
            case '/':
                if (number2 != 0) {
                    result = divide(number1, number2);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    hasilValid = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                hasilValid = false;
                break;
        }

        
        if (hasilValid) {
            System.out.println("The result is: " + result);
        }

    }

    // Function untuk menambahkan
    public static double add(double a, double b) {
        return a + b;
    }

    // Function untuk mengurangi
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function untuk kali angka
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function bagi angka
    public static double divide(double a, double b) {
        return a / b;
    }
}
