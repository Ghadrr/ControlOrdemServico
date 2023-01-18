/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.assistenciaTec.projetoFinal;

/**
 *
 * @author Gabriel
 */
public class Produto {
    
    private String nomeProd;
    private double precoProd;

    public Produto(String nomeProd, double precoProd) {
        this.nomeProd = nomeProd;
        this.precoProd = precoProd;
    }

    public Produto() {
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public double getPrecoProd() {
        return precoProd;
    }

    public void setPrecoProd(double precoProd) {
        this.precoProd = precoProd;
    }

}
