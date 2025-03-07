import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        
        System.out.println("Discando...");

        do {
            //Executando repetitivas vezes até alguem tocar
            System.out.println("Telefone tocando...");

        } while (tocando());

        System.out.println("Alôo !!!");
    }

    public static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;

        System.out.println("Atendeu ? " + atendeu);

        //negando o ato de continuar tocando
        return ! atendeu;
    }
}
