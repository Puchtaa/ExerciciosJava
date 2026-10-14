import java.util.Scanner;

public class Prog02b {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int MAX_PESSOAS = 5;

        double[] altura = new double[MAX_PESSOAS];
        int contador = 0;
        String mais = "";
        do {
            System.out.print("Digite a altura: ");
            altura[contador] = entrada.nextDouble();
            contador++;
            if (contador < MAX_PESSOAS) {
                System.out.print("Tem mais (S/N)? ");
                mais = entrada.next();
            }
        } while (contador < MAX_PESSOAS && mais.equalsIgnoreCase("s"));

        double soma = 0;
        for (int i = 0; i < MAX_PESSOAS; i++) {
            soma += altura[i];
        }

        double media = soma / contador;
        System.out.printf("\nA média de %d pessoas é %.2fm\n",
                contador, media);

        System.out.print("Alturas abaixo da média:");
        for (int i = 0; i < MAX_PESSOAS; i++) {
            if (altura[i] < media) {
                System.out.printf("%.2f ", altura[i]);
            }
        }
    }
}