import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        while(true){
            System.out.println("Digite Pedra,Papel Ou Tesoura");
            String play= entrada.nextLine();
            String play2=computador.jogada();
            System.out.println(play2);

            if(play.equals("0")){
                System.exit(0);
            }

            if(play.equals(play2)){
                System.out.println("Empate!");

            }
            else if ((play.equals("Pedra") && play2.equals("Tesoura")) || (play.equals("Tesoura") && play2.equals("Papel"))
            || (play.equals("Papel") && play2.equals("Pedra"))){

                System.out.println("Você venceu!");
            }
            else {
                System.out.println("Você perdeu!");
            }

        }

    }
}