package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Guerreiro extends Personagem {

    List<String> habilidades = new ArrayList<>();
    static int CONTADOR_GUERREIRO;

    public Guerreiro(String nome, int vida, int mana, Double xp, int inteligencia, int forca, int level, List<String> habilidades) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.habilidades = habilidades;
        this.CONTADOR_GUERREIRO++;
    }

    public Guerreiro(String nome, int vida, int mana, Double xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
    }

    public Guerreiro() {
    }


}
