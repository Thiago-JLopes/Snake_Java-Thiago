/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.leitorTeclado;
import controller.validarPosicoes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author thiago
 */
public class DrawPanel extends JPanel implements ActionListener {

    private static final int LARGURA_TELA = 600;
    private static final int ALTURA_TELA = 600;
    private static final int TAMANHO_ELEMENTO = 20;
    private static final int INTERVALO = 100;
    private static final int UNIDADES = LARGURA_TELA * ALTURA_TELA / (TAMANHO_ELEMENTO * TAMANHO_ELEMENTO);
    private static final int[] pX = new int[UNIDADES];
    private static final int[] pY = new int[UNIDADES];
    private static char direcao = 'D';
    private static int appleX;
    private static int appleY;
    private static boolean executando = false;
    private static int snakeSize = 20;
    Timer timer;

    public DrawPanel() {
        setPreferredSize(new Dimension(DrawPanel.LARGURA_TELA, DrawPanel.ALTURA_TELA));
        this.setLayout(new BorderLayout());
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new leitorTeclado());
        iniciar();
    }

    private void iniciar() {
        createApple();
        setExecutando(true);
        timer = new Timer(INTERVALO, this);
        timer.start();

    }
//implementa métodos abbstratos

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        g.drawString("SNAKE", 280, 10);

        drawScreen(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (isExecutando()) {
            toWalk();
            validarPosicoes.validarPosicoes(pX, pY);
        }
        this.repaint();
    }
//--------------------------------------------------------------------------------------------------------------
//Getters and setters 

    public static void setExecutando(boolean executando) {
        DrawPanel.executando = executando;
    }

    public static void setDirecao(char direcao) {
        DrawPanel.direcao = direcao;
    }

    public static void setSnakeSize(int snakeSize) {
        DrawPanel.snakeSize = snakeSize;
    }

    public static void setAppleX(int appleX) {
        DrawPanel.appleX = appleX;
    }

    public static void setAppleY(int appleY) {
        DrawPanel.appleY = appleY;
    }

    public static int getINTERVALO() {
        return INTERVALO;
    }

    public static int getSnakeSize() {
        return snakeSize;
    }

    public static char getDirecao() {
        return direcao;
    }

    public static int getUNIDADES() {
        return UNIDADES;
    }

    public static boolean isExecutando() {
        return executando;
    }

    public static int getLARGURA_TELA() {
        return LARGURA_TELA;
    }

    public static int getALTURA_TELA() {
        return ALTURA_TELA;
    }

    public static int getTAMANHO_ELEMENTO() {
        return TAMANHO_ELEMENTO;
    }

    public static int getAppleX() {
        return appleX;
    }

    public static int getAppleY() {
        return appleY;
    }
//--------------------------------------------------------------------------------------------------------------

    private static void createApple() {
        Random radon = new Random();

        setAppleX(radon.nextInt(getLARGURA_TELA() / getTAMANHO_ELEMENTO()) * getTAMANHO_ELEMENTO());
        setAppleY(radon.nextInt(getALTURA_TELA() / getTAMANHO_ELEMENTO()) * getTAMANHO_ELEMENTO());
    }

    public void drawScreen(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(getAppleX(), getAppleY(), getTAMANHO_ELEMENTO(), getTAMANHO_ELEMENTO());

        for (int i = 0; i < getSnakeSize(); i++) {
            if (i == 0) {
                g.setColor(Color.green);
                g.fillRect(pX[0], pY[0], TAMANHO_ELEMENTO, TAMANHO_ELEMENTO);
            } else {
                g.setColor(new Color(144, 238, 144));
                g.fillRect(pX[i], pY[i], TAMANHO_ELEMENTO, TAMANHO_ELEMENTO);
            }
        }
    }

    private void toWalk() {
        for (int i = getSnakeSize(); i > 0; i--) {
            pX[i] = pX[i - 1];
            pY[i] = pY[i - 1];
        }

        switch (getDirecao()) {
            case 'C':
                pY[0] = pY[0] - getTAMANHO_ELEMENTO();
                break;
            case 'B':
                pY[0] = pY[0] + getTAMANHO_ELEMENTO();
                break;
            case 'D':
                pX[0] = pX[0] + getTAMANHO_ELEMENTO();
                break;
            case 'E':
                pX[0] = pX[0] - getTAMANHO_ELEMENTO();
                break;
            default:
                break;
        }
    }

}
