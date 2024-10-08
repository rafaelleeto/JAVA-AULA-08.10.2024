import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero1= Aleatorio.random();
        System.out.println(numero1);

        Scanner entrada = new Scanner(System.in);
        int numero;



        do   {
            System.out.println("Digite um numero");
            numero = entrada.nextInt();

            if (numero==-1){
                System.exit(0);
            }

            if (numero>numero1){
                System.out.println("Alto");

            }
            else if (numero<numero1){
                System.out.println("Baixo");
            }

        } while (numero!=numero1);

        System.out.println("Parabens! Obrigado por jogar o meu jogo!!!!!!");

        }

    }