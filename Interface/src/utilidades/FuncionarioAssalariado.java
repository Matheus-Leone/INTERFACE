package utilidades;

//classe funcionarioAssalariado implementa a interface, onde terá o valor fixo como bonus de salario
//também define o método (construtor) e sobrescreve o método com o resultado da soma (override)
public class FuncionarioAssalariado implements Funcionario {
    private static final double BONUS_FIXO = 5000.00;
    private double salario;

    // Construtor para definir o salário
    public FuncionarioAssalariado(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularBonus() {
        return salario + BONUS_FIXO;
    }
}
