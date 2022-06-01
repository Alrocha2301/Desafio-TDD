package exercicio02.model;

import exercicio02.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {
    String marca;
    String modelo;
    boolean isUsado;

    public VideoGame(String nome, Double preco, int qtd, String marca, String modelo, boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    public VideoGame() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }

    @Override
    public Double calcularImposto() {
        Double imposto = 0d;
        if (isUsado()) {
            imposto = getPreco() * 0.25;
            System.out.println("Imposto " + getNome() + " " + getModelo() + " usado, R$ " + imposto + ".");
        }else {
            imposto = getPreco() * 0.45;
            System.out.println("Imposto " + getNome() + " " + getModelo() + " novo, R$ " + imposto + ".");
        }
        return imposto;
    }
}
