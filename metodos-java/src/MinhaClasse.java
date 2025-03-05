public class MinhaClasse {

    public static void main(String[] args) {
        System.out.println("Programa iniciado!");
    }

    public double somar(int n1, int n2) {
        return n1 + n2;
    }

    public void imprimir(String texto) {
        System.out.println(texto);
    }

    public double dividir(int dividendo, int divisor) throws Exception {
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        return (double) dividendo / divisor;
    }

    private double metodoPrivado() {
        return 0.0;
    }

    // public void gravarCliente(Cliente cliente) {
    //     System.out.println("Cliente " + cliente.getNome() + " gravado com sucesso!");
    // }
}

