/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.jogador;

/**
 *
 * @author thiago
 */
public class telaLogin extends JPanel{
    private JTextField usuario;
    private JTextField idade;
    private JTextField email;
    
    public telaLogin() {
        this.setPreferredSize(new Dimension(300, 200));
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(35,35,142));
        this.setFocusable(true);
    }
    
    public void login() {
        JPanel cadastro = new JPanel();
        cadastro.setBorder(BorderFactory.createTitledBorder("Cadastro"));
        cadastro.setLayout(new BorderLayout());
        
        JLabel Jlusuario = new JLabel("Usuário");
        cadastro.add(Jlusuario);
        
    }
    
}
