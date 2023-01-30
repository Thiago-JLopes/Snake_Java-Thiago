/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import view.DrawFrame;

/**
 *
 * @author thiago
 */
public class playGame implements ActionListener{
    private final JFrame tela;

    public playGame(JFrame tela) {
        this.tela = tela;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        tela.dispose();
        DrawFrame frame = new DrawFrame();
        frame.draw();
        frame.pack();
    }
    
}
