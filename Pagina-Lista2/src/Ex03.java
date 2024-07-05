/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Jao Sutil
 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        // Calcular o antecessor e o sucessor.
        int antecessor = num - 1;
        int sucessor = num + 1;

        // Imprimir o antecessor e o sucessor na tela.
        System.out.println("O antecessor de " + num + " é: " + antecessor);
        System.out.println("O sucessor de " + num + " é: " + sucessor);

        scanner.close();
        
      
        
    }
}
