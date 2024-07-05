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
public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int segTotal;
        int h;
        int m;
        int restantes;
        System.out.println("Digite a quantidade de segundos do vídeo: ");
        segTotal = input.nextInt();
      
        
        h = segTotal / 3600;
        m  = (segTotal % 3600) / 60;
        restantes = (segTotal % 3600) %  60;
        System.out.printf("O vídeo dura %d horas. %d minutos e %d segundos.",h, m, restantes);
        
    }
}
