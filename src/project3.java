import java.util.Scanner;

public class project3 {

    public static void main(String[] args) {

       int x , y;
       double z, u, t;
       Scanner input = new Scanner(System.in);

        System.out.print("Ilk kenari giriniz : ");
        x = input.nextInt();

        System.out.print("Ikinci kenari giriniz : ");
        y = input.nextInt();

        z = Math.sqrt((x*x) + (y*y));

        u = (x + y + z) / 2;
        t = u*(u-x)*(u-y)*(u-z);

        System.out.println("Hipotenusun degeri : " + z);
        System.out.println("Ucgenin alaninin degeri : " + Math.sqrt(t));







    }
}