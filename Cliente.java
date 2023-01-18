/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.assistenciaTec.projetoFinal;

/**
 *
 * @author Gabriel
 */
public class Cliente extends Pessoa {
 
    private String obs;

    
     public Cliente(String nome, String email, String telefone,String obs) {
        super(nome, email, telefone);
        this.obs = obs;
    }
    
    
    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    
}
