import java.util.Scanner;

public class Kpk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka ke - 1 : ");
        int a = sc.nextInt();
        System.out.print("Masukkan angka ke - 2 : ");
        int b = sc.nextInt();

        int faktor = 0;

        int bilanganTerkecil = 0;
        if (a < b) {
            bilanganTerkecil = a;
        } else {
            bilanganTerkecil = b;
        }
        for(int i = 1; i <= bilanganTerkecil; i++) {
            if (a % i == 0 && b % i == 0) {
               faktor = i;
            }
        }

         int faktor_a = a / faktor;
         int faktor_b = b / faktor;
        System.out.println("kpk dari " + a + " dan " + b + " = " + faktor * faktor_a * faktor_b);


    }
}
