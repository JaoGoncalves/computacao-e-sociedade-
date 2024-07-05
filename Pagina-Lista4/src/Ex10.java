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
public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int quociente;
        int resto;
        // Entrada
        System.out.println("Digite um número: ");
        x = Integer.valueOf(input.nextLine());
        
        quociente = x / 2;
        resto = x % 2;
        // Saída de dados
        System.out.println("O quociente é: "+quociente);
        System.out.println("O resto é: "+resto);
        
        
        
    }
    
}
