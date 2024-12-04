import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int a = sc.nextInt();
        int faktor = 0;

        for(int i = 1; i <= a; i++) {
            if (a % i == 0) {
                faktor++;
            }
        }
        if (faktor == 2) {
            System.out.println("BILANGAN PRIMA");
        } else {
            System.out.println("BUKAN BILANGAN PRIMA");
        }
    }
}
