package OOPS;
class A{

    A(String name,int age){
        System.out.println("Name : "+name+" " +" | Age : "+age);
    }
    public void diply(){
        System.out.println("Parameterized constructor");
    }
}
public class Pconstructor {
    public static void main(String[] args) {
        A obj=new A("Brajul",20);
        obj.diply();
    }
}
