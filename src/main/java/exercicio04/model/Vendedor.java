package exercicio04.model;

public class Vendedor extends Funcionario {

    public Vendedor(String nome, int idade, Double salario) {
        super(nome, idade, salario);
    }

    public Vendedor() {
    }

    @Override
    public Double bonificacao() {
        return getSalario() + 3000;
    }
}
