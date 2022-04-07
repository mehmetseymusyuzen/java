import  java.util.Scanner;

public class project2 {

    public static void main(String[] args) {

       double tutar, kdvTutar, kdvliTutar;
       Scanner input = new Scanner(System.in);

       System.out.print("Ucret tutarini yazin : ");
       tutar = input.nextDouble();
       double kosul = tutar>=0 && tutar<=1000 ? 0.18 : 0.08;

       kdvTutar = tutar * kosul;
       kdvliTutar =  tutar + kdvTutar;
       System.out.println("KDV'li tutar : " + kdvliTutar);

       kdvTutar = kdvliTutar - tutar;
       System.out.println("KDV tutari : " + kdvTutar);

       System.out.println("KDV orani : " + kosul);



    }
}
