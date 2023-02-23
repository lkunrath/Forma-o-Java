import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        System.out.print("\nPor favor, digite o seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        agencia = sc.nextLine();
            
        System.out.print("Por favor, digite o número da conta: ");
        numero = sc.nextInt();
        
        System.out.print("Por favor, digite o saldo que será adicionado em sua conta: ");
        saldo = sc.nextDouble();
        
        System.out.print("\nOlá " + nomeCliente + ", obrigado(a) por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");   
        
        sc.close();
    }
}