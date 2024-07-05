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
public class Ex05 {
    public static double calcularY(double x) {
     return 3 * x + 2;
        
    }
    
    public static void main(String[] args) {
       double x = 3; 

        
        double y = calcularY(x);

        // Exibindo o resultado
        System.out.println("Para x = " + x + ", y = " + y);
    }
}
