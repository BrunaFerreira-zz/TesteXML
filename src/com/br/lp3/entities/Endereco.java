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
public class Endereco {
    private String rua;
    private int numero;
    private String complemento;
    private String cidade;
    private String estado;
    
    //Construtor

    public Endereco(String rua, int numero, String complemento, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", numero=" + numero + ", complemento=" + complemento + ", cidade=" + cidade + ", estado=" + estado + '}';
    }
    
    
}
