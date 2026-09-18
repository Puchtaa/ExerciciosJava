import java.util.Scanner;

/*-------------------------------------------------------------------
  Ex 1.5: Troca de dinheiro
  - informar um valor inteiro em reais, sem os centavos
  - calcular quantas notas e moedas podem ser obtidas na troca

  TAREFA:
  - peça para o usuário informar um valor inteiro em reais, sem os centavos
  - calcule e imprima quantas notas de 50, 10, 5 e 2 reais
    e quantas moedas de 1 real é preciso para fazer esse valor
  - não é necessário usar if em nenhum lugar: use apenas divisão inteira (/)
    e resto da divisão (%)

  DESAFIO:
  - depois de terminar, altere o programa para aceitar um valor double,
    incluindo os centavos
  - calcule e imprima também quantas moedas de 50, 25, 10, 5 e 1 centavo
    podem ser obtidas
-------------------------------------------------------------------*/
public class Ex01_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantia de dinheiro: ");


        int valorDinheiro = teclado.nextInt();

        int saldo = valorDinheiro;

        int qtdNotasDe50 = saldo / 50;
        saldo = saldo % 50;

        int qtdNotasDe10 = saldo / 10;
        saldo = saldo % 10;

        int qtdNotasDe5 = saldo / 5;
        saldo = saldo % 5;

        int qtdNotasDe2 = saldo / 2;
        saldo = saldo % 2;

        int qtdMoedasDe1 = saldo / 1;
        saldo = saldo % 1;



        System.out.println("Notas de R$50 :"+ qtdNotasDe50);
        System.out.println("Notas de R$10 :"+qtdNotasDe10);
        System.out.println("Notas de R$5 :"+qtdNotasDe5);
        System.out.println("Notas de R$2 :"+qtdNotasDe2);
        System.out.println("Moedas de R$1 :"+qtdMoedasDe1);

    }
}