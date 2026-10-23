import java.util.Scanner;

public class ChuteCores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cores = {
                "vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta" };

        int acertos=0, erros=0;
        String chutes=" ";

        while (true){
            System.out.println("Diga uma cor (digite \"desisto\" para sair: )");
            chutes =




            if (acertos==7){
                System.out.println("Parabéns!");
                break;
            }
            if (erros == 99){
                System.out.println("Admiro sua persistência mas quero ir dormir!");
                break;
            }
            if (chutes.equalsIgnoreCase("Desisto")){
                System.out.println("Boa sorte na proxima vez!");
                break;
            }
        }


    }
}
