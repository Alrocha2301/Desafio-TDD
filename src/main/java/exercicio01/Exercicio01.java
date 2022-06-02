package exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();
        veiculo.setMarca("Ford");
        veiculo.setModelo("Fiesta");
        veiculo.setPlaca("AAA9999");
        veiculo.setCor("Prata");
        veiculo.setKm(116798f);
        veiculo.setLigado(false);
        veiculo.setLitrosCombustivel(48);
        veiculo.setVelocidade(0);
        veiculo.setPreco(20000d);

        System.out.println("\nMétodo acelerar: com veículo desligado.");
        veiculo.acelerar();
        System.out.println("Velocidade após acelerar(): " + veiculo.getVelocidade() + " km/h");


        System.out.println("\nMétodo acelerar: com veículo ligado e parado.");
        veiculo.ligar();
        veiculo.acelerar();
        System.out.println("Velocidade após acelerar(): " + veiculo.getVelocidade() + " km/h");

        System.out.println("\nMétodo abastecer: acima do limite.");
        veiculo.frear();
        veiculo.desligar();
        veiculo.abastecer(20);

        System.out.println("\nMétodo abastecer: abaixo do limite.");
        veiculo.setLitrosCombustivel(15);
        veiculo.abastecer(20);
        System.out.println("Quantidade de combustível após abastecer: " + veiculo.getLitrosCombustivel() + " litros.");

        System.out.println("\nMétodo abastecer: veículo ligado.");
        veiculo.ligar();
        veiculo.abastecer(20);

        System.out.println("\nMétodo frear: veículo parado.");
        veiculo.setVelocidade(0);
        veiculo.frear();

        System.out.println("\nMétodo frear: veículo em movimento abaixo de 20 km/h.");
        veiculo.setVelocidade(15);
        veiculo.frear();
        System.out.println("Velocidade após frear(): " + veiculo.getVelocidade() + " km/h.");


        System.out.println("\nMétodo frear: veículo em movimento acima de 20 km/h.");
        veiculo.setVelocidade(35);
        veiculo.frear();
        System.out.println("Velocidade após frear(): " + veiculo.getVelocidade() + " km/h.");

        System.out.println("\nMétodo pintar:");
        System.out.println("Cor do veículo antes de pintar: " + veiculo.getCor());
        veiculo.pintar("preto");
        System.out.println("Nova cor do veículo: " + veiculo.getCor());

        System.out.println("\nMétodo ligar: veiculo ligado.");
        veiculo.setLigado(true);
        veiculo.ligar();
        System.out.println("Veículo ligado? " + veiculo.isLigado());

        System.out.println("\nMétodo ligar: veiculo desligado.");
        veiculo.setLigado(false);
        veiculo.setVelocidade(0);
        veiculo.ligar();
        System.out.println("Veículo ligado? " + veiculo.isLigado());

        System.out.println("\nMétodo desligar: veículo parado.");
        veiculo.setVelocidade(0);
        veiculo.setLigado(true);
        veiculo.desligar();
        System.out.println("Veículo ligado? " + veiculo.isLigado());

        System.out.println("\nMétodo desligar: veículo em movimento.");
        veiculo.setVelocidade(10);
        veiculo.setLigado(true);
        veiculo.desligar();
        System.out.println("Veículo ligado? " + veiculo.isLigado());
    }
}
