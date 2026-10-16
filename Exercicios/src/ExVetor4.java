public class ExVetor4 {
    public static void main(String[] args) {
        String[] estacoes = {"Primavera ", "Verão ", "Outono ", "Inverno"};
        System.out.println("\nImprimindo uma a uma: \n");
        System.out.println(estacoes[0]);
        System.out.println(estacoes[1]);
        System.out.println(estacoes[2]);
        System.out.println(estacoes[3]);

        //vasculha o vetor usando um laço contador

        System.out.println("\nImprimindo com um loop for(i)\n");
        for (int i = 0; i < estacoes.length; i++) {
            System.out.println(estacoes[i]);
        }

        //vasculha com um laço para-cada
        System.out.println("\nImprimindo com um loop for(i)\n");
        for (String nome : estacoes) {
            /*para cada nome no vetor estações:*/
            System.out.println(nome); /*imprima esse nome*/

        }
    }

}