import java.util.Scanner;

public class Exercicio1{

    public static void nota(){
        double nota = 0;
        double total = 0;
        int i=0;
       Scanner x = new Scanner(System.in);
        System.out.println("Digite a nota da turma:");
            
            while((nota = x.nextDouble()) > -1){

                total+= nota;
                i+=1;
                System.out.println("Digite a nota da turma:");

                
            }
            System.out.println("Média total da turma:" + total/i);

        
          
            x.close();
        } 


    

    
}
