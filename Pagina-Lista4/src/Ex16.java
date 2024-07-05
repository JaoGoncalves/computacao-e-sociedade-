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
public class Ex16 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        // Entrada
        double salario = 1500.00;
        double c1 = 200.00;
        double c2 = 120.00;
        double multa1 = c1 * 0.02;
        double multa2 = c2 * 0.02;
        double total = c1 + multa1 + c2 + multa2;
        double resto = salario - total;
         // Saída
         System.out.printf("Depois de pagar as contas, sobrara R$%.2f do salário de João",resto);
         
        
    }
}
