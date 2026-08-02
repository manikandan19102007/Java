import java.util.Scanner;
abstract class Shape
{
int a, b;
abstract void printArea();
}

class Rectangle extends Shape
{
void printArea()
{
System.out.println("Area of Rectangle = " + (a * b));
}
}
class Triangle extends Shape
{
void printArea()
{
System.out.println("Area of Triangle = " + (0.5 * a * b));
}
}
class Circle extends Shape
{
void printArea()
{
System.out.println("Area of Circle = " + (Math.PI * a * a));
}
}
public class LenBre 
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("--- Shape Area Calculator ---");
System.out.println("1. Rectangle");
System.out.println("2. Triangle");
System.out.println("3. Circle");
System.out.print("Enter your choice (1-3): ");
        
int choice = sc.nextInt();
System.out.println();

switch (choice) 
{
case 1:
Rectangle r = new Rectangle();
System.out.print("Enter length: ");
r.a = sc.nextInt();
System.out.print("Enter breadth: ");
r.b = sc.nextInt();
r.printArea();
break;

case 2:
Triangle t = new Triangle();
System.out.print("Enter base: ");
t.a = sc.nextInt();
System.out.print("Enter height: ");
t.b = sc.nextInt();
t.printArea();
break;

case 3:
Circle c = new Circle();
System.out.print("Enter radius: ");
c.a = sc.nextInt();
c.printArea();
break;

default:
System.out.println("Invalid choice! Please select a number between 1 and 3.");
break;
}
sc.close();
}
}
 
