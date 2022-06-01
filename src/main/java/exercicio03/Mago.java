package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Mago extends Personagem{

    List<String> magias = new ArrayList<>();
    static int CONTADOR_MAGO;

    public Mago(String nome, int vida, int mana, Double xp, int inteligencia, int forca, int level, List<String> magias) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.magias = magias;
        this.CONTADOR_MAGO++;
    }

    public Mago(String nome, int vida, int mana, Double xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
    }

    public Mago() {
    }
}
