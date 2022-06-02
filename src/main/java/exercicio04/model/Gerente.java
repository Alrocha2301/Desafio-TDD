package exercicio04.model;

public class Gerente extends Funcionario {
    public Gerente(String nome, int idade, Double salario) {
        super(nome, idade, salario);
    }

    public Gerente() {
    }

    @Override
    public Double bonificacao() {
        return getSalario() + 10000;
    }
}
