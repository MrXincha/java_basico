
import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota: ");
        int nota = scanner.nextInt();
            if (nota<6){
            System.out.println("Reprovado!"); 
            }
            else if (nota==6){
            System.out.println("Refaca!");
            }
            else if (nota>=6){
            System.out.println("Aprovado!");
            }
        scanner.close();
        }
}
