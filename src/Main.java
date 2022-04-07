import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int matematik , fizik , kimya , turkce , tarih;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        matematik = inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Turkce notunuz: ");
        turkce= inp.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = inp.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih);
        double ortalama = toplam / 5.0;
        System.out.println("Ortalamaniz "+ ortalama);

        String sonuc = ortalama>=60 ? "sinifi gectiniz" : "sinifta kaldiniz";
        System.out.println(sonuc);
    }
}