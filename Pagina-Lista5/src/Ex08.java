/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaifelse;

import java.util.Scanner;

/**
 *
 * @author Jao Sutil
 */
public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Entrada de dados
        System.out.print("Digite o seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite sua categoria(A,B,C,D,E,F,G ou H): ");
        char categoria = input.nextLine().charAt(0);
        System.out.print("Digite seu salario: ");
        double salario = Double.valueOf(input.nextLine());
        
        double salarioNovo = 0;
        double valor;
// Saída de dados
         switch (categoria) {
            case 'A':
            case 'H':
                salarioNovo = salario * 0.10;
                valor = salario + salarioNovo;
                break;
            case 'B':
            case 'D':
            case 'E':
                salarioNovo = salario * 0.15;
                valor = salario + salarioNovo;
                break;
            case 'C':
            case 'F':
                salarioNovo = salario * 0.25;
                valor = salario + salarioNovo;
                break;
            default:
                salarioNovo = salario * 0.30;
                valor = salario + salarioNovo;
        }
        
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Categoria do funcionário: " + categoria);
        System.out.println("Salário reajustado: R$" +valor);
    }
}
