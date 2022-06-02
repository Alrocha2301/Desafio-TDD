package exercicio03.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagoTest {

    Mago mago;

    @BeforeEach
    public void setup() {
        mago = new Mago();
    }

    @Test
    public void deveSubirLevel() {
        mago.lvlUp();
        assertEquals(1, mago.getLevel());
    }

    @Test
    public void deveAumentarAtributosEspecificosMagoUmLvlUp() {
        mago.lvlUp();
        assertEquals(1, mago.getVida());
        assertEquals(1, mago.getForca());
        assertEquals(2, mago.getInteligencia());
        assertEquals(2, mago.getMana());
    }

    @Test
    public void deveRetornarAumentoMaiorDeManaDoQueForcaDoisLvlUp() {
        mago.lvlUp();
        mago.lvlUp();
        assertEquals(3, mago.getForca());
        assertEquals(6, mago.getMana());
    }

    @Test
    public void deveIncluirMagiaNaLista() {
        mago.aprenderMagia("gelo");
        assertFalse(mago.getMagias().isEmpty());
    }

    @Test
    public void deveExibirListaDeMagias() {
        mago.aprenderMagia("gelo");
        mago.aprenderMagia("fogo");
        mago.exibirMagias(mago.getMagias());
        assertFalse(mago.getMagias().isEmpty());
    }

    @Test
    public void deveIndicarValorDeAtaque() {
        assertTrue(mago.atack() > 1 && mago.atack() < 300);
    }
}