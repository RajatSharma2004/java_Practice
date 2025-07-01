public class Operator {
    public static void main(String[] args) {

        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println();

        // Assignment Operators
        int c = a; // simple assignment
        c += 2;    // c = c + 2
        System.out.println("Assignment Operators:");
        System.out.println("c after += 2: " + c);
        c *= 3;
        System.out.println("c after *= 3: " + c);
        System.out.println();

        // Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println();

        // Logical Operators
        System.out.println("Logical Operators:");
        System.out.println("(a > 0 && b > 0): " + (a > 0 && b > 0));
        System.out.println("(a > 0 || b < 0): " + (a > 0 || b < 0));
        System.out.println("!(a > b): " + !(a > b));
        System.out.println();

        // Unary Operators
        int x = 5;
        System.out.println("Unary Operators:");
        System.out.println("x = " + x);
        System.out.println("++x = " + (++x));
        System.out.println("x++ = " + (x++));
        System.out.println("x after x++ = " + x);
        System.out.println("--x = " + (--x));
        System.out.println();

        // Ternary Operator
        System.out.println("Ternary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b is: " + max);
        System.out.println();

        // Bitwise Operators
        System.out.println("Bitwise Operators:");
        int p = 6, q = 3;
        System.out.println("p & q = " + (p & q));
        System.out.println("p | q = " + (p | q));
        System.out.println("p ^ q = " + (p ^ q));
        System.out.println("~p = " + (~p));
        System.out.println("p << 1 = " + (p << 1));
        System.out.println("p >> 1 = " + (p >> 1));
        System.out.println();

        // instanceof Operator
        System.out.println("instanceof Operator:");
        String str = "Java";
        System.out.println("str instanceof String: " + (str instanceof String));
    }
}


