public class Segitiga {
    public static void main(String[] args) {
        char huruf = 'A';

        for(int i = 0; i < 5; i++) {
            for(int j = 10; j >= i;j--) {
                System.out.print(" ");
            }
            for (int k = 0; k<= i; k++) {
                System.out.print(huruf);
                huruf++;
            }
            System.out.println();
        }
    }
}
