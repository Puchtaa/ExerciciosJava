import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas notas? ");
        int qtd = scanner.nextInt();
        double[] notas = new double[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < qtd; i++) {
            System.out.println("Nota " + (i + 1) + " = " + notas[i]);
            soma += notas[i];
        }
        double media = soma / qtd;
        System.out.printf("Média = %.1f\n" , media);
    }
}
