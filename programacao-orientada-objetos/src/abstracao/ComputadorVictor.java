package abstracao;

public class ComputadorVictor {
    public static void main(String [] args){
        System.out.println("--MSN--");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println(" ");
        System.out.println("--Facebook--");
        FacebookMessenger face = new FacebookMessenger();
        face.enviarMensagem();
        face.receberMensagem();

        System.out.println(" ");
        System.out.println("--Telegram--");
        Telegram tel = new Telegram();
        tel.enviarMensagem();
        tel.receberMensagem();
    }
}
