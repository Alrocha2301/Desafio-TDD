package exercicio02.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    Livro livro;

    @BeforeEach
    public void setup() {
        livro = new Livro();
        livro.setTema("fantasia");
        livro.setNome("Nome");
        livro.setPreco(50d);
    }

    @Test
    public void deveCalcularImpostoSobreLivro() {
        assertEquals(5d, livro.calcularImposto());
    }

    @Test
    public void deveRetornarImpostoZeroParaLivroEducativo() {
        livro.setTema("educativo");
        assertEquals(0d, livro.calcularImposto());
    }
}