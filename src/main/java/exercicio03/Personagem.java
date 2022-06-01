package exercicio03;

public class Personagem {

    String nome;
    int vida;
    int mana;
    Double xp;
    int inteligencia;
    int forca;
    int level;

    public Personagem(String nome, int vida, int mana, Double xp, int inteligencia, int forca, int level) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.xp = xp;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.level = level;
    }

    public Personagem() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Double getXp() {
        return xp;
    }

    public void setXp(Double xp) {
        this.xp = xp;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
