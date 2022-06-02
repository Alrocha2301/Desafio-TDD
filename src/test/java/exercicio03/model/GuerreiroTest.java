package exercicio03.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuerreiroTest {

    Guerreiro guerreiro;

    @BeforeEach
    public void Setup() {
        guerreiro = new Guerreiro();
    }

    @Test
    public void deveSubirLevel() {
        guerreiro.lvlUp();
        assertEquals(1, guerreiro.getLevel());
    }

    @Test
    public void deveAumentarAtributosEspecificosGuerreiroUmLvlUp() {
        guerreiro.lvlUp();
        assertEquals(2, guerreiro.getVida());
        assertEquals(2, guerreiro.getForca());
        assertEquals(1, guerreiro.getInteligencia());
        assertEquals(1, guerreiro.getMana());
    }

    @Test
    public void deveRetornarAumentoMaiorDeForcaDoQueManaDoisLvlUp() {
        guerreiro.lvlUp();
        guerreiro.lvlUp();
        assertEquals(6, guerreiro.getForca());
        assertEquals(3, guerreiro.getMana());
    }

    @Test
    public void deveIncluirHabilidadeNaLista() {
        guerreiro.aprenderHabilidade("soco");
        assertFalse(guerreiro.getHabilidades().isEmpty());
    }

    @Test
    public void deveExibirListaDeHabilidades() {
        guerreiro.aprenderHabilidade("soco");
        guerreiro.aprenderHabilidade("chute");
        guerreiro.exibirHabilidades(guerreiro.getHabilidades());
        assertFalse(guerreiro.getHabilidades().isEmpty());
    }

    @Test
    public void deveIndicarValorDeAtaque() {
        assertTrue(guerreiro.atack() > 1 && guerreiro.atack() < 300);
    }


}