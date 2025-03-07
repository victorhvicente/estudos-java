public class ExemploForArray {
    
    public static void main(String [] args){

        // em arrays o indice inicia em 0;
        String alunos [] = {"Victor", "Lucas", "Maria", "Juliana"};

        //for(int i = 0; i <= alunos.length; i++){
            //System.out.println("Aluno do indíce " + i + " é " + alunos[i]);
        //};

        //Exemplo do ForEach
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
