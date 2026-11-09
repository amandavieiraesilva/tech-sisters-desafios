import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do primeiro produto:");
        double produto1 = scanner.nextDouble();
        System.out.println("Informe o valor do segundo produto:");
        double produto2 = scanner.nextDouble();
        double valorTotal = produto1 + produto2;
        if(valorTotal <= 250) {
            double parcelamento = valorTotal / 5;
            System.out.println("Compra aprovada para parcelamento! 5x de R$ " + parcelamento + ".");
        } else {
            System.out.println("Valor total (R$" + valorTotal + ") excede o limite de R$ 250,00 para parcelamento em 5x.");
        }

        scanner.close();
    }
}
