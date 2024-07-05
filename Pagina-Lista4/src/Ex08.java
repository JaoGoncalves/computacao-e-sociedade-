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
public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double SM, CV, Vendas, Sf, ComPorCarro, ComPorVendas, salariototal;
        // Entrada
        System.out.println("Digite o valor do salário mínimo: ");
        SM = Double.valueOf(input.nextLine());
        
        System.out.println("Digite a quantidade de carros vendidos no mês: ");
        CV = Double.valueOf(input.nextLine());
        
        System.out.println("Digite o valor das vendas: ");
        Vendas = Double.valueOf(input.nextLine());
        
        Sf = 2 * SM;
        ComPorCarro = 150.00;
        ComPorVendas = 0.05 * Vendas;
        salariototal = Sf + (CV *ComPorCarro) + ComPorVendas;
        // Saída
        System.out.println("O salario total do vendedor é: R$ "+salariototal);
    }
}
