import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Entrada de dados
        System.out.print("Digite número de ponto flutuante: ");
        float num1 = Float.parseFloat(input.nextLine());
        System.out.print("Digite o segundo número de ponto flutuante: ");
        float num2 = Float.parseFloat(input.nextLine());
        System.out.print("Digite o terceiro número de ponto flutuante: ");
        float num3 = Float.parseFloat(input.nextLine());
// Calculo
        float soma = num1 + num2 + num3;

// Saida de dados
        System.out.println("A soma dos três números é: "+soma);
    }
}
