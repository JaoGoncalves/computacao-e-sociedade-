import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Entrada de dados
        System.out.print("Digite um número de ponto flutuante: ");
        float num1 = Float.parseFloat(input.nextLine());
        System.out.print("Digite um segundo número de ponto flutuante: ");
        float num2 = Float.parseFloat(input.nextLine());
// Soma
        float soma = num1 + num2;

// Saída de dados
        System.out.println("A soma dos dois números é: "+soma);
    }
}