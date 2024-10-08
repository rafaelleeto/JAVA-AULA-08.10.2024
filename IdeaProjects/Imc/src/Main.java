import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite sua altura:");
        float altura = sc.nextFloat();
        System.out.println("Digite seu peso: ");
        float peso = sc.nextFloat();

        imc.imc(peso,altura);

        }
    }
