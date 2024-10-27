package utilidades;

//classe funcionarioHorista implementa a interface, onde terá o bonus com o valor de 10% de todo o salario anual recebido
//também define o método (construtor) e sobrescreve o método com o resultado da soma (override)
public class FuncionarioHorista implements Funcionario {
    private double totalAnualRecebido;

    // Construtor para definir o total anual recebido
    public FuncionarioHorista(double totalAnualRecebido) {
        this.totalAnualRecebido = totalAnualRecebido;
    }

    @Override
    public double calcularBonus() {
        return totalAnualRecebido * 0.10;
    }
}
