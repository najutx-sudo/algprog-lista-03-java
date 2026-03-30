import java.util.Scanner;

  public class Atividade02lista03 {

    public static void main(String[] args) {
        Scanner codigo = new Scanner(System.in);

        System.out.print("Valor da compra: ");
        int compra = codigo.nextInt();

        System.out.print("Valor pago: ");
        int pago = codigo.nextInt();

        if (pago < compra) {
            System.out.println("Valor insuficiente!");
        } else {
            int troco = pago - compra;
            System.out.println("Troco: R$ " + troco);

            int[] notas = {50, 20, 10, 5, 2, 1};

            for (int nota : notas) {
                int quantidade = troco / nota;
                troco %= nota;
                System.out.println("Notas de R$ " + nota + ": " + quantidade);
            }
        }

        codigo .close();
    }
}

