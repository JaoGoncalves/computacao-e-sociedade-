/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaexercicios;

import java.util.Scanner;

/**
 *
 * @author Jao Sutil
 */
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       int base, altura, area, perimetro;
       
       // Entrada de dados
        System.out.print("Digite a medida da base do retângulo: ");
        base = Integer.valueOf(input.nextLine());
        System.out.print("Digite a medida da altura do retangulo: ");
        altura = Integer.valueOf(input.nextLine());
        
      // Saída de dados  
        area = base* altura;
        perimetro = 2 * base + 2 * altura;
        System.out.println("Area do rentangulo :"+area);
        System.out.println("Perímetro do retangulo:"+perimetro);
        
    }
    
}
