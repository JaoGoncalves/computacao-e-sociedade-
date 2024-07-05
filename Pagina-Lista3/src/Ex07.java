/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista03.lista03;

import java.util.Scanner;

/**
 *
 * @author Jao Sutil
 */
public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int altura, comprimento, Largura;
        double areadoPiso, areaParedes, Volume;
// Entrada
        System.out.print("Digite a altura da sala: ");
        altura = Integer.valueOf(input.nextLine());
        System.out.print("Digite o comprimento: ");
        comprimento = Integer.valueOf(input.nextLine());
        System.out.print("Digite a largura da sala: ");
        Largura = Integer.valueOf(input.nextLine());
// Calculo
        areadoPiso = Largura * comprimento;
        System.out.println("A area do piso é: "+areadoPiso);
        areaParedes = 2*(Largura * altura +comprimento * altura);
        System.out.println("A area das paredes é: "+areaParedes);
        Volume = altura * comprimento * Largura;
        System.out.println("O volume é: "+Volume);
        boolean peq =  Volume<100;
        System.out.println("Ar pequeno: "+peq);
        boolean med = Volume >=100 && Volume <=500;
        System.out.println("Ar médio: "+med);
        boolean grande = Volume>500;
        System.out.println("Ar grande: "+grande);
       
       
    }
}
