import java.util.Scanner;
import java.util.Random;

public class Atividade06lista03 {
public static void main(String[] args) {
        Scanner aleatorio = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Digite o primeiro número: ");
        int n1 = aleatorio.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = aleatorio.nextInt();

        int menor = Math.min(n1, n2);
        int maior = Math.max(n1, n2);

        int numero = rand.nextInt(maior - menor + 1) + menor;

        System.out.println("Número sorteado: " + numero);

        if (numero % 2 == 0) {
            System.out.println("É par");
        } else {
            System.out.println("É ímpar");
        }

        aleatorio.close();
    } 
}
