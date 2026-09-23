import java.util.Random;
import java.util.Scanner;

/*Ex 2.3: Adivinhe o numero
  - gerar um numero aleatorio entre 1 e 3
  - pedir para a pessoa tentar adivinhar
  - informar se acertou ou errou
  TAREFA:
  - use o numero aleatorio que ja foi gerado no inicio da main
  - peça para a pessoa digitar um chute
  - compare o chute com o numero gerado
  - diga se a pessoa acertou ou errou
  - não é necessário repetir a tentativa: é só para exercitar um IF
  DESAFIO:
  - adicione uma decisão para reclamar se a pessoa digitar um numero
    que não esteja entre 1 e 3*/
public class Ex02_3 {
    public static void main(String[] args) {
        // gera um numero aleatorio entre 1 e 3
        Random random = new Random();
        int numeroSorteado = random.nextInt(3) + 1;

        // comece seu código aqui

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número aleatório: ");
        int numero = scanner.nextInt();


        if (numeroSorteado == numero){
            System.out.println("Parabéns, você acertou!");
        }else {
            System.out.printf("Número errado!");
        }
    }
}
