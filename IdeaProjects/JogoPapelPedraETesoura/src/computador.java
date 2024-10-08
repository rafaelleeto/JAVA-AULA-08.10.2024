import java.util.Random;

public class computador {
    public static String jogada (){

        Random random = new Random();
        int jogada1= random.nextInt(3);
        String jogada2;

        if (jogada1 == 0){
            jogada2="Pedra";
        }
        else if (jogada1 == 1){
            jogada2="Papel";
        }
        else {
            jogada2="Tesoura";
        }

        return jogada2;
    }
}
