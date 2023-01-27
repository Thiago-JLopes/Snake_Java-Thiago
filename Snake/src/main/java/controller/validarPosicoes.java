/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.DrawPanel;

/**
 *
 * @author thiago
 */
public class validarPosicoes {

    public static void validarPosicoes(int pX[], int pY[]) {
        for (int i = DrawPanel.getSnakeSize(); i > 0; i--) {
            if (pX[0] == pX[i] && pY[0] == pY[i]) {
                System.out.println("Cobra de tocou!");
                DrawPanel.setExecutando(false);
                break;
            }
        }

        if ((pX[0]) < 0 || pX[0]  > DrawPanel.getLARGURA_TELA()) {
            System.out.println("excedeu largura");
            DrawPanel.setExecutando(false);
        }

        if (pY[0] < 0 || pY[0] > DrawPanel.getALTURA_TELA()) {
            System.out.println("Excedeu altura");
            DrawPanel.setExecutando(false);
        }
        
        if(!DrawPanel.isExecutando()) {
            DrawPanel.timer.stop();
        }
    }
    
}
