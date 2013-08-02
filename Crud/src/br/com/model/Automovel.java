/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import br.com.model.ModeloAuto;

/**
 *
 * @author fernando_pavan
 */
public class Automovel {
    private int id;
    private int anoFabricacao;
    private int anoModelo;
    private String observacoes;
    private double preco;
    private int quilometragem;
    private ModeloAuto modelo;
    
    public Automovel(){
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public ModeloAuto getModelo() {
        return modelo;
    }

    public void setModelo(ModeloAuto modelo) {
        this.modelo = modelo;
    }
}
