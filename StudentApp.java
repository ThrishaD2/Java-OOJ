import java.util.Scanner;
class Student{
String usn;
String name;
int[] credits;
int[] marks;
int numberofSubjects;
Student(int numberofSubjects){
this.numberofSubjects=numberofSubjects;
credits=new int[numberofSubjects];
marks=new int[numberofSubjects];
}
void acceptDetails(){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER USN:");
usn=sc.nextLine();
System.out.println("ENTER NAME:");
name=sc.nextLine();
for(int i=0;i<numberofSubjects;i++){
System.out.println("ENTER CREDITS:"+(i+1));
credits[i]=sc.nextInt();
System.out.println("ENTER MARKS:"+(i+1));
marks[i]=sc.nextInt();
}}
void displayDetails(){
System.out.println("\n STUDENT DETAILS:");
System.out.println("USN:"+usn);
System.out.println("NAME:"+name);
for(int i=0;i<numberofSubjects;i++){
System.out.println("SUBJECT"+(i+1)+" "+"CREDITS:"+credits[i]+" "+"MARKS:"+marks[i]);}
System.out.println("SGPA:"+calculateSGPA());}
double calculateSGPA(){
double totalWeightedMarks=0;
int totalCredits=0;
for(int i=0;i<numberofSubjects;i++){
totalWeightedMarks+=marks[i]*credits[i];
totalCredits+=credits[i];}
if(totalCredits==0)
return 0;
return totalWeightedMarks/totalCredits;}
}
class StudentApp{
public static void main(String ss[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of subjects:");
int numSubjects=sc.nextInt();
Student student=new Student(numSubjects);
student.acceptDetails();
student.displayDetails();
}
}
