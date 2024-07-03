import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Entrada de dados
        float soma = 0;
        for(int i=1;i<=4;i++){
            System.out.print("Digite um número: ");
            float num = Float.parseFloat(input.nextLine());
            soma += num;
        }

        System.out.println("A soma dos números é: "+soma);
    }
}
