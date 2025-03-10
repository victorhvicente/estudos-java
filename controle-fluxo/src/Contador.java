import java.util.Scanner;

public class Contador {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        int param1;
        int param2;

        System.out.println("Digíte o primeiro parâmetro: ");
        param1 = scan.nextInt();
        System.out.println("Digíte o segundo parâmetro: ");
        param2 = scan.nextInt();

        try {
            contar(param1, param2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scan.close();
    }

    public static void contar(int numero1, int numero2) throws ParametrosInvalidosException{
        if(numero1 > numero2){
            throw new ParametrosInvalidosException("O Segundo parâmetro deve ser maior que o primeiro");
        }

        for(int i = numero1; i < numero2; i++){
            System.out.println("Imprimindo o número: " + (i - numero1 + 1));
        }
    }
}
