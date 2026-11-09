import java.util.Scanner;

public class Desafio2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe os seguintes dados:");

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Altura: ");
        float altura = scanner.nextFloat();

        scanner.nextLine();

        System.out.println("Cidade: ");
        String cidade = scanner.nextLine();

        scanner.close();

        System.out.println("Olá, " + nome + "! " + "Você tem " + idade + " anos, mede " + altura + "m e mora em " + cidade + ".");


    }
}