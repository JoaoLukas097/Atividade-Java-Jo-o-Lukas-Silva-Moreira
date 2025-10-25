import java.util.Scanner;
public class Q04 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        double ganhaporhora, horasTrabalhadasmes, salariobruto, inss, impostorenda, sindicado, salarioliquido;

        System.out.println("Quanto você ganha por hora?");
        ganhaporhora = entrada .nextDouble();

        System.out.println("Quantas horas você trabalha por mês?");
        horasTrabalhadasmes = entrada .nextDouble();

        salariobruto = ganhaporhora * horasTrabalhadasmes;
        inss = salariobruto * 0.08;
        impostorenda = salariobruto * 0.11;
        sindicado = salariobruto * 0.05;
        salarioliquido = salariobruto - inss - impostorenda - sindicado;

        System.out.println("Seu salário bruto é: R$ " + salariobruto);
        System.out.println("Você pagou R$ " + inss + " de INSS.");
        System.out.println("Você pagou R$ " + sindicado + " de Sindicato.");
        System.out.println("Você pagou R$ " + impostorenda + " de Imposto de Renda.");
        System.out.println("Seu salário líquido é: R$ " + salarioliquido);

        entrada .close();
    }
}
