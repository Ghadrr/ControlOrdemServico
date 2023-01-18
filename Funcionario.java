/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.assistenciaTec.projetoFinal;

/**
 *
 * @author Gabriel
 */
public class Funcionario extends Pessoa {

    private String cargo;

    public Funcionario(String nome, String email, String telefone, String cargo) {
        super(nome, email, telefone);
        this.cargo = cargo;
    }
    
}
