import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Masukkan waktu (detik) : ");
        int waktu = sc.nextInt();
        int waktuMenit;
        int waktuDetik;

        int waktuJam = waktu / 60 / 60;
        waktuMenit = waktu / 60 % 60;
        waktuDetik = waktu % 60;

        System.out.println(waktuJam + " jam " + waktuMenit + " menit " + waktuDetik + " detik " );
        System.out.print("Apakah anda ingin melanjutkan? (y/n)");
      

    }
}
