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
public class Ex09 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para calcular a raiz quadrada: ");
        double numero = scanner.nextDouble();

        // Calcular a raiz quadrada
        double raizQuadrada = Math.sqrt(numero);

        // Exibir o resultado para o usuário
        System.out.println("A raiz quadrada de " + numero + " é " + raizQuadrada);

        scanner.close();
    }
}


