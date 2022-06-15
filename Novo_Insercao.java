import java.util.Arrays;

public class Novo_Insercao {
    /* nessa ordenação por inserção o laço interno é responsavel pela comparação e pela troca de posições dos
    * elementos , deixando em ordem crescente a cada vez que faz a comparação.*/

    public static void main(String[] args) {
        int [] cartas = {3,8,1,4,6,9,2};
        int carta_para_ordenar = 0;
        int indice_de_comparacao =0;

        // á variável I começa em 1 , e percorre até á última posição da variável CARTAS.
        for (int i = 1;i < cartas.length;i ++){

            carta_para_ordenar = cartas[i]; // esta variável está recebendo o valor da posição do I =

            indice_de_comparacao= i-1; // esta variável esta recebendo a posição em que estiver o I menos 1.

            /* nesse laço ENQUANTO a variável INDICE_DE_COMPARAÇÃO for maior ou igual a zero , e o valor da variável
            CARTAS_PARA_ORDENAR   for menor que o valor da posição atual da variável INDICE_DE_COMPARAÇÃO irá realizar os comandos  */

            while ( (indice_de_comparacao >= 0) && (carta_para_ordenar < cartas[indice_de_comparacao]) ){

                cartas[indice_de_comparacao + 1] = cartas[indice_de_comparacao]; /* aqui o valor de uma  posição á mais  da variável
                INDICE_DE_COMPARAÇÃO está recebendo o valor da posição atual de INDICE_DE_COMPARAÇÃO   */

                indice_de_comparacao --; /* e aqui o valor da variável INDICE_DE_COMPARAÇÃO é subtraido por 1 , se ele for 0
                vai passar a ser -1 ( MENOS UM ) e o laço vai encerrar pois não será mais verdadeiro */
            }
            cartas[indice_de_comparacao + 1 ] = carta_para_ordenar; /* aqui o valor da posição atual da variável
             INDICE_DE_COMPARAÇÃO somado com 1 ,  irá receber o valor da variável CARTAS_PARA_ORDENAR */
        }
        Arrays.stream(cartas).forEach(System.out::println);
    }
}
