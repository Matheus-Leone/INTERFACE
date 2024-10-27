package principal;

//import para pegar as informações do outro pacote (utilidades)
import utilidades.FuncionarioAssalariado;
import utilidades.FuncionarioHorista;

//Classe principal para instanciar os métodos 
public class Main {
    public static void main(String[] args) {
        // Criando instâncias dos funcionários com salário e total anual recebido
        FuncionarioAssalariado funcionarioA = new FuncionarioAssalariado(30000.00);
        FuncionarioHorista funcionarioB = new FuncionarioHorista(60000.00);

        // Calculando salários e bônus
        double salarioA = 30000.00;
        double bonusA = funcionarioA.calcularBonus() - salarioA;
        
        double salarioB = 60000.00;
        double bonusB = funcionarioB.calcularBonus();

        // Exibindo salário e bônus dos funcionários A e B
        System.out.println("SalarioA: Salario do Funcionario Felipe: R$ " + salarioA + "\n");
        System.out.println("BonusA: Bônus do Funcionario Felipe: R$ " + bonusA + "\n");
        System.out.println("SalarioB: Salario do Funcionario Romário: R$ " + salarioB + "\n");
        System.out.println("BonusB: Bônus do Funcionario Romário: R$ " + bonusB + "\n");
    }
}
