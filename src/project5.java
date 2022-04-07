import java.util.Scanner;

public class project5 {
    public static void main(String[] args) {

        double r, pi = 3, area, perimeter, angle;

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen dairenin yaricapini giriniz!!! : ");
        r = input.nextDouble();

        perimeter = 2 * pi * r;
        System.out.println("Dairenin cevresi : " + perimeter);

        area = pi * (r*r);
        System.out.println("Dairenin cevresi : " + area);

        System.out.print("Merkez acinin olcusunu giriniz!!! : ");
        angle = input.nextDouble();

        area = (pi * (r*r) * angle) / 360;
        System.out.println("Darie diliminin alani : " + area);


    }
}
