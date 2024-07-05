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
public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Entrada
        int h, m, seg, InicioDoDia;
        System.out.println("Digite as horas: ");
        h = Integer.valueOf(input.nextLine());
        System.out.println("Digite os minutos: ");
        m = Integer.valueOf(input.nextLine());
        System.out.println("Digite os segundos: ");
        seg = Integer.valueOf(input.nextLine());
        InicioDoDia = (h * 3600) + (m * 60)  + seg;
        // Saída
        System.out.println("Segundos desde o início do dia: "+InicioDoDia);
        
    }
}
