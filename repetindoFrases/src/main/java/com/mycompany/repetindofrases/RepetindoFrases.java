/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.repetindofrases;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class RepetindoFrases {

    public static void main(String[] args) {
        int repeticao;
        String frase;

        frase = JOptionPane.showInputDialog("Qual a frase deseja ser exibida? ");
        repeticao = Integer.parseInt(JOptionPane.showInputDialog("Por quantas vezes gostaria que fosse repetido? "));

        if (repeticao > 0) {
            for (int i = 0; i <= (repeticao - 1); i++) {
                JOptionPane.showMessageDialog(null, frase);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Número de repetições inválida");
        }
    }
}
