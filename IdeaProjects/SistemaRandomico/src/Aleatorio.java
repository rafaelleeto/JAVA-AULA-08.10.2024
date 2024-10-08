import java.util.Random;

public class Aleatorio {
    public static int random(){
        Random random = new Random();

        int numero1= random.nextInt(100);
        return numero1;
    }

}
