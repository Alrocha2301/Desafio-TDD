package exercicio04.model;

public class Supervisor extends Funcionario {

    public Supervisor(String nome, int idade, Double salario) {
        super(nome, idade, salario);
    }

    public Supervisor() {
    }

    @Override
    public Double bonificacao() {
        return getSalario() + 5000;
    }
}
