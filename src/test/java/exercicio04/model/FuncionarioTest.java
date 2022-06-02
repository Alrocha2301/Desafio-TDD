package exercicio04.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    Funcionario funcionario;

    @BeforeEach
    public void setup() {
        funcionario = new Gerente();
    }

    @Test
    public void deveRetornarSalarioComBonusGerente() {
        funcionario = new Gerente();
        funcionario.setSalario(4000.0);
        assertEquals(14000d, funcionario.bonificacao());
    }

    @Test
    public void deveRetornarSalarioComBonusSupervisor() {
        funcionario = new Supervisor();
        funcionario.setSalario(2500d);
        assertEquals(7500d, funcionario.bonificacao());
    }

    @Test
    public void deveRetornarSalarioComBonusVendedor() {
        funcionario = new Vendedor();
        funcionario.setSalario(1700d);
        assertEquals(4700d, funcionario.bonificacao());
    }
}