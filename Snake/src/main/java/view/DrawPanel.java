/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author thiago
 */
public class DrawPanel extends JPanel {

    private final int LARGURA_TELA = 600;
    private final int ALTURA_TELA = 600;
    private final int TAMANHO_ELEMENTO = 20;
    private int appleX;
    private int appleY;

    public DrawPanel() {
        setPreferredSize(new Dimension(this.LARGURA_TELA, this.ALTURA_TELA));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        g.drawString("SNAKE", 280, 10);

        createApple(g);
    }

    private void setAppleX(int appleX) {
        this.appleX = appleX;
    }

    private void setAppleY(int appleY) {
        this.appleY = appleY;
    }
    
    

    public int getAppleX() {
        return appleX;
    }

    public int getAppleY() {
        return appleY;
    }

    public int getLARGURA_TELA() {
        return LARGURA_TELA;
    }

    public int getALTURA_TELA() {
        return ALTURA_TELA;
    }

    public int getTAMANHO_ELEMENTO() {
        return TAMANHO_ELEMENTO;
    }

    private void createApple(Graphics g) {
        Random radon = new Random();

        setAppleX(radon.nextInt(getLARGURA_TELA() / getTAMANHO_ELEMENTO()) * getTAMANHO_ELEMENTO());
        setAppleY(radon.nextInt(getALTURA_TELA() / getTAMANHO_ELEMENTO()) * getTAMANHO_ELEMENTO());

        g.setColor(Color.red);
         g.fillOval(getAppleX(), getAppleY(), getTAMANHO_ELEMENTO(), getTAMANHO_ELEMENTO());
    }
}
