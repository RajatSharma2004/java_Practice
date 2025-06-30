import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the operation to be performed + - * / %");  
        String ch = sc.next();

        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        int res = 0;
        Calculator C = new Calculator();

        if (ch.equals("+")) {
            res = C.add(num1, num2);

        } 
        
        else if (ch.equals("-")) {
            res = C.sub(num1, num2);
        }
        
        else if (ch.equals("*")) {
            res = C.multiply(num1, num2);
        } 
        
        else if (ch.equals("/")) {
            if (num2 == 0) {
                System.out.println("Cannot divide by zero");
                sc.close();
                return;
            }
            res = C.divide(num1, num2);
        } 
        
        else if (ch.equals("%")) {
            if (num2 == 0) {
                System.out.println("Cant divide by 0");
                sc.close();
                return;
            }
            res = C.modulus(num1, num2);
        } 
        
        else {
            System.out.println("Enter valid option");
            sc.close();
            return;
        }

        System.out.println(num1 + " " + ch + " " + num2 + " = " + res);
        sc.close();
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int modulus(int a, int b) {
        return a % b;
    }
}
