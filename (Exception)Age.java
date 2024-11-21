class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}


class Father {
    int age;

    
    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Age cannot be negative for Father.");
        }
        this.age = age;
        System.out.println("Father's age is " + this.age);
    }
}


class Son extends Father {
    int sonAge;

   
    public Son(int fatherAge, int sonAge) throws WrongAge {
        
        super(fatherAge);
        
       
        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to Father's age.");
        }
        this.sonAge = sonAge;
        System.out.println("Son's age is " + this.sonAge);
    }
}


public class Age {
    public static void main(String[] args) {
       
        try {
            Father father1 = new Father(-5);  
        } catch (WrongAge e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Son son1 = new Son(40, 45);  
        } catch (WrongAge e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Son son2 = new Son(40, 30); 
        } catch (WrongAge e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
