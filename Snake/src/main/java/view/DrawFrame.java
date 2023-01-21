/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author thiago
 */
public class DrawFrame extends JFrame {

    private DrawPanel tabuleiro = null;

    public DrawFrame() {
        super("Snake");
    }

    public void draw() {
        this.setSize(600, 600);
        this.setVisible(true);

        this.tabuleiro = new DrawPanel();
        this.tabuleiro.setLayout(new BorderLayout());
        this.tabuleiro.setBackground(Color.black);

        this.add(this.tabuleiro);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        this.repaint();
    }
}