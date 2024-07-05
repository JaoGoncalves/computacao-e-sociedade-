/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Jao Sutil
 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        
        String nome, endereco, telefone;
    
    // Solicita ao usuário para insirir o nome.
         System.out.println("Digite seu nome: ");
         nome = scanner.nextLine();
            
     // Solicita ao usuário para inserir o endereço.
            System.out.println("Digite seu endereço: ");
            endereco = scanner.nextLine();
            
     // Solicita ao usuário para inserir o telefone.
            System.out.println("Digite seu telefone: ");
            telefone = scanner.nextLine();
            
     // Imprima os dados na tela.
            System.out.println("Nome: "+nome);
            System.out.println("Endereço: "+endereco);
            System.out.println("Telefone: "+telefone);
            
            
            scanner.close();
}
 
    
      
 
}
