package exercicio04.main;

import exercicio04.model.Gerente;
import exercicio04.model.Supervisor;
import exercicio04.model.Vendedor;

public class Exercicio04 {
    public static void main(String[] args) {

        Gerente gerente1 = new Gerente("João", 42, 6000d);
        Supervisor supervisor1 = new Supervisor("Maria", 36, 4000d);
        Vendedor vendedor1 = new Vendedor("José", 38, 2500d);

        System.out.println("Salário Gerente: R$ " + gerente1.bonificacao());

        System.out.println("Salário Supervisor: R$ " + supervisor1.bonificacao());

        System.out.println("Salário Vendedor: R$ " + vendedor1.bonificacao());
    }
}
