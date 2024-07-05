/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista03;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Ex13 {
    public static void main(String[] args) {
        Scanner leia =  new Scanner(System.in);
        // Entrada 
        System.out.print("Digite o valor de A: ");
        double A = Double.valueOf(leia.nextLine());
        System.out.print("Digite o valor de B: ");
        double B = Double.valueOf(leia.nextLine());
        System.out.print("Digite o valor de C: ");
        double C = Double.valueOf(leia.nextLine());
        
        if ((A+B) < C) {
        System.out.println("A soma de A + B é menor que C ");
        } else {
        System.out.println("A soma de A + B é maior ou igual a C "); 
        }
        leia.close();
    }
}
