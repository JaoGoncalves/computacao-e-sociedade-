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
public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Entrada de dados
        System.out.print("Digite seu peso: ");
        double peso = Double.valueOf(input.nextLine());
        System.out.print("Digite sua altura: ");
        double altura = Double.valueOf(input.nextLine());
// Calculo
        double IMC = peso/(altura*altura);
           System.out.printf("Seu imc e: %.2f\n",IMC);
           
        if (IMC < 20) {
            System.out.println("Magro");
        } else if (IMC >= 20 && IMC <= 24.99) {
            System.out.println("Normal");
        } else if (IMC >= 25 && IMC <= 30) {
            System.out.println("Você está com sobrepeso");
        } else {
            System.out.println("Você está obeso");
        }

               
    }
}
