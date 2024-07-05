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
public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Entrada de dados        
        System.out.print("Digite o primeiro numero: ");
        int n1 = Integer.valueOf(input.nextLine());
        System.out.print("Digite o segundo numero: ");
        int n2 = Integer.valueOf(input.nextLine());
        System.out.print("Digite o terceiro numero: ");
        int n3 = Integer.valueOf(input.nextLine());
        int menor = n1;
// Saída de dados
        if(n2< menor) {
            menor = n2;
        }
        if(n3< menor) {
            menor = n3;
        }
        System.out.println("O menor numero é:"+menor);
    }
}
