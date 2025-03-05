public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10; 


    public void ligar(){
       ligada = true;
       System.out.println("A TV ligou. ");
    }

    public void desligar(){
        ligada = false;
        System.out.println("A TV desligou. ");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume: " + volume);
    }

    public void mudarCanal(int numeroCanal) {
        canal = numeroCanal;
        System.out.println("Canal alterado para: " + canal);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Canal alterado para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Canal alterado para: " + canal);
    }
}