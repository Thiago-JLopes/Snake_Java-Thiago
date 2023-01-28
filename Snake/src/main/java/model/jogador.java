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
        this.record = 0;
    }

    public void setNome(String nome) throws nomeException{
        for(int i = 0; i < nome.length(); i++) {
            if(nome.charAt(i) < 65 || nome.charAt(i) > 90)
                throw new nomeException();
        }
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

    public void setEmail(String email) throws emailException{
        if(!email.contains("@"))
            throw new emailException();
        if(!email.contains("."))
            throw new emailException();
        if(email.indexOf("@") > email.indexOf("."))
            throw new emailException();
        
        String split[] = email.split("@");
        if(split.length < 2)
            throw new emailException();
        
        for(int i = 0; i < split[0].length(); i++) {
            if(split[0].charAt(i) < 97 || split[0].charAt(i) > 122)
                throw new emailException();
        }
        
        String splitPoint[] = split[1].split("\\.");
        if(splitPoint.length < 2)
            throw new emailException();
        
        for(int i = 0; i < splitPoint[0].length(); i++) {
            if(splitPoint[0].charAt(i) < 97 || splitPoint[0].charAt(i) > 122)
                throw new emailException();
        }
        
        for(int i = 0; i < splitPoint[1].length(); i++) {
            if(splitPoint[1].charAt(i) < 97 || splitPoint[1].charAt(i) > 122)
                throw new emailException();
        }
        
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
