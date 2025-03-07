import java.util.Scanner;

public class ExcecoesTryCatch {
    public static void main(String [] args){
        
        try{

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();
    
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
    
            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();
    
            String msg = String.format("Olá ! %s, você tem %d anos de idade e %.2f de altura: ", nome, idade, altura);
            System.out.println(msg);
        }
        catch (Exception  e) {
            System.out.println("Os campos precisam ser preenchidos com números");
        }

    }
}