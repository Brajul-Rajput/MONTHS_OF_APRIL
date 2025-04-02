package ONE;

public class RupeeToPaise {
    public static void main(String[]args){
        double x=10.50;
        int rupee=(int)x;
        System.out.println("Rupee : "+rupee);
        double paise=(x-rupee)*100;
        System.out.println("Paise : "+paise);

    }
}
