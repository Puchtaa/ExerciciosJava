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
            int mediaEstudante = somaIdadeEstudante / qtdEstudante;
            System.out.printf("Média de idade dos estudantes: %d anos (%d cadastrados)\n",
                    mediaEstudante, qtdEstudante);
        }
        if (qtdNaoEstudante > 0) {
            int mediaNaoEstudante = somaIdadeNaoEstudante / qtdNaoEstudante;
            System.out.printf("\nMédia de idade dos não estudantes: %d anos (%d cadastrados)",
                    mediaNaoEstudante, qtdNaoEstudante);
        }

    }
}

