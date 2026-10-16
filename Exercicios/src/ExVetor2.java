import java.util.InputMismatchException;
import java.util.Scanner;

public class ExVetor2 {

    private static final int TOTAL_PRODUTOS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vendas = new int[TOTAL_PRODUTOS];
        String continua;

        do {
            try {
                System.out.print("\nDigite o código do produto: ");
                int produto = scanner.nextInt();

                if (produto >= 1 && produto <= TOTAL_PRODUTOS) {
                    System.out.print("Quantidade vendida: ");
                    int qtd = scanner.nextInt();

                    if (qtd > 0) {
                        vendas[produto - 1] += qtd;
                    } else {
                        System.out.println("Erro: A quantidade deve ser maior que zero.");
                    }
                } else {
                    System.out.printf("Erro: Código inválido! Digite um produto de 1 a %d.\n", TOTAL_PRODUTOS);
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida! Digite apenas números inteiros.");
                scanner.nextLine();
            }

            System.out.print("\nDeseja registrar outra venda? (S/N): ");
            continua = scanner.next();

        } while (continua.equalsIgnoreCase("S"));

        for (int i = 0; i < vendas.length; i++) {
            System.out.printf("Produto %d: %d unidades vendidas\n", (i + 1), vendas[i]);
        }
        scanner.close();
    }
}