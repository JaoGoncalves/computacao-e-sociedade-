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
public class Ex09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        // Entrada
        System.out.println("Digite o valor da compra: ");
        double compra = Double.valueOf(leia.nextLine());
        System.out.println("Digite o valor pago pelo cliente: ");
        double valorPago = Double.valueOf(leia.nextLine());
        double calculo = valorPago - compra;
        int[] notasDisponiveis ={100,10,1};
        // Saída
        System.out.println("O troco do cliente e: "+calculo);
        for (int nota : notasDisponiveis) {
            int quantidadeNotas = (int) (calculo / nota);
            calculo %= nota;

            if (quantidadeNotas > 0) {
                System.out.println(quantidadeNotas + " nota(s) de R$" + nota);
            }
        }    
    } 
}
