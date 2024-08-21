package Function;
public class Product_Sum {
    // Method to print "Hello World"
    public static void printHelloWorld() {
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
    }
    // Method to calculate sum of two numbers
    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum; // Missing return statement added
    }
    // Method to multiply two numbers
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        // Swap values of a and b
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
        // Calculate and print product
        int prod = multiply(a, b);
        System.out.println("a * b = " + prod);
        // Calculate and print sum
        int sum = calculateSum(a, b);
        System.out.println("a + b = " + sum);
        // Print "Hello World" three times
        printHelloWorld();
    }
}
