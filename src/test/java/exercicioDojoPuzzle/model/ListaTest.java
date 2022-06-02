package exercicioDojoPuzzle.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaTest {

    Lista lista;

    @BeforeEach
    public void setup() {
        lista = new Lista(new int[]{100, 9, 21, -2, 92, 11});
    }

    @Test
    public void deveRetornarQueListaExiste() {
        assertNotNull(lista);
    }
    
    @Test
    public void deveRetornarMenorValor() {
        assertEquals(-2, lista.menorValor());
    }

    @Test
    public void deveRetornarMaiorValor() {
        assertEquals(100, lista.maiorValor());
    }

    @Test
    public void deveRetornarNumeroDeElementosNaLista() {
        assertEquals(6, lista.tamanho());
    }

    @Test
    public void deveCalcularMediaDeLista() {
        assertEquals(38.5, lista.media());
    }
}