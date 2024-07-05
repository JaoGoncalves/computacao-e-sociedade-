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
public class Ex06 {
    public static double celsiusParaFahrenheit(double celsius) {
        return (9.0/5.0) * celsius + 32;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c;
        double f;
        
        System.out.println("Digite uma temperatura em graus Celsius: ");
        c = Double.valueOf(input.nextLine());
        // Saída de dados
        f = celsiusParaFahrenheit(c);
        System.out.println("A temperatura em Fahrenheit é: "+f);
    }
}
