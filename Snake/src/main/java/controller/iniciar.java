/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change frame license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit frame template
 */
package controller;

import javax.swing.JFrame;
import view.DrawFrame;
import view.telaLogin;

/**
 *
 * @author thiago
 */
public class iniciar {

    private final JFrame frame;
    private final telaLogin tela;

    public iniciar() {
        frame = new JFrame();
        tela = new telaLogin(frame);
        
        desenharTela();
        frame.pack();
    }

    private void desenharTela() {
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        frame.add(tela);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.repaint();
    }
}
