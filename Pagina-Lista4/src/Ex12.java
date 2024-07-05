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
public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double prato = 39.00;
        double pratoVazio = 0.45;
        double peso, pesoReal, valorTotal;
        // Entrada de dados
        System.out.println("Digite o peso do prato montado: ");
        peso = Double.valueOf(input.nextLine());
        
        pesoReal = peso + pratoVazio;
        valorTotal = peso * prato;
        // Saída de dados
        System.out.println("O valor a pagar é: "+valorTotal);
        
       
        
    }
}
