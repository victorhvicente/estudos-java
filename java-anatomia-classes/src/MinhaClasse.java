public class MinhaClasse {
    
    public static void main(String[] args) {


        System.out.println("Meus primeiros comandos em Java :D");

        String nome = "Victor Hugo Vicente";
        String ultimoNome = "Dos Santos";
        int idade = 24;
        double altura = 1.78;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);

        String fullName = nomeCompleto(nome, ultimoNome);
        System.out.print(fullName);
    }

    public static String nomeCompleto(String primeiroNome, String sobreNome) {
        return "Nome completo do cidadão: " + primeiroNome + " " + sobreNome;
    }
}

