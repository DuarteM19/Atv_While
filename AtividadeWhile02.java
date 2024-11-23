/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.AtividadeWhile;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class AtividadeWhile02 {

         public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int senhaCorreta = 1234;
        int senhaDigitada;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextInt();

            if (senhaDigitada != senhaCorreta) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (senhaDigitada != senhaCorreta);

        System.out.println("Senha correta! Acesso concedido.");

    }
    
         
}
