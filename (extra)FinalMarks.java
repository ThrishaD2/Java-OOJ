import java.util.*;
class WrongMarks extends Exception{
public WrongMarks(String message){
super(message);
}
}
class Internal{
int in_marks;
public Internal(int in_marks) throws WrongMarks{
if(in_marks>30){
throw new WrongMarks("Internal Marks is exceeded");
}
this.in_marks=in_marks;
System.out.println("Internal marks is"+this.in_marks);
}
}

class External{
int ex_marks;
public External(int ex_marks) throws WrongMarks{
if(ex_marks>70){
throw new WrongMarks("External marks is exceeded");
}
this.ex_marks=ex_marks;
System.out.println("External marks is"+this.ex_marks);
}
}
public class FinalMarks{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Internal marks:");
int in_marks=sc.nextInt();
System.out.println("Enter External Marks:");
int ex_marks=sc.nextInt();
try{
Internal I1 = new Internal(in_marks);
}
catch(WrongMarks e){
System.out.println("Error:"+e.getMessage());
}
try{
External E1 = new External(ex_marks);
}
catch(WrongMarks e){
System.out.println("Error:"+e.getMessage());
}
}
}

