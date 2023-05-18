import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long A, B, SOMA;

        A = sc.nextLong();
        B = sc.nextLong();

        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);
    }
}