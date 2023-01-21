/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author thiago
 */
public class DrawApple {
    public static void DrawApple(Graphics g) {
        g.setColor(new Color(75, 54, 33));
        g.fillRect(0, 0, 700, 20);
        g.fillRect(0, 20, 20, 700);
        g.fillRect(20, 540, 610, 30);
        g.fillRect(580, 20, 20, 700);
        //g.fillOval(20, 20, 15, 15);
    }
}
