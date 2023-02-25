import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------- CONTADOR ----------");
		
		try {
			System.out.print("\nDigite o primeiro parâmetro: ");
            int parametroUm = sc.nextInt();
		
            System.out.print("Digite o segundo parâmetro: ");
		    int parametroDois = sc.nextInt();
            System.out.println();
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception){
            System.out.println("\nATENÇÃO: O segundo parâmetro deve ser maior que o primeiro");
		}
        sc.close();
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }else{
            int contagem = parametroDois - parametroUm;
            for(int i = 1; i <= contagem; i++){
                System.out.println("Imprimindo o número " + i);
            }
            System.out.println("\n Impressões encerradas! \n");
        }
    }
}