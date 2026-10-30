import java.util.Scanner;

public class Eleicao {
    void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] mascotes = {
                "Saci",
                "Cuca",
                "Visconde"
        };
        int[] quant = new int[candidados.length];
        int voto = 0;
        while (voto != 999) {
            System.out.print("Digite o voto: ");
            voto = scanner.nextInt();
            if (voto == 999) break;
        }
        if (voto < 1 || voto > 3) {
            voto = 0; // nulo
        }
        System.out.println("Confirma o voto [" + voto);
        String confirma = scanner.next();
        if (confirma.equals("S")) {
            quant[voto]++;
        }
        int total = 0;
        for (int i = 0 i < quant.length; i++) {
            total += quant[i];
        }
        System.out.println("Resultados: ");
        double[] porc = new double[quant.length];
        for (int i = 0; i < quant.length; i++) {
            porc[i] = quant[i] / total;
            System.out.printf(i + "%2d - %-20s - %3d - %5.1f\n",
                    i, candidatos[i], quant[i], porc[i]);
        }
        int maior = 1;
        boolean empate = false;
        for (int i = 2; i < quant.length; i++) {
            if (quant[i] > quant[maior]) {
                maior = i;
                empate = false;
            }
            if (quant[i] == quant[maior]) {
                empate = true;
            }
        }

    }
}

