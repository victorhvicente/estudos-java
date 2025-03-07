import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    
    public static void main(String [] args) {

        double mesada = 30;

        while(mesada > 0){
            double valorDoce = valorAleatorio(); 

            if(valorDoce > mesada){
                valorDoce = mesada;
            }
            String msgValorDoce = String.format("Valor do doce: %.2f ", valorDoce);
            System.out.println(msgValorDoce);
            mesada = mesada -  valorDoce;
        }
        System.out.println("Valor da mesada: " + mesada);
        System.out.println("Gastei toda minha mesada em doces.");
    }

    public static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}