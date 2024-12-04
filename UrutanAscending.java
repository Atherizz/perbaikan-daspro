import java.util.Scanner;

public class UrutanAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        int temp = 0;

        System.out.print("Masukkan bilangan ke 1 : " );
        a = sc.nextInt();
        System.out.print("Masukkan bilangan ke 2 : " );
        b = sc.nextInt();
        System.out.print("Masukkan bilangan ke 3 : " );
        c = sc.nextInt();

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println(a + " " +  b + " " +  c);
 

    }
}
