import java.util.Scanner;
public class Q03 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double salario, horasTrabalhadas, salarioHora;

        System.out.println("Quanto você ganha por hora?");
        salarioHora = entrada.nextDouble();

        System.out.println("Quantas horas você trabalha por mês?");
        horasTrabalhadas = entrada.nextDouble();

        salario = salarioHora * horasTrabalhadas;

        System.out.println("Seu salário mensal é: R$ " + salario);

        entrada.close();
    }
}
