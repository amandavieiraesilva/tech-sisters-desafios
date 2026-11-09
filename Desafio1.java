import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor: ");
        int valorDigitado = scanner.nextInt();

        if (valorDigitado > 0) {
            System.out.println("O número " + valorDigitado + " é positivo.");
        } else if (valorDigitado < 0) {
            System.out.println("O número " + valorDigitado + " é negativo.");
        } else {
            System.out.println("O número " + valorDigitado + " é nulo.");
        }

        scanner.close();
    }
}