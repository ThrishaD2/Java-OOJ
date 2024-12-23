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

OUTPUT
  Enter the number of books
2
enter name of the book:
motivation
enter author of the book:
william
enter price of the book:
500
enter number of pages of the book:
1999
Name of the book:motivation
Author of the book:william
Price of the book:500.0
Number of pages of the book:1999
enter name of the book:
story
enter author of the book:
shakesphere
enter price of the book:
600
enter number of pages of the book:
6789
Name of the book:story
Author of the book:shakesphere
Price of the book:600.0
Number of pages of the book:6789

 All book details:
Book Name:motivation
Author:william
price:500.0
Number of pages:1999

Book Name:story
Author:shakesphere
price:600.0
Number of pages:6789
