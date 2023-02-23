import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        long A, B, PRODUTO;

        A = sc.nextLong();
        B = sc. nextLong();

        PRODUTO = A*B;

        System.out.println("PROD = " + PRODUTO);
    }
}