import java.util.Scanner;

public class Exercicio2 {

    public static void refeicao(){

        Scanner x = new Scanner(System.in);

        System.out.println("Digite o número de pedidos de Frango:");
        int FrangoP = x.nextInt();
        System.out.println("Digite o número de pedidos de Bifes:");
        int BifesP = x.nextInt();
        System.out.println("Digite o número de pedidos de Massa:");
        int MassaP = x.nextInt();


        System.out.println("Digite a quantidade no estoque de Frango");
        int FrangoE = x.nextInt();
        System.out.println("Digite a quantidade no estoque de Bife");
        int BifesE = x.nextInt();
        System.out.println("Digite a quantidade no estoque de Massa");
        int MassaE = x.nextInt();

        if ((FrangoP > FrangoE) || (BifesP > BifesE) || (MassaP > MassaE) ){

            System.out.println("Muitos não poderão comer");

        }
        else{
            System.out.println("Todos irão comer!");
        }
        x.close();
    }
    
}
