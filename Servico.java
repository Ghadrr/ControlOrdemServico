/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.assistenciaTec.projetoFinal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class Servico {

    private OrdemServico ordemServico;
    private String tipoServico;
    private String diagnostico;
    private double vlorMaoObra;
    private List<Produto> prodts;
    private Funcionario funcionario;

    public Servico() {
    }

    public Servico(Funcionario funcionario, OrdemServico ordemServico, String tipoServico, String diagnostico, double vlorMaoObra, Produto produtos) {
        this.funcionario = funcionario;
        this.ordemServico = ordemServico;
        this.tipoServico = tipoServico;
        this.diagnostico = diagnostico;
        this.vlorMaoObra = vlorMaoObra;
        this.prodts = new ArrayList<>();
        prodts.add(produtos);
    }

    public Servico(Funcionario funcionario, OrdemServico ordemServico, String tipoServico, String diagnostico, double vlorMaoObra) {
        this.funcionario = funcionario;
        this.ordemServico = ordemServico;
        this.tipoServico = tipoServico;
        this.diagnostico = diagnostico;
        this.vlorMaoObra = vlorMaoObra;

    }

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;

    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public double getVlorMaoObra() {
       
        return vlorMaoObra;
    }

    public void setVlorMaoObra(double vlorMaoObra) {

        this.vlorMaoObra = vlorMaoObra;

    }

    public List<Produto> getProdts() {
        return prodts;
    }

    public void setProdts(List<Produto> prodts) {
        this.prodts = prodts;
    }

    public double precoTotal() {
        double vTotal = 0;
        try {
            for (Produto prodt : prodts) {
                vTotal += prodt.getPrecoProd();
            }
        } catch (NullPointerException e) {
            System.err.println("FATAL ERROR: " + e);
        }
        return vTotal + vlorMaoObra;

    }

    @Override
    public String toString() {
        return "Ola " + ordemServico.getCliente()
                + "\nDiagnostico: " + diagnostico
                + "\n Mao de Obra: " + vlorMaoObra
                + "\nServico feito: " + tipoServico
                + "\n total: " + precoTotal();

    }

}
