package exercicioDojoPuzzle.model;

/*Calculando estatísticas simples

        Sua tarefa é processar uma seqüência de números inteiros para determinar as seguintes estatísticas:

        Valor mínimo
        Valor máximo
        Número de elementos na seqüência
        Valor médio
        Por exemplo para uma seqüência de números "6, 9, 15, -2, 92, 11", temos como saída:

        Valor mínimo: -2
        Valor máximo: 92
        Número de elementos na seqüência: 6
        Valor médio: 18.1666666*/

import java.util.Arrays;

public class ExercicioDojoPuzzles {
    public static void main(String[] args) {

        Lista lista = new Lista(new int[]{100, 9, 21, -2, 92, 11});


        lista.setLista(lista.getLista());

        System.out.println("Maior Valor em lista: " + lista.maiorValor());

        System.out.println("Menor valor em lista: " + lista.menorValor());

        System.out.println("Média dos valores em lista: " + lista.media());

        System.out.println("Número de elementos na lista: " + lista.tamanho());
    }
}
