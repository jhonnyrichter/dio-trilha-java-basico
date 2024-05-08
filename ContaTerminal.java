import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Agora digite o número da sua agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Qual é o seu nome completo: ");
        String nomeCompleto = scanner.next();

        double saldo = 237.48;

        System.out.println("Olá " + nomeCompleto + " obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", sua conta é " + numeroConta + ", e  seu saldo é de: " + saldo);
        
        

        
       
            
    }
}
