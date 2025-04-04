package OOPS;
class Test{
int a;
String name;
float b; 

//Default Constructor

/*Test(){
    a=0;
    name=null;
    b=0.0;
}*/
 
void show(){
    System.out.println("a = "+a );
    System.out.println("name = "+name);
    System.out.println("b = "+b);
}
}
public class Constructor {
    public static void main(String[]args){
Test obj1=new Test();
obj1.show();
    }
}
