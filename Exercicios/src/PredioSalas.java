import java.util.Scanner;

public class PredioSalas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] empresas = {
                "Dr. Silva, Dentista",
                "Contabilidade Silva",
                "Dr. Silva, Cardiologista",
                "Silvana Silva, Manicure",
                "Silva & Silva Advogados Associados" };

        int sala = 0;
        System.out.print("Digite o número da sala: ");
        sala = scanner.nextInt();
        if (sala >= 101 && sala <= 105) {
            System.out.println(empresas[sala - 101]);
        } else {
            System.out.println("Digite um número entre 101 e 105");
        }
    }
}
