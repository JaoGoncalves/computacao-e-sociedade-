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
public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Entrada de dados
        System.out.print("Digite a nota da prova 1: ");
        double prova1 = Double.valueOf(input.nextLine());
        System.out.print("Digite a nota da prova 2: ");
        double prova2 = Double.valueOf(input.nextLine());
        System.out.print("Digite a nota do trabalho: ");
        double trab = Double.valueOf(input.nextLine());
// Saída de dados
        if((prova1>=6 || prova2>=6) && trab>=7){
            System.out.println("Parabéns, voce foi aprovado!");
        } else{
            System.out.println("Infelizmente, voce nao foi aprovado.");
        }
    }
}
