package exercicio01;

public class Veiculo {

    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private Double preco;

    public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado, int litrosCombustivel, int velocidade, Double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.km = km;
        this.isLigado = isLigado;
        this.litrosCombustivel = litrosCombustivel;
        this.velocidade = velocidade;
        this.preco = preco;
    }

    public Veiculo() {
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void acelerar() {
        if (isLigado || getVelocidade() > 0) {
            setVelocidade(getVelocidade() + 20);
        } else {
            System.out.println("O veiculo está desligado.");
        }
    }

    public void abastecer(int combustivel) {
        int limiteDoTanque = 60;
        if (!isLigado()) {
            if (getLitrosCombustivel() + combustivel > limiteDoTanque) {
                System.out.println("Tanque cheio. Sobraram " + (getLitrosCombustivel() + combustivel - 60) + " litros.");
                setLitrosCombustivel(limiteDoTanque);
            } else {
                setLitrosCombustivel(getLitrosCombustivel() + combustivel);
            }
        } else {
            System.out.println("Desligar o veículo antes de abastecer!");
        }
    }

    public void frear() {
        if (getVelocidade() == 0) {
            System.out.println("O veículo já está parado!");
        } else if (getVelocidade() < 20 && emMovimento()) {
            setVelocidade(0);
            System.out.println("O veículo parou!");
        } else {
            setVelocidade(getVelocidade() - 20);
        }
    }

    public String pintar(String cor) {
        this.setCor(cor);
        return getCor();
    }

    public void ligar() {
        if (!isLigado()) {
            this.setLigado(!isLigado());
        } else {
            System.out.println("Veículo já está ligado!");
        }
    }


    public void desligar() {
        if (emMovimento()) {
            System.out.println("O veículo está em movimento!");
        } else if (isLigado()) {
            setLigado(!isLigado());
        }
    }

    public boolean emMovimento() {
        if (getVelocidade() > 0) {
            return true;
        }
        return false;
    }
}
