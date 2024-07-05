/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista03;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p, q, produto, atraso,Valorfinal;
        // Entrada
        System.out.print("Digite o preço: ");
        p = Double.valueOf(input.nextLine());
        System.out.print("Digite a quantidade quilowatts: ");
        q = Double.valueOf(input.nextLine());
        produto = p * q;
        atraso = produto * 0.10;
        Valorfinal = produto + atraso;
        // Saída
        System.out.println("O valor a ser pago se a conta for paga no dia é: "+produto);
        System.out.println("O valor a ser pago com atraso: "+Valorfinal);
        Valorfinal = Double.valueOf(input.nextLine());
        
    }
    
}
