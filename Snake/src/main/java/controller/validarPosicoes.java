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
        for(int i = DrawPanel.getSnakeSize(); i > 0; i--) {
            if(pX[0] == pX[i] && pY[0] == pY[i]) {
                DrawPanel.setExecutando(false);
                break;
            }
        }
        
        if(pX[0] < 0 || pX[0] > DrawPanel.getLARGURA_TELA()) {
            DrawPanel.setExecutando(false);
        }
    }
}
