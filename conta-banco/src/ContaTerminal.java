import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o numero da Agência: ");
        int numero = scanner.nextInt();

        System.out.println("Informe sua Agência: ");
        String agencia = scanner.next();

        scanner.nextLine(); // Limpa a linha restante após o nextInt() ou nextDouble()
        System.out.println("Informe seu nome: ");   
        String nomeCliente = scanner.nextLine();

        System.out.println("Informe seu saldo: ");
        double saldo = scanner.nextDouble();

        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);

        System.out.println(mensagem);

        scanner.close();
    }
}

