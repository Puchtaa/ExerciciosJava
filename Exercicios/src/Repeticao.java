import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto;
        int voltas = 0;

        do {
            if (voltas > 3) {
                voltas--;
                break;
            }
            System.out.printf("%dºTentativa: Digite qualquer palavra: ", voltas);

            texto = scanner.next();
            voltas++;
        } while (!texto.equalsIgnoreCase("banana"));

        System.out.printf("Você tentou %d vezes\n", voltas);
        System.out.println("A palavra era banana");
    }
}