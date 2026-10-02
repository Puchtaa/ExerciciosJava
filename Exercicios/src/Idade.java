import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdadeEstudante = 0;
        int qtdEstudante = 0;

        int somaIdadeNaoEstudante = 0;
        int qtdNaoEstudante = 0;

        String continuar;

        do {
            System.out.print("Informe sua idade: ");
            int idade = scanner.nextInt();

            System.out.print("É estudante? (S/N): ");
            String eEstudante = scanner.next();

            if (eEstudante.equalsIgnoreCase("s")) {
                somaIdadeEstudante += idade;
                qtdEstudante++;
            } else {
                somaIdadeNaoEstudante += idade;
                qtdNaoEstudante++;
            }

            System.out.print("Deseja cadastrar outra pessoa? (S/N): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("s"));

        if (qtdEstudante > 0) {
            double mediaEstudante = (double) somaIdadeEstudante / qtdEstudante;
            System.out.printf("Média de idade dos estudantes: %.0f anos (%d cadastrados)\n", mediaEstudante, qtdEstudante);
        }

        if (qtdNaoEstudante > 0) {
            double mediaNaoEstudante = (double) somaIdadeNaoEstudante / qtdNaoEstudante;
            System.out.printf("Média de idade dos não estudantes: %.2f anos (%d cadastrados)\n", mediaNaoEstudante, qtdNaoEstudante);
        }

    }
}