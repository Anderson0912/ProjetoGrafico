/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.anderson.objeto;

/**
 *
 * @author SATC
 */
public enum TipoAvalicao {
    
    PROVA("Avaliação Individual"),
    SEMINARIO("Seminário"),
    TRABALHO("Trabalho");
    
    public String TipoAvaliacao;

    private TipoAvalicao(String TipoAvaliacao) {
        this.TipoAvaliacao = TipoAvaliacao;
    }

    public String getTipoAvaliacao() {
        return TipoAvaliacao;
    }
    
    
}
