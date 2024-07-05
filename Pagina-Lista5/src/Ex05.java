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
public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Entrada de dados
        System.out.print("Digite um numero inteiro: ");
        int num = Integer.valueOf(input.nextLine());
// Saída de dados 
       if (num<= 10) {
            System.out.println("F1");
        } else if (num >10 && num<=100) {
            System.out.println("F2");
        } else {
            System.out.println("F3");
        }
    }
}
