import java.util.Scanner;
public class HipotenusHesaplama {


    //İki kenar uzunluğu kullanıcıdan alınan üçgenin hipotenüsünü hesaplama :


    public static void main(String[] args) {

        int a,b;
        double c;

        Scanner scan = new Scanner(System.in);

        System.out.println("Üçgenin 1. kenar uzunluğunu giriniz:");
        a = scan.nextInt();

        System.out.println("Üçgenin 2. kenar uzunluğunu giriniz:");
        b = scan.nextInt();

        c = Math.sqrt(a*a + b*b);
        System.out.println("Hipotenüs :" + c);


    }


}

