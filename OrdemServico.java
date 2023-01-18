/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.assistenciaTec.projetoFinal;

import javax.swing.*;
import java.util.Date;

/**
 *
 * @author Gabriel
 */
public class OrdemServico {

    private String defeitoRelatado;
    private Date dataCheg;
    private Date dataSaid;
    private Cliente cliente;
    private StatusOS statusOS;
    private Servico servico;


    public OrdemServico(String defeitoRelatado, Date dataCheg, Cliente cliente) {
        this.defeitoRelatado = defeitoRelatado;
        this.dataCheg = dataCheg;
        this.cliente = cliente;
    }

    public void enviaEmail(Servico servico){
        //servico.getDiagnostico();
        JOptionPane.showMessageDialog(null,servico);
    }
    
    
    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
  

    public String getDefeitoRelatado() {
        return defeitoRelatado;
    }

    public void setDefeitoRelatado(String defeitoRelatado) {
        this.defeitoRelatado = defeitoRelatado;
    }

    public Date getDataCheg() {
        return dataCheg;
    }

    public void setDataCheg(Date dataCheg) {
        this.dataCheg = dataCheg;
    }

    public Date getDataSaid() {
        return dataSaid;
    }

    public void setDataSaid(Date dataSaid) {
        this.dataSaid = dataSaid;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public StatusOS getStatusOS() {
        return statusOS;
    }

    public void setStatusOS(StatusOS statusOS) {
        this.statusOS = statusOS;
    }

//    @Override
//    public String toString() {
//        return "OrdemServico{" + "cliente=" + cliente + ", servico=" + servico + '}';
//    }

//    @Override
//    public String toString() {
//        return "status da OS=" + statusOS;
//    }

    
    
}
