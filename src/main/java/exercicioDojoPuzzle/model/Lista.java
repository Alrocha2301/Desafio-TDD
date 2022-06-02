package exercicioDojoPuzzle.model;

import java.util.Random;

public class Lista {

    int[] lista;

    public Lista(int[] lista) {
        this.lista = lista;
    }

    public Lista() {
    }

    public int[] getLista() {
        return lista;
    }

    public void setLista(int[] lista) {
        this.lista = lista;
    }

    public int maiorValor() {
        int maior = lista[0];
        for (int i: lista) {
            if (i > maior) maior = i;
        }
        return maior;
    }

    public int menorValor() {
        int menor = lista[0];
        for (int i: lista) {
            if (i < menor) menor = i;
        }
        return menor;
    }

    public int tamanho() {
        int numeroDeElementos = 0;
        for (int i: lista) {
            numeroDeElementos++;
        }
        return numeroDeElementos;
    }

    public Double media() {
         double total = 0d;
        for (int i: lista) {
            total += i;
        }
        return total / tamanho();
    }
}
