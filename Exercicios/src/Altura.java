import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pergunta;
        double altura = 0;
        double somaAltura = 0.0;
        int qtdPessoas = 0;
        int qtdAltos = 0;
        double somaAltos = 0;

        do {
            System.out.print("Qual sua altura? ");
            altura = scanner.nextDouble();

            if (altura >1.80){
                qtdAltos++;
                qtdAltos += altura;}

            somaAltura += altura;
            qtdPessoas++;

            System.out.print("Tem mais pessoas? S/N: ");
            pergunta = scanner.next();

        } while (
                pergunta.equalsIgnoreCase("s"));
        double mediaFinal = somaAltura / qtdPessoas;

        System.out.printf("A media da altura das %d pessoas é %.2f" ,qtdPessoas, mediaFinal);

        if (qtdAltos>0){
            double mediaAltos = somaAltos / qtdAltos;
            System.out.printf("A média de altura das pessoas altas é: %.2f", mediaAltos);
        }


    }
}
