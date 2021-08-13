import java.util.Scanner;
public class devam {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
       double tutar;
        System.out.println("Armut kaç kilo: ");

        double a= input.nextDouble();
        System.out.println(a);
        System.out.println("Elma kaç kilo: ");
        double b= input.nextDouble();
        System.out.println(b);
        System.out.println("Domates kaç kilo: "
        );
        double c= input.nextDouble();
        System.out.println(c);
        System.out.println("Muz kaç kilo: ");
        double d= input.nextDouble();
        System.out.println(d);
        System.out.println("Patlıcan kaç kilo: ");
        double e= input.nextDouble();
        System.out.println(e);
        tutar=((2.14*a)+(3.67*b)+(1.11*c)+(0.95*d)+(5*e));
        System.out.println("Toplam tutar: ");
        System.out.println(tutar);
    }
}
