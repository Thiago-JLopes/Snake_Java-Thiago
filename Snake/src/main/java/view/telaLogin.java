/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author thiago
 */
public class telaLogin extends JPanel {

    private JComboBox<String> levelsComboBox;
    private final Image backGroundImage;
    private static final String FONTE = "Ink Free";

    public telaLogin() {
        this.setPreferredSize(new Dimension(400, 200));
        this.setLayout(new BorderLayout());
        this.setFocusable(true);
        this.backGroundImage = new ImageIcon("imagem/fundo1.png").getImage();
        LevelSelector();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backGroundImage, 0, 0, getWidth(), getHeight(), this);
    }

    private void LevelSelector() {
        setLayout(null);
        JLabel levelsLabel = new JLabel("SELECIONE O NÍVEL:");
        levelsLabel.setBounds(120, 57, 200, 25);
        levelsLabel.setForeground(new Color(3, 187, 133));
        levelsLabel.setFont(new Font(FONTE, Font.BOLD, 14));
        add(levelsLabel);

        levelsComboBox = new JComboBox<>();
        levelsComboBox.addItem("Fácil");
        levelsComboBox.addItem("Médio");
        levelsComboBox.addItem("Difícil");
        levelsComboBox.setBounds(141, 77, 100, 25);

        add(levelsComboBox, BorderLayout.WEST);

        JButton start = new JButton("PLAY");
        start.setBounds(290, 145, 100, 25);
        start.setBackground(new Color(255, 105, 97));
        add(start);
    }

}
