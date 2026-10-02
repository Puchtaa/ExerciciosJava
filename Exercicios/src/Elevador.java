import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAX_PESSOAS = 5;
        final double MAX_PESO = 300.0;

        int pessoasNoElevador = 0;
        double pesoAtual = 0.0;
        boolean temMaisPessoas = true;

        while (pessoasNoElevador < MAX_PESSOAS && pesoAtual < MAX_PESO && temMaisPessoas) {
            System.out.printf("\nPessoas no elevador: %d, Peso atual: %.1f kg\n", pessoasNoElevador, pesoAtual);
            System.out.print("Informe o peso da pessoa (kg): ");
            double pesoPessoa = scanner.nextDouble();

            if (pesoAtual + pesoPessoa <= MAX_PESO) {
                pesoAtual += pesoPessoa;
                pessoasNoElevador++;
                System.out.println("A pessoa entrou no elevador.");
            } else {
                System.out.println("Você não pode entrar: limite de peso ultrapassado!");
            }

            if (pessoasNoElevador < MAX_PESSOAS && pesoAtual < MAX_PESO) {
                System.out.print("Tem mais pessoas na fila? (S/N): ");
                String resposta = scanner.next();
                if (!resposta.equalsIgnoreCase("s")) {
                    temMaisPessoas = false;
                }
            }
        }

        System.out.printf("\nsubindo com %d pessoas e %.1f kg\n", pessoasNoElevador, pesoAtual);

    }
}