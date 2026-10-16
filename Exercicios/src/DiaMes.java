import java.util.Scanner;

public class DiaMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tamanhoMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Digite o dia de vencimento: ");
        int dia = scanner.nextInt();
        System.out.print("Digite o mês de vencimento: ");
        int mes = scanner.nextInt();

        if (mes >= 1 && mes <= 12) {
            int maxDiasDoMes = tamanhoMes[mes - 1];

            if (dia >= 1 && dia <= maxDiasDoMes) {
                System.out.printf("Data de vencimento válida: %02d/%02d\n", dia, mes);
            } else {
                System.out.printf("Data inválida! O mês %d possui no máximo %d dias.\n", mes, maxDiasDoMes);
            }
        } else {
            System.out.println("Data inválida! O mês deve estar entre 1 e 12.");
        }

        scanner.close();
    }
}