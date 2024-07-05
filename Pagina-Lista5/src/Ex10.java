/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaifelse;

import java.util.Scanner;

/**
 *
 * @author Jao Sutil
 */
public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Entrada de dados        
        System.out.print("Digite o valor de x: ");
        int x = Integer.valueOf(input.nextLine());
        System.out.print("Digite o valor de Y: ");
        int y = Integer.valueOf(input.nextLine());
        System.out.print("Digite o valor de Z: ");
        int z = Integer.valueOf(input.nextLine());
// Saída de dados
        if(x<y+z && y<x+z && z<x+y){
            if(x==y && x==z){
                System.out.println("Tipo de triangulo: Equilátero");
            } else if(x==y || x==z|| y==z){
                System.out.println("Tipo de triangulo: Isócele");
            } else{
                System.out.println("Tipo de triangul: Escaleno");
            } 
        }else{
            System.out.println("Nao é um triangulo.");    
                    }
        }
    }

