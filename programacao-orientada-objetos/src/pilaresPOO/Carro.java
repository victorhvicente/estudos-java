public class Carro extends Veiculo {
 


    public void ligar(){
        conferirCombustivel();
        System.out.println("CARRO LIGADO");
    }

    private void conferirCombustivel() {
        System.out.println("Conferiu o combustivel");
    } 
}
