/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author thiago
 */
public class jogador {

    private String nome;
    private String idade;
    private String email;
    private int record;

    public jogador(String nome, String idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(String idade) throws idadeException {
        for (int i = 0; i < idade.length(); i++) {
            if (idade.charAt(i) < 48 || idade.charAt(i) > 57) {
                throw new idadeException();
            }
        }
        this.idade = idade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public int getRecord() {
        return record;
    }

}
