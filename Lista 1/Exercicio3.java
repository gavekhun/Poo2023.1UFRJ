import java.util.Scanner;

public class Exercicio3 {
    public static void Volume(Scanner x) {

        

        double raio, pi = 3.14159;

        System.out.println("Insira o numero do raio: ");
        raio = x.nextDouble();

        raio= (raio*raio*raio)*pi*(4/3);

        System.out.println("Volume da esfera é: " + raio);

        x.close();
        
    }
    
}
