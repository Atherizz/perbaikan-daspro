import java.util.Scanner;

public class Pam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga;

        System.out.print("Masukkan air yang digunakan (m) : ");
        int air = sc.nextInt();

        if (air <= 50) {
            harga = air * 1000;
        } else if (air <= 100) {
            harga = 50 * 1000;
            harga += (air - 50) * 1500; 
        } else if (air <= 150) {
            harga = 50 * 1000;
            harga += 50 * 1500; 
            harga += (air - 100) * 2000; 
        } else {
            harga = 50 * 1000;
            harga += 50 * 1500; 
            harga += 50 * 2000; 
            harga += (air - 150) * 3000;
        }

        System.out.println("Tagihan yang harus dibayar : Rp. " + harga);
    }
}
