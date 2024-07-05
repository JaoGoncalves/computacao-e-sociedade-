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
public class Ex09 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        double Qc,Cc,Ql,Cl, Qb, Cb;
        // Entrada
        System.out.println("Digite a quantidade de quilos de café (Q): ");
        Qc =  Double.valueOf(input.nextLine());
        System.out.println("Digite o custo unitário do café: ");
        Cc = Double.valueOf(input.nextLine());
        System.out.println("Digite a quantidade de litros de leite (L): ");
        Ql = Double.valueOf(input.nextLine());
        System.out.println("Digite o custo unitário do leite: ");
        Cl = Double.valueOf(input.nextLine());
        System.out.println("Digite a quantidade de bolacha: ");
        Qb = Double.valueOf(input.nextLine());
        System.out.println("Digite o custo unitário da bolacha: ");
        Cb = Double.valueOf(input.nextLine());
        
        double gastoC = Qc * Cc;
        double gastoL = Ql * Cl;
        double gastoB = Qb * Cb;
        // Saída dos resultados
        System.out.println("Gasto total com café: R$ "+gastoC);
        System.out.println("Gasto total com leite: R$ "+gastoL);
        System.out.println("Gasto total com bolacha: R$ "+gastoB);
        // Resultado final
        double total = gastoC + gastoL + gastoB;
        System.out.println("Total gasto na compra; R$ "+total);
    }
}
