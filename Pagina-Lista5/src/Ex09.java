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
public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Entrada de dados        
        System.out.print("Digite o numero da conta: ");
        int numero = Integer.valueOf(input.nextLine());
        System.out.print("Digite o saldo atual: ");
        double saldo = Double.valueOf(input.nextLine());
        System.out.println("Digite a operaçao(1-deposito ou 2- saque): ");
        int op = Integer.valueOf(input.nextLine());
        System.out.print("Digite o valor da operaçao: ");
        double valor = Double.valueOf(input.nextLine());
        double novoSaldo;
// Saída de dados 
        if(op ==1) {
            novoSaldo = saldo + valor;
        } else if (op==2) {
            novoSaldo = saldo - valor;
        } else {
            System.out.println("Tipo de operaçao inválido!");
            return;
        }
        System.out.println("Novo saldo: R$"+novoSaldo);
        if(novoSaldo<0){
            System.out.println("Conta estourada");
        }
    }
}
