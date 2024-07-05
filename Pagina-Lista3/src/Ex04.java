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
public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int peso;
        double altura, IMC;
        //Entrada
        System.out.print("Digite seu peso: ");
        peso = Integer.valueOf(input.nextLine());
        System.out.print("Digite sua altura: ");
        altura = Double.valueOf(input.nextLine());
        IMC = peso/(altura*altura);
        System.out.println("Seu indice corporal é: "+IMC);
        boolean resultado = IMC >25;
        //Saída
        System.out.println("Acima do peso: "+ resultado);
       
    }
}
