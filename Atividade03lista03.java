import java.util.Scanner;

public class Atividade03lista03 {
public static void main(String[] args) {
        Scanner calculo = new Scanner(System.in);

        double a = calculo.nextDouble();

        System.out.print("Digite b: ");
        double b = calculo.nextDouble();

        System.out.print("Digite c: ");
        double c = calculo.nextDouble();

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0) {
            double x = -c / b;
            System.out.println("Equação de primeiro grau.");
            System.out.println("Raiz: " + x);
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Não possui raízes reais.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Duas raízes iguais: " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Duas raízes diferentes:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

        calculo.close();
}
}

