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
public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Entrada de dados        
        System.out.print("Digite o preço do quilowatt: ");
        double preco = Double.valueOf(input.nextLine());
        System.out.print("Digite a quantidade de quilowatts: ");
        double quilowatts = Double.valueOf(input.nextLine());
        double produto = preco * quilowatts;
        double atraso = produto * 0.10;
        double valorFinal = produto + atraso;
// Saída de dados
        System.out.println("O valor a ser pago, se a conta for paga no dia e: "+produto);
        System.out.println("O valor a ser pago, se a conta for paga atrasada e: "+valorFinal);
        if(quilowatts>70){
            System.out.println("Consumo elevado de energia");
        } else  {
            System.out.println("Voce e um consumidor consciente");
        }
        
    }
}
