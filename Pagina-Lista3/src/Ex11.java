/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista03;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Ex11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double distancia, preco, consumoMedio;
        
        // Entrada
        System.out.print("Digite a distância percorrida em km: ");
        distancia = Double.valueOf(leia.nextLine());
        System.out.print("Digite o consumo médio do carro em Km/litro: ");
        consumoMedio = Double.valueOf(leia.nextLine());
        System.out.print("Digite o preço do combustível:R$ ");
        preco =  Double.valueOf(leia.nextLine());
        // Saída
        double valorTotal = calcularGastosTotais(distancia, consumoMedio, preco);
        System.out.print("O valor a ser gasto na viagem e de: R$"+valorTotal);
         valorTotal = Double.valueOf(leia.nextLine());
         leia.close();
    } 
        // Calculo
    public static double calcularGastosTotais(double distancia, double consumoMedio, double preco) {
        double litros = distancia / consumoMedio;
        return  litros * preco;
    }
       
        
        
    
}
