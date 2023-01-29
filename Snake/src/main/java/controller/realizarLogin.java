/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.jogador;
import view.telaLogin;

/**
 *
 * @author thiago
 */
public class realizarLogin implements ActionListener {

    private telaLogin tela;

    public realizarLogin(telaLogin tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jogador jogador;
    }

}
