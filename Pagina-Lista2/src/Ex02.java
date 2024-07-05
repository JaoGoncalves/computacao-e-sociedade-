/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Ex02 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // Leitura de um número inteiro
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero= scanner.nextInt();
        System.out.println("O número digitado é: "+numero);
        scanner.close();
    }
}
