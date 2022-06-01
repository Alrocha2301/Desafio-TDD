package exercicio02.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VideoGameTest {

    VideoGame videoGame;

    @BeforeEach
    public void setup() {
        videoGame = new VideoGame();
        videoGame.setPreco(100d);

    }

    @Test
    public void deveCalcularImpostoSobreVideoGameUsado() {
        videoGame.setUsado(true);
        assertEquals(25, videoGame.calcularImposto());
    }

    @Test
    public void deveCalcularImpostoSobreVideoGameNovo() {
        videoGame.setUsado(false);
        assertEquals(45, videoGame.calcularImposto());
    }



}