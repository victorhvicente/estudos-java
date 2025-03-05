public class Usuario {
    public static void main(String [] args){
        System.out.println("Sistema Smart TV");

        SmartTv tv = new SmartTv(); // Criando um objeto da TV

        tv.ligar(); // Liga a TV
        tv.aumentarVolume(); // Aumenta volume
        tv.mudarCanal(5); // Muda para o canal 5
        tv.desligar(); // Desliga a TV

        System.out.println("A TV está ligada ?: " + tv.ligada);
        System.out.println("Canal Atual : " + tv.canal);
        System.out.println("Volume Atual : " + tv.volume);

    }
}