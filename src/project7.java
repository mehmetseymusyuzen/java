import java.util.Scanner;
public class project7 {
    public static void main(String[] args) {

        double armut = 2.14, elma = 3.67, domates = 1.11,
                muz = 0.95, patlican = 5.0, total,
                armutKg, elmaKg, domatesKg, muzKG,
                patlicanKg;

        Scanner input = new Scanner(System.in);
        System.out.print("Kac kg armut aldiniz ? : ");
        armutKg = input.nextDouble();

        System.out.print("Kac kg elma aldiniz ? : ");
        elmaKg = input.nextDouble();

        System.out.print("Kac kg domates aldiniz ? : ");
        domatesKg = input.nextDouble();

        System.out.print("Kac kg muz aldiniz ? : ");
        muzKG = input.nextDouble();

        System.out.print("Kac kg patlican aldiniz ? : ");
        patlicanKg = input.nextDouble();

        total = ((armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+
                  (muz*muzKG)+(patlican*patlicanKg));

        System.out.println("Toplam fiyat : " + total);

    }
}
