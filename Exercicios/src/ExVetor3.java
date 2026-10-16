import java.util.Scanner;

public class ExVetor3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int produto;
        int quant;

        int[] vendas = new int[3];
        vendas[0] = 0;
        vendas[1] = 0;
        vendas[2] = 0;

        String continua;

        do {
            System.out.print("Produto: ");
            produto = entrada.nextInt();
            System.out.print("Quantidade: ");
            quant = entrada.nextInt();

            // soma o total daquele produto
            // vendas.length = tamanho do vendas
            if (produto >= 1 && produto <= vendas.length) {
                vendas[produto - 1] += quant;
            } else {
                System.out.println("Digite apenas de 1 a 3 no produto!");
            }

            System.out.println("Quer continuar (S/N):");
            continua = entrada.next();

        } while (continua.equalsIgnoreCase("S"));

        for (int i = 0; i < vendas.length; i++) {
            System.out.println("Total produto " + (i + 1) + ": " + vendas[i]);
        }
    }
}
