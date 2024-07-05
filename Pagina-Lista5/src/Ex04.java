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
public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Entrada de dados        
        System.out.print("Digite um numero inteiro: ");
        int num = Integer.valueOf(input.nextLine());
// Saída de dados
        if(num%2==0){
            System.out.println(num+ "é um numero par");
        } else {
            System.out.println(num+ " nao é numero par");
        }
    }
}
