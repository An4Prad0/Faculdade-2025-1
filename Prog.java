import java.util.Scanner;
public class Prog { 
public static void main (String[] args){
            double nota1,nota2,nota3,media;
        @SuppressWarnings("resource")
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a Primeira nota: ");
        nota1 = leitor.nextDouble();
        System.out.println("Você digitou: " + nota1);
        System.out.println("Digite a Segunda nota: ");
        nota2 = leitor.nextDouble();
        System.out.println("Você digitou: " + nota2);
        System.out.println("Digite a terceira nota: ");
        nota3 = leitor.nextDouble();
        System.out.println("Você digitou: " + nota3);
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média é: " + media);
}
}
        