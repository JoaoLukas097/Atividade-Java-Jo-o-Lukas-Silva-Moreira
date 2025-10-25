import java.util.Scanner;
public class ConversaoIdade {
    public static void main(String[] args){
        int idade, meses, dias;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        idade = entrada.nextInt();
        meses = idade * 12;
        dias = idade * 365;
        System.out.print("Equivale a "+meses+" meses ou "+dias+" dias");
        entrada.close();

    }
    
}
