import java.util.Scanner;
class Book{
String name,author;
double price;
int numPages;
Book(String name,String auhtor,double price,int numPages){
this.name=name;
this.author=author;
this.price=price;
this.numPages=numPages;}
void setDetails(){
Scanner sc=new Scanner(System.in);
System.out.println("enter name of the book:");
name=sc.next();
System.out.println("enter author of the book:");
author=sc.next();
System.out.println("enter price of the book:");
price=sc.nextInt();
System.out.println("enter number of pages of the book:");
numPages=sc.nextInt();}
void getDetails(){
System.out.println("Name of the book:"+name);
System.out.println("Author of the book:"+author);
System.out.println("Price of the book:"+price);
System.out.println("Number of pages of the book:"+numPages);}
public String toString(){
return "Book Name:"+name+"\n"+"Author:"+author+"\n"+"price:"+price+"\n"+"Number of pages:"+numPages;}
}
class MyBook{
public static void main(String ss[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of books");
int n=sc.nextInt();
Book[] books=new Book[n];
for(int i=0;i<n;i++){
books[i]=new Book("time","gallium",99,150);
books[i].setDetails();
books[i].getDetails();
}
System.out.println("\n All book details:");
for(Book book:books){
System.out.println(book);
System.out.println();
}
}
}
