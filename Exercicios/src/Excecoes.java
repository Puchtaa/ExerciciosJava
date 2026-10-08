import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite sua idade (inteiro): ");
            int idade = scanner.nextInt();

            System.out.print("Digite sua altura (ex: 1,75): ");
            double altura = scanner.nextDouble();

            System.out.println("\nDados cadastrados com sucesso!");
            System.out.println("Idade: " + idade + " anos | Altura: " + altura + "m");

        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("\nErro: Entrada inválida! Digite apenas números.");
        } finally {
            scanner.close();
        }
    }
}