import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique a quantidade de passos dados hoje:");
        int passos = scanner.nextInt();
        if(passos > 8000) {
            int subtracao1 = passos - 8000;
            System.out.println("Parabéns! Você ultrapassou a meta por " + subtracao1 + " passos.");
        } else if(passos == 8000) {
            System.out.println("Parabéns! Você bateu a meta exata de 8000 passos.");
        } else {
            int substracao2 = 8000 - passos;
            System.out.println("Você não bateu a meta. Faltaram " + substracao2 + " passos.");
        }

        scanner.close();
    }
}
