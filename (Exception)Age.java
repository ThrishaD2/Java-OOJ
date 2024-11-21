class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

// Base class Father
class Father {
    int age;

    // Constructor for Father class that checks if the age is valid
    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Age cannot be negative for Father.");
        }
        this.age = age;
        System.out.println("Father's age is " + this.age);
    }
}

// Derived class Son
class Son extends Father {
    int sonAge;

    // Constructor for Son class that checks if son's age is valid
    public Son(int fatherAge, int sonAge) throws WrongAge {
        // Call the Father's constructor
        super(fatherAge);
        
        // Check if son's age is less than father's age
        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to Father's age.");
        }
        this.sonAge = sonAge;
        System.out.println("Son's age is " + this.sonAge);
    }
}

// Main class to test the exception handling
public class Main {
    public static void main(String[] args) {
        // Testing invalid and valid cases
        try {
            Father father1 = new Father(-5);  // Invalid age for father
        } catch (WrongAge e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Son son1 = new Son(40, 45);  // Invalid case because son's age is >= father's age
        } catch (WrongAge e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Son son2 = new Son(40, 30);  // Valid case where son's age is less than father's age
        } catch (WrongAge e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
