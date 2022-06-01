package exercicio01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VeiculoTest {

    private Veiculo veiculo;

    @BeforeEach
    public void setup() {
        veiculo = new Veiculo();
        /*veiculo = new Veiculo("Ford",
                "Fiesta",
                "AAA9999",
                "prata",
                10000f,
                true,
                40,
                80,
                18000d);*/
    }

    @Test
    public void deveAumentarVelocidadeEm20ComVeiculoLigado() {
        veiculo.setLigado(true);
        veiculo.setVelocidade(60);
        veiculo.acelerar();
        assertEquals(80, veiculo.getVelocidade());
    }

    @Test
    public void deveAumentarVelocidadeEm20ComVeiculoParado() {
        veiculo.setLigado(true);
        veiculo.setVelocidade(0);
        veiculo.acelerar();
        assertEquals(20, veiculo.getVelocidade());
    }

    @Test
    public void deveRetornarZeroSeVeiculoEstaParadoEDesligado() {
        veiculo.setVelocidade(0);
        veiculo.setLigado(false);
        veiculo.acelerar();
        assertEquals(0, veiculo.getVelocidade());
    }

    @Test
    public void deveIndicarTanqueCheioESobraDeCombustivel() {
        veiculo.setLitrosCombustivel(48);
        veiculo.abastecer(20);
        assertEquals(60, veiculo.getLitrosCombustivel());
    }

    @Test
    public void deveConseguirReceberTodoOCombustivel() {
        veiculo.setLitrosCombustivel(30);
        veiculo.abastecer(20);
        assertEquals(50, veiculo.getLitrosCombustivel());
    }

    @Test
    public void deveRecusarAbastecimentoPorVeiculoEstarLigado() {
        veiculo.setLitrosCombustivel(30);
        veiculo.setLigado(true);
        veiculo.abastecer(20);
        assertEquals(30, veiculo.getLitrosCombustivel());
    }

    @Test
    public void deveDiminuirVelocidadeEm20ComVeiculoEmMovimento() {
        veiculo.setVelocidade(50);
        veiculo.frear();
        assertEquals(30, veiculo.getVelocidade());
    }

    @Test
    public void devePararOVeiculoSeVelocidadeMenorQue20() {
        veiculo.setVelocidade(15);
        veiculo.frear();
        assertEquals(0, veiculo.getVelocidade());
    }

    @Test
    public void deveIndicarQueOVeiculoEstaParado() {
        veiculo.setVelocidade(0);
        veiculo.frear();
        assertEquals(0, veiculo.getVelocidade());
    }

    @Test
    public void deveRetornarNovaCor() {
        veiculo.setCor("Preto");
        assertEquals("Prata", veiculo.pintar("Prata"));
    }

    @Test
    public void deveLigarOVeiculoCasoEstejaDesligado() {
        veiculo.setLigado(false);
        veiculo.ligar();
        assertNotEquals(false, veiculo.isLigado());
    }

    @Test
    public void deveIgnorarCasoVeiculoEstejaLigado() {
        veiculo.setLigado(true);
        veiculo.ligar();
        assertTrue(veiculo.isLigado());
    }

    @Test
    public void deveDesligarVeiculoParadoELigado() {
        veiculo.setVelocidade(0);
        veiculo.setLigado(true);
        veiculo.desligar();
        assertFalse(veiculo.isLigado());

    }

    @Test
    public void deveIndicarQueVeiculoJaEstaDesligado() {
        veiculo.setLigado(false);
        veiculo.desligar();
        assertFalse(veiculo.isLigado());
    }

    @Test
    public void naoDevePermitirDesligarComVeiculoEmMovimento() {
        veiculo.setLigado(true);
        veiculo.setVelocidade(20);
        veiculo.desligar();
        assertTrue(veiculo.isLigado());
    }











}