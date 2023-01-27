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
public class CapturarMaca {
    public static void capturar(int pX[], int pY[]) {
        if(pX[0] == DrawPanel.getAppleX() && pY[0] == DrawPanel.getAppleY()) {
            DrawPanel.setSnakeSize(DrawPanel.getSnakeSize()+1);
            DrawPanel.setMacasComidas(DrawPanel.getMacasComidas()+1);
            DrawPanel.createApple();
        }
    }
}
