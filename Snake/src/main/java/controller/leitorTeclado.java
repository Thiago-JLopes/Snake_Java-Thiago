/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import view.DrawPanel;

/**
 *
 * @author thiago
 */
public class leitorTeclado extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                if (DrawPanel.getDirecao() != 'D') {
                    DrawPanel.setDirecao('E');
                    System.out.println("tecla E precionada");
                    break;
                }
            case KeyEvent.VK_RIGHT:
                if (DrawPanel.getDirecao() != 'E') {
                    DrawPanel.setDirecao('D');
                }
                break;
            case KeyEvent.VK_UP:
                if (DrawPanel.getDirecao() != 'B') {
                    DrawPanel.setDirecao('C');
                }
                break;
            case KeyEvent.VK_DOWN:
                if (DrawPanel.getDirecao() != 'C') {
                    DrawPanel.setDirecao('B');
                }
                break;
                default:
                    break;

        }
    }
}
