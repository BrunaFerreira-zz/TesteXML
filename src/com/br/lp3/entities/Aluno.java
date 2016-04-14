/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.entities;

/**
 *
 * @author 31596861
 */
public class Aluno {
    private String nome;
    private String tia;
    private String faculdade;
    private String curso;
    private int etapa;
    private Endereco endereco;

    public Aluno(String nome, String tia, String faculdade, String curso, int etapa, Endereco endereco) {
        this.nome = nome;
        this.tia = tia;
        this.faculdade = faculdade;
        this.curso = curso;
        this.etapa = etapa;
        this.endereco = endereco;
    }

    public Aluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", tia=" + tia + ", faculdade=" + faculdade + ", curso=" + curso + ", etapa=" + etapa + ", endereco=" + endereco + '}';
    }
    
    
}
