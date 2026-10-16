import java.util.Scanner;

public class ExVetor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int produto;
        int qtd;
        int vendas1 = 0, vendas2 = 0, vendas3 = 0;
        String continua;

        do {
            System.out.print("Produto: ");
            produto = scanner.nextInt();
            System.out.print("Quantidade: ");
            qtd = scanner.nextInt();

            if (produto == 1) {
                vendas1 += qtd;
            } else if (produto == 2) {
                vendas2 += qtd;
            } else if (produto == 3) {
                vendas3 += qtd;
            } else {
                System.out.println("Digite 1 a 3 no produto! ");
            }
            System.out.printf("Deseja registrar mais uma venda (S/N): ");
            continua = scanner.next();

        } while (continua.equalsIgnoreCase("S"));
        System.out.println("Total Produto 1: " + vendas1 + " unidades");
        System.out.println("Total Produto 2: " + vendas2 + " unidades");
        System.out.println("Total Produto 3: " + vendas3 + " unidades");

    }
}
