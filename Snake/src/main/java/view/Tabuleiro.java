/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author thiago
 */
public class Tabuleiro extends JFrame{
    private JPanel tabuleiro;

    public Tabuleiro() {
        super("Snake Java");
    }
    
    public void desenhaTabuleiro() {
        this.setSize(500, 500);
        this.setVisible(true);
        
        tabuleiro = new JPanel();
        tabuleiro.setLayout(new BorderLayout());
        tabuleiro.setBackground(Color.BLACK);
        this.add(tabuleiro);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.repaint();
    }
}


