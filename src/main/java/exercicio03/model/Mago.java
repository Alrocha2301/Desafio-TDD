package exercicio03.model;

import exercicio03.interfaces.Acoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem implements Acoes {

    List<String> magias = new ArrayList<>();
    static int CONTADOR_MAGO = 0;

    public Mago() {
    }

    public Mago(String nome, int vida, int mana, Double xp, int inteligencia, int forca, int level, List<String> magias) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.magias = magias;
        CONTADOR_MAGO++;
    }

    public List<String> getMagias() {
        return magias;
    }

    public void setMagias(List<String> magias) {
        this.magias = magias;
    }

    @Override
    public void lvlUp() {
        setLevel(getLevel() + 1);
        setVida(getVida() + getLevel());
        setForca(getForca() + getLevel());
        setMana(getMana() + getLevel() * 2);
        setInteligencia(getInteligencia() + getLevel() * 2) ;
    }

    public void aprenderMagia(String magia) {
        magias.add(magia);
    }

    @Override
    public int atack() {
        Random numeroAleatorio = new Random();
        return getInteligencia() * getLevel() + numeroAleatorio.nextInt(300);
    }

    public void exibirMagias(List<String> magias) {
        System.out.print("Magias: " + magias);
    }

    public static int contadorPersonagem() {
        return CONTADOR_MAGO;
    }
}
