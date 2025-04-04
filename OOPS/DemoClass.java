package OOPS;
class pen{
String color;
String type;
int price;

public void write(){
    System.out.println("Writing something...");
}
}
public class DemoClass{
public static void main(String[]args){
    System.out.println("Welcome to Demo Class in Java!");
pen obj1=new pen();
System.out.println(obj1.color="blue");
System.out.println(obj1.type="ballpoint");
System.out.println(obj1.price=10);
obj1.write();
   } 
}
