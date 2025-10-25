import java.util.Scanner;
public class CalculoMedia2 {
    public static void main(String [] args){
        double media, n1, n2, n3;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite n1: ");
        n1 = entrada.nextInt();
        System.out.print("Digite n2: ");
        n2 = entrada.nextInt();
        System.out.print("Digite n3: ");
        n3 = entrada.nextInt();
        media = (n1 + n2 + n3)/3;
        System.out.print("A média é: "+ media);
        if (media >= 7)
        System.out.println("Aprovado!");
        else
        System.out.println("Reprovado!");
        entrada.close();
        
    }
    
}
