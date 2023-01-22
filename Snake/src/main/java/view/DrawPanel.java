/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.leitorTeclado;
import controller.tratarComandos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author thiago
 */
public class DrawPanel extends JPanel {

    private static final int LARGURA_TELA = 600;
    private static final int ALTURA_TELA = 600;
    private static final int TAMANHO_ELEMENTO = 20;
    private static final int INTERVALO = 200;
    private static final int UNIDADES = LARGURA_TELA * ALTURA_TELA / (TAMANHO_ELEMENTO * TAMANHO_ELEMENTO);
    private static final int[] pX = new int[UNIDADES];
    private static final int[] pY = new int[UNIDADES];
    private static char direcao = 'D';
    private static int appleX;
    private static int appleY;
    private static boolean executando = false;
    private static int snakeSize = 6;
    Timer timer;
    tratarComandos lerComandos;

    public DrawPanel() {
        setPreferredSize(new Dimension(DrawPanel.LARGURA_TELA, DrawPanel.ALTURA_TELA));
        this.addKeyListener(new leitorTeclado());
        iniciar();
    }
    private void iniciar() {
        createApple();
        executando = true;
        timer = new Timer(INTERVALO, lerComandos = new tratarComandos(this));
        timer.start();
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        g.drawString("SNAKE", 280, 10);

        drawScreen(g);
    }

    public static void setSnakeSize(int snakeSize) {
        DrawPanel.snakeSize = snakeSize;
    }

    public static int getSnakeSize() {
        return snakeSize;
    }

    public static void setDirecao(char direcao) {
        DrawPanel.direcao = direcao;
    }

    public static int[] getpX() {
        return pX;
    }

    public static int[] getpY() {
        return pY;
    }

    public static char getDirecao() {
        return direcao;
    }

    public static void setAppleX(int appleX) {
        DrawPanel.appleX = appleX;
    }

    public static void setAppleY(int appleY) {
        DrawPanel.appleY = appleY;
    }

    public int getUNIDADES() {
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
}
