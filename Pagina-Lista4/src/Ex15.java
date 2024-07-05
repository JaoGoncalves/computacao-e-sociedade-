/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaexercicios;

import java.util.Scanner;

/**
 *
 * @author Jao Sutil
 */
public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso, engordar, emagrecer;
        // Entrada
        System.out.println("Digite seu peso: ");
        peso = Double.valueOf(input.nextLine());
        engordar = peso + (peso * 0.15);
        emagrecer = peso - (peso * 0.20);
        // Saída
        System.out.printf("Se engordar 15%%:seu peso será: %.2f kg%n ",engordar);
        System.out.printf("Se emagrecer 20%%:seu peso será: %.2f kg%n",emagrecer);
        
        
    }
}
