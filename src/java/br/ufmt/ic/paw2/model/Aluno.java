/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.paw2.model;

/**
 *
 * @author aluno
 */
public class Aluno {
    
    private String nome;
    private String RGA;
    
    public Aluno(){
    }
    
    public Aluno(String nome, String RGA){
        this.nome = nome;
        this.RGA = RGA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRGA() {
        return RGA;
    }

    public void setRGA(String RGA) {
        this.RGA = RGA;
    }
    
}
