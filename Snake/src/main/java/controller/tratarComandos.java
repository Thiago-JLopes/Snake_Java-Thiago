/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import view.DrawPanel;

/**
 *
 * @author thiago
 */
public class tratarComandos implements ActionListener {

    private final DrawPanel tela;

    public tratarComandos(DrawPanel tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (DrawPanel.isExecutando()) {
            movimenar();
            tela.repaint();
        }
    }

    private void movimenar() {
        for (int i = DrawPanel.getSnakeSize(); i > 0; i--) {
            DrawPanel.getpX()[i] = DrawPanel.getpX()[i - 1];
            DrawPanel.getpY()[i] = DrawPanel.getpY()[i - 1];
        }

        switch (DrawPanel.getDirecao()) {
            case 'C':
                DrawPanel.getpY()[0] = DrawPanel.getpY()[0] - DrawPanel.getTAMANHO_ELEMENTO();
                break;
            case 'B':
                DrawPanel.getpX()[0] = DrawPanel.getpY()[0] + DrawPanel.getTAMANHO_ELEMENTO();
                break;
            case 'D':
                DrawPanel.getpX()[0] = DrawPanel.getpX()[0] + DrawPanel.getTAMANHO_ELEMENTO();
                break;
            case 'E':
                DrawPanel.getpX()[0] = DrawPanel.getpX()[0] - DrawPanel.getTAMANHO_ELEMENTO();
                break;
            default:
                break;
        }
    }

}
