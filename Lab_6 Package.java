package CIE;

public class Student {
    private String usn;
    private String name;
    private int sem;

    
    public Student(String usn, String name, int sem) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
    }

    
    public String getUsn() {
        return usn;
    }

    public String getName() {
        return name;
    }

    public int getSem() {
        return sem;
    }
}


package CIE;

public class Internals {
    private int[] internalMarks;

    
    public Internals() {
        internalMarks = new int[5]; 
    }

   
    public void setInternalMarks(int[] marks) {
        if (marks.length == 5) {
            this.internalMarks = marks;
        } else {
            System.out.println("Error: Marks should be for 5 courses.");
        }
    }

    
    public int[] getInternalMarks() {
        return internalMarks;
    }
}


package SEE;

import CIE.Student;

public class External extends Student {
    private int[] externalMarks;

    
    public External(String usn, String name, int sem) {
        super(usn, name, sem);
        externalMarks = new int[5]; 
    }

    
    public void setExternalMarks(int[] marks) {
        if (marks.length == 5) {
            this.externalMarks = marks;
        } else {
            System.out.println("Error: Marks should be for 5 courses.");
        }
    }

    
    public int[] getExternalMarks() {
        return externalMarks;
    }

   
    public int[] getFinalMarks(int[] internalMarks) {
        int[] finalMarks = new int[5];
        for (int i = 0; i < 5; i++) {
            finalMarks[i] = internalMarks[i] + externalMarks[i]; 
        }
        return finalMarks;
    }
}



import CIE.Internals;
import SEE.External;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        
        External[] externalStudents = new External[n];
        Internals[] internalMarks = new Internals[n];

        
        for (int i = 0; i < n; i++) {
           
            scanner.nextLine(); 
            System.out.print("\nEnter USN for student " + (i + 1) + ": ");
            String usn = scanner.nextLine();
            System.out.print("Enter name for student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter semester for student " + (i + 1) + ": ");
            int sem = scanner.nextInt();

            
            externalStudents[i] = new External(usn, name, sem);

           
            internalMarks[i] = new Internals();
            int[] internalMarksArray = new int[5];
            System.out.println("Enter internal marks for 5 courses: ");
            for (int j = 0; j < 5; j++) {
                internalMarksArray[j] = scanner.nextInt();
            }
            internalMarks[i].setInternalMarks(internalMarksArray);

            
            int[] externalMarksArray = new int[5];
            System.out.println("Enter external marks for 5 courses: ");
            for (int j = 0; j < 5; j++) {
                externalMarksArray[j] = scanner.nextInt();
            }
            externalStudents[i].setExternalMarks(externalMarksArray);
        }

        
        System.out.println("\nFinal Marks for Students:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ": " + externalStudents[i].getName() + " (" + externalStudents[i].getUsn() + ")");
            int[] finalMarks = externalStudents[i].getFinalMarks(internalMarks[i].getInternalMarks());
            System.out.println("Semester: " + externalStudents[i].getSem());
            System.out.println("Final Marks: ");
            for (int j = 0; j < 5; j++) {
                System.out.println("Course " + (j + 1) + ": " + finalMarks[j]);
            }
        }

        scanner.close();
    }
}
OUTPUT
    Enter number of students: 2

Enter USN for student 1: 12345
Enter name for student 1: anu
Enter semester for student 1: 3
Enter internal marks for 5 courses:
21
22
23
24
25
Enter external marks for 5 courses:
60
79
89
90
100

Enter USN for student 2: 09876
Enter name for student 2: anji
Enter semester for student 2: 3
Enter internal marks for 5 courses:
23
24
25
26
27
Enter external marks for 5 courses:
89
90
98
88
89

Final Marks for Students:

Student 1: anu (12345)
Semester: 3
Final Marks:
Course 1: 81
Course 2: 101
Course 3: 112
Course 4: 114
Course 5: 125

Student 2: anji (09876)
Semester: 3
Final Marks:
Course 1: 112
Course 2: 114
Course 3: 123
Course 4: 114
Course 5: 116