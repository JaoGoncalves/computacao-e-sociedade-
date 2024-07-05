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
public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a, b , quadrado;
         
        
        
        // Entrada de dados
        System.out.println("Digite o primeiro número: ");
        a = Integer.valueOf(input.nextLine());
        System.out.println("Digite o segundo número: ");
        b = Integer.valueOf(input.nextLine());
        
        // Saída de dados
        quadrado = a * a + b * b;
        System.out.println("A soma dos quadrados destes números é: "+quadrado);
        quadrado = Integer.valueOf(input.nextLine());
        
       
    }
}
