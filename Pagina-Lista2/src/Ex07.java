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
public class Ex07 {
    public static void main(String[] args) {
        Scanner algoritmo = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numero = algoritmo.nextDouble();
        double quadrado = numero * numero;
        System.out.println("O quadrado de " + numero + "é" + quadrado);
        algoritmo.close();
    }
            
}
