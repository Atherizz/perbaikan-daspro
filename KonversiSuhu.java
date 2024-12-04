import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("KONVERSI CELCIUS - FAHRENHEIT");
        System.out.print("Masukkan suhu dalam celcius : ");
        double celcius = sc.nextDouble();
        double fahrenheit = 9.0/5.0 * celcius + 32;

        System.out.println(celcius + "° C ==> " + fahrenheit + "° F ");

    }
}