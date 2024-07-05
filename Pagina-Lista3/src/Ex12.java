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
public class Ex12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        // Entrada
        System.out.print("Digite o valor de A: ");
        float a = Float.valueOf(leia.nextLine());
        System.out.print("Digite o valor de B: ");
        float b = Float.valueOf(leia.nextLine());
        if(a==b) {
            System.out.println("A e B são iguais.");
        }
        else {
            System.out.println("A e B não são iguais.");   
         }
    }
}