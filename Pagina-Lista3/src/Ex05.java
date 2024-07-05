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
public class Ex05 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        double p1, p2, trab;
        // Entrada
        System.out.print("Digite a nota da prova 1: ");
        p1 = Double.valueOf(input.nextLine());
        System.out.print("Digite a nota da prova 2: ");
        p2 = Double.valueOf(input.nextLine());
        System.out.print("Digite a nota do trabalho: ");
        trab = Double.valueOf(input.nextLine());
        //Saída
       Boolean resultado = (p1>=6 || p2>=6) && trab>=7;
        System.out.println("Aprovado: "+resultado);
        resultado = Boolean.valueOf(input.nextLine());
        
            
    }
}
