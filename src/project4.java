import java.util.Scanner;
public class project4 {

    public static void main(String[] args) {

        double km, perKm = 2.20, total, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Kac kilometre gideceginizi giriniz!!! : ");
        km = input.nextDouble();

        total = startPrice + (perKm * km);
        total = ( total < 20) ? 20 : total;

        System.out.println("Toplam tutar : " + total );


    }
}
