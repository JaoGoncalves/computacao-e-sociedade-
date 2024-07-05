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
public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Entrada de dados        
        System.out.print("Digite o primeiro numero inteiro:");
        int n1 = Integer.valueOf(input.nextLine());
        System.out.print("Digite o segundo numero inteiro:");
        int n2 = Integer.valueOf(input.nextLine());
        System.out.print("Digite o terceiro numero inteiro:");
        int n3 = Integer.valueOf(input.nextLine());
// Saida de dados
        int temp; 
        if (n1 > n2) {
            temp = n1;
            n1 = n2;
            n2 = temp;
        }
        if (n2 > n3) {
            temp = n2;
            n2 = n3;
            n3 = temp;
        }
        if (n1 > n2) {
            temp = n1;
            n1 = n2;
            n2 = temp;
        }
        System.out.println("Numeros ordenados: "+n1+" "+n2 +" "+n3);
    }
}
