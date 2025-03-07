import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        String nome;
        double nota1;
        double nota2;

        System.out.println("Olá, Qual seu nome ?: ");
        nome = scanner.nextLine();
        System.out.println("Nota do primeiro bimestre: ");
        nota1 = scanner.nextDouble();
        System.out.println("Nota do segundo bimestre: ");
        nota2 = scanner.nextDouble();
        
        double mediaFinal = calcularMedia(nota1, nota2);
        
        // Usando %2f para exibir a média com 2 casas decimais
        if(mediaFinal >= 7){
            String msg = String.format("Parabéns %s, você foi aprovado! Média Final: %.2f. ", nome, mediaFinal);
            System.out.println(msg);
        }
        else if(mediaFinal >= 5 && mediaFinal < 7 ){
            String msg = String.format("%s, você foi para recuperação! Média Final: %.2f. ", nome, mediaFinal);
            System.out.println(msg);
        }
        else {
            String msg = String.format("%s, infelizmente você foi reprovado! Média Final: %.2f. ", nome, mediaFinal);
            System.out.println(msg);
        }

        scanner.close();
    }

    public static double calcularMedia(double n1, double n2){
        return (n1 + n2) / 2;
    }
}
