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
public class Ex06 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar entrada de dados do usuário
        System.out.print("Digite a distância total percorrida (em Km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o volume de combustível consumido (em litros): ");
        double volume = scanner.nextDouble();

        // Calcular o consumo médio
        double consumo = distancia / volume;

        // Exibir o resultado para o usuário
        System.out.println("O consumo médio do automóvel é " + consumo + " Km/l");

        scanner.close();
    }
}
