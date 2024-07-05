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
public class Ex08 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
         double somaQuadrados = 0;
          for (int i = 1; i <= 4; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = scanner.nextDouble();
            double quadrado = numero * numero; 
            somaQuadrados += quadrado; 
        }
          System.out.println("A soma dos quadrados é " + somaQuadrados);

         scanner.close();
            
    }
 }
