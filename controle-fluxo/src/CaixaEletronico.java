import java.util.Scanner;

public class CaixaEletronico {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double saldo = 250;
        double valorRequisitado;

        System.out.println("Digite um valor: ");
        valorRequisitado = scanner.nextDouble();


        if(valorRequisitado < saldo){
            saldo = saldo - valorRequisitado;

            System.out.println("Aprovado. ");
        }
        else {
            System.out.println("Saldo insuficiente. ");
        }
        System.out.println("Saldo atual: " + saldo);
    }
}
