
import java.util.Scanner;

public class parOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println("O numero é par!");
        }
        else {
            System.out.println("O número é impar!");
        }
    }
    
}
