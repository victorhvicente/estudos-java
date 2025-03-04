public class BoletimEscolar {
    public static void main(String [] args) {
        
        System.out.println("--- Boletim Escolar ---");
        double nota1 = 7.5;
        double nota2 = 9;

        double media = calcularMedia(nota1, nota2);
        System.out.println("Média final: " + media);

        if(media >= 6){
            System.out.println("APROVADO");
        }
        else{
            System.out.println("REPROVADO");
        }

    }  

    public static double calcularMedia(double n1, double n2) {
        double mediaFinal = (n1 + n2) / 2;

        return mediaFinal;
    }
}