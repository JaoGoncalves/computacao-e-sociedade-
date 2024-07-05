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
public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h, m, seg,faltamParaTerminar, segNoDia, Inicio;
        
        // Entrada
        System.out.println("Digite a hora: ");
        h = Integer.valueOf(input.nextLine());
        System.out.println("Digite os minutos: ");
        m = Integer.valueOf(input.nextLine());
        System.out.println("Digite os segundos: ");
        seg = Integer.valueOf(input.nextLine());
        
        segNoDia = (h * 3600) - (m * 60) + seg;
        Inicio = 24 * 3600;
        faltamParaTerminar = segNoDia - Inicio;
        // Saída
        System.out.println("segundos até o fim do dia: "+faltamParaTerminar);
    }
}
