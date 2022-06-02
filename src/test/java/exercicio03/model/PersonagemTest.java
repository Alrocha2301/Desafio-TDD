package exercicio03.model;

import exercicio03.model.Personagem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonagemTest {

    Personagem personagem;

    @BeforeEach
    public  void setup() {
        personagem = new Personagem();

    }

    @Test
    public void deveCriarObjetoPesonagem(){
        Personagem personagem = new Personagem();
    }

    @Test
    public void deveMostrarPersonagem() {
        personagem.mostrarPersonagem();
        assertNotNull(personagem);

    }
}