/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.AtividadeWhile;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class AtividadeWhile03 {

        public static void main(String[] args) {
        int contador = 0;
        int numero;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro (digite 0 para sair): "));

            if (numero != 0) {
                contador = contador + 1;
            }
        } while (numero != 0);

        JOptionPane.showMessageDialog(null, "Você inseriu " + contador + " números.");

    }
    
         
}
