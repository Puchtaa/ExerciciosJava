import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pergunta;
        double somaAltura = 0.0;
        int qtdPessoas = 0;

        do {
            System.out.print("Qual sua altura? ");
            double altura = scanner.nextDouble();

            somaAltura += altura;
            qtdPessoas++;

            System.out.print("Tem mais pessoas? S/N: ");
            pergunta = scanner.next();

        } while (
                pergunta.equalsIgnoreCase("s"));
        double mediaFinal = somaAltura / qtdPessoas;

        System.out.printf("A media da altura das %d pessoas é %.2f" ,qtdPessoas, mediaFinal);


    }
}
