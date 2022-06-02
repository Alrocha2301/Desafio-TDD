package exercicio03.model;

import exercicio03.interfaces.Acoes;

import javax.accessibility.AccessibleComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem implements Acoes {

    List<String> habilidades = new ArrayList<>();

    static int CONTADOR_GUERREIRO;

    public Guerreiro(String nome, int vida, int mana, Double xp, int inteligencia, int forca, int level, List<String> habilidades) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.habilidades = habilidades;
        this.CONTADOR_GUERREIRO++;
    }

    public Guerreiro() {
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public void lvlUp() {
        setLevel(getLevel() + 1);
        setVida(getVida() + getLevel() * 2);
        setForca(getForca() + getLevel() * 2);
        setMana(getMana() + getLevel());
        setInteligencia(getInteligencia() + getLevel()) ;
    }


    public void aprenderHabilidade(String habilidade) {
        habilidades.add(habilidade);
    }

    public void exibirHabilidades(List<String> habilidades) {
        System.out.print("Habilidades: " + habilidades);
    }

    @Override
    public int atack() {
        Random numeroAleatorio = new Random();
        return getForca() * getLevel() + numeroAleatorio.nextInt(300);
    }

    public static int contadorPersonagem() {
        return CONTADOR_GUERREIRO;
    }
}
