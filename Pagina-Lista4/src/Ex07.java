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
public class Ex07 {
    public static void main(String[] args) {
        int q1, q2, q3;
        Scanner input = new Scanner(System.in);
        // Entrada de dados
        System.out.print("Digite a quantidades de picolés tipo 1 vendidos: ");
        q1 = Integer.valueOf(input.nextLine());
        System.out.print("Digite a quantidade de picolés tipo 2 vendidos: ");
        q2 = Integer.valueOf(input.nextLine());
        System.out.print("Digite a quantidades de picolé tipo 3 vendidos; ");
        q3 = Integer.valueOf(input.nextLine());
      
        double p1 = q1 * 1.50;
        double p2 = q2 * 2.0;
        double p3 = q3 * 0.75;
        double total = p1 + p2 + p3;
        // Saída de dados
        System.out.println("Valor arrecadado com as vendas do picolé tipo 1: R$ "+p1);
        System.out.println("Valor arrecadado com as vendas do picolé tipo 2: R$ "+p2);
        System.out.println("Valor arrecadado com as vendas do picolé tipo 3: R$ "+p3);
        System.out.println("Valor total das vendas: R$ "+total);
        
        
        
        
    }
    
   
}
