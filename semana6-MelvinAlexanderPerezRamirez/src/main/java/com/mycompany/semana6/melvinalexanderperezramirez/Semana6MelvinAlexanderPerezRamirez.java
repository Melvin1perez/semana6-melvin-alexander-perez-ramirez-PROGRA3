/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana6.melvinalexanderperezramirez;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
public class Semana6MelvinAlexanderPerezRamirez {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Primer JFrame");
        JPanel panel = new JPanel();
        
        // Crear JLabel con tu nombre
        JLabel nameLabel = new JLabel("melvin alexander perez ramirez");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 20)); // Cambiar fuente y tamaño
        panel.add(nameLabel);

        // Crear JButton con título "Progra 3"
        JButton button = new JButton("Progra 3");
        button.setFont(new Font("Arial", Font.BOLD, 16)); // Cambiar fuente y tamaño
        button.setSize(100, 50); // Cambiar tamaño
        panel.add(button);

        frame.setSize(400, 300);
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
