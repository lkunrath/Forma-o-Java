import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		
        int C = sc.nextInt();
		String nome;
		int N;

		for (int i = 0; i < C; i++) {
			nome = sc.next();
			N = sc.nextInt();
			if (nome.equals("Thor")) System.out.println("Y");
			else System.out.println("N");
		}
    }
}