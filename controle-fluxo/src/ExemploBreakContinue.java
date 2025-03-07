public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){

            if(i == 3){
                break;
            }
            System.out.println(i);
        }

        for(int i = 1; i <= 5; i++){

            if(i == 2){
                continue;
            }
            System.out.println(i);
        }
    }
}
