public class imc {
    public static void imc (float peso,float altura){
        float imc= peso/(altura*altura);

        if (imc<18.5){
            System.out.println("Abaixo do peso");
            System.out.println(imc);
        }
        else if (imc<24.9){
            System.out.println("Peso Normal");
            System.out.println(imc);
        }
        else if (imc<29.9){
            System.out.println("Sobrepeso");
            System.out.println(imc);
        }
        else{
            System.out.println("Obesidade");
            System.out.println(imc);
        }

    }
}
