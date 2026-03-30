import java.util.Scanner;
public class Atividade04lista03 {
     public static void main(String[] args) {
        Scanner circulo = new Scanner(System.in);

        System.out.print("Digite o código (1, 2 ou 3): ");
        int op = circulo.nextInt();

        System.out.print("Digite o raio: ");
        double r = circulo.nextDouble();

        double pi = 3.141592;

        switch (op) {
            case 1:
                System.out.println("Perímetro: " + (2 * pi * r));
                break;
            case 2:
                System.out.println("Área: " + (pi * r * r));
                break;
            case 3:
                System.out.println("Volume: " + (4.0 / 3.0 * pi * Math.pow(r, 3)));
                break;
            default:
                System.out.println("Código inválido!");
        }

        circulo.close();
    }
}

