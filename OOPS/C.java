package OOPS;



class Test{
    int a;
    String name;
    Test(){
        a=10;
        name="Brajul";
        System.out.println("Default Constructor calles"+a+" "+name);
    }
    Test(Test ref){
a=ref.a;
name=ref.name;
System.out.println("Copy Constructor called "+a+" "+name);
    }
}
 public class C {
    public static void main(String[] args) {
        Test t=new Test();
       Test p=new Test(t);
    }
}