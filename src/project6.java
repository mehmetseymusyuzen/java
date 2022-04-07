import java.util.Scanner;
public class project6 {
    public static void main(String[] args) {

        double kg, m, boddMassIndex;

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen kilonuzu yaziniz. : ");
        kg = input.nextDouble();

        System.out.print("Lutfen boyunuzun metre cinsinden yaziniz : ");
        m = input.nextDouble();

        boddMassIndex = kg / (m * m);
        System.out.println("Kutle boy endeksiniz : " + boddMassIndex);


    }
}
