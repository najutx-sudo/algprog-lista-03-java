import java.util.Scanner;

public class Atividade01lista03 {
    
}public static void main(String[] args) {
        Scanner atividade = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = atividade.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = atividade.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = atividade.nextDouble();

        double maior = numero1;
        double menor = numero1;

        if (numero2 > maior) maior = numero2;
        if (numero3 > maior) maior = numero3;

        if (numero2 < menor) menor = numero2;
        if (numero3 < menor) menor = numero3;

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media);

        atividade.close();
    }

