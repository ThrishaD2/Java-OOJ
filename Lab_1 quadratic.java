import java.util.*;

class Quadratic {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter coefficient of a:");
        double a = input.nextDouble();
        
        // Handling the case where 'a' is zero
        if (a == 0) {
            System.out.println("This is not a quadratic equation (a cannot be zero).");
            return; // Exit the program as the equation is invalid
        }
        
        System.out.println("Enter coefficient of b:");
        double b = input.nextDouble();
        
        System.out.println("Enter coefficient of c:");
        double c = input.nextDouble();
        
        // Calculating the discriminant
        double d = b * b - 4 * a * c;

        if (d > 0) {
            // Two real and distinct roots
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and distinct: " + r1 + " and " + r2);
        } else if (d == 0) {
            // One real root
            double r1 = -b / (2 * a);
            System.out.println("Root is real and repeated: " + r1);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.println("Roots are complex: " + realPart + " + " + imaginaryPart + "i and " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
OUTPUT
  Enter coefficient of a:
21
Enter coefficient of b:
23
Enter coefficient of c:
4
Roots are real and distinct: -0.21684657167976656 and -0.8783915235583286
