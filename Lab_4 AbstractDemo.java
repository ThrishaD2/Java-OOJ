abstract class Shape{
int dim1,dim2;
Shape(int x,int y){
dim1=x;
dim2=y;}
abstract double printArea();
}
class Rectangle extends Shape{
Rectangle(int a,int b){
super(a,b);
}
double printArea(){
return dim1*dim2;
}}
class Triangle extends Shape{
Triangle(int a,int b){
super(a,b);
}
double printArea(){
return 0.5*dim1*dim2;
}
}
class Circle extends Shape{
Circle (int a,int b){
super(a,0);
}
double printArea(){
return 3.14*dim1*dim1;
}
}
class AbstractDemo{
public static void main(String ss[]){
Rectangle r=new Rectangle(100,240);
Triangle t=new Triangle(10,20);
Circle c =new Circle(10,0);
System.out.println("Area of rectangle:"+r.printArea());
System.out.println("Area of triangle:"+t.printArea());
System.out.println("Area of circle:"+c.printArea());
}
}
OUTPUT 
  Area of rectangle:24000.0
  Area of triangle:100.0
  Area of circle:314.0
