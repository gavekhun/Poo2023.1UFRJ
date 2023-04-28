import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        Funcionario Func1 = new Funcionario("Bruna", 8);
        Func1.getID(); Func1.getNome();
        Funcionario Func2 = new Funcionario("Débora", 10);
        Func2.getID(); Func2.getNome();
       
        
        
        System.out.println("Altere o nome do funcionário 1: ");
        Func1.atualizarNome(entrada.nextLine());
        System.out.println("Altere o nome do funcionário 2: ");
        Func2.atualizarNome(entrada.nextLine());
        
        System.out.println("Adione horas trabalhadas do funcionário 1");
        Func1.adicionaDiaDeTrabalho(entrada.nextDouble());
        System.out.println("Adione horas trabalhadas do funcionário 2");
        Func2.adicionaDiaDeTrabalho(entrada.nextDouble());
        
        System.out.println("---------------- Funcionários ------------------");
        Func1.funcionarioCompleto();
        Func2.funcionarioCompleto();
        System.out.println("------------------------------------------------");

        entrada.close();

    }
}
