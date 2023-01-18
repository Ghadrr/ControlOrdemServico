/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package br.com.assistenciaTec.projetoFinal;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionarioResp = new Funcionario("Vieirinha", "vieirinha@bol.com", "4326-9999", "Técnico");

        String nomeCliente = JOptionPane.showInputDialog("Nome Cliente");
        String email = JOptionPane.showInputDialog("email cliente");
        String telefone = JOptionPane.showInputDialog("telefone cliente");
        String observacao = JOptionPane.showInputDialog("observação (opcional)");
        Cliente cliente1 = new Cliente(nomeCliente, email, telefone, observacao);

        String defeito = JOptionPane.showInputDialog("defeito relatado pelo Cliente");
        OrdemServico os1 = new OrdemServico(defeito, new Date(), cliente1);
        os1.setStatusOS(StatusOS.RECEBIDO);
        JOptionPane.showMessageDialog(null, os1.getStatusOS());
        os1.setStatusOS(StatusOS.EMANALISE);
        JOptionPane.showMessageDialog(null, os1.getStatusOS());
        System.out.println(os1.toString());
        String deft = JOptionPane.showInputDialog("defeito relatado pelo tecnico");
        String servf = JOptionPane.showInputDialog("Servico a ser feito");
        Float maoObra = Float.parseFloat(JOptionPane.showInputDialog("Valor da Mão de obra"));
        int esc = JOptionPane.showConfirmDialog(null, "precisara substituir alguma peça ?");

        Float prodPreco = 0f;
        String produto = "/";
        Produto prod = new Produto(produto, prodPreco);
        Servico serv1 = new Servico(funcionarioResp, os1, servf, deft, maoObra, prod);
        serv1.getProdts().add(prod);
        if (esc == JOptionPane.YES_OPTION) {
            try {
                int esc2 = 0;
                if (esc2 == JOptionPane.YES_OPTION) {
                    while (esc2 == JOptionPane.YES_OPTION) {
                        String produt2 = JOptionPane.showInputDialog("qual peça devera ser substituida?");
                        Float precoProd2 = Float.parseFloat(JOptionPane.showInputDialog("preco"));
                        Produto prod2 = new Produto(produt2, precoProd2);
                        serv1.getProdts().add(prod2);
                        esc2 = JOptionPane.showConfirmDialog(null, "haverá outra troca de peça?");
                    }
                }
                os1.enviaEmail(serv1);
                os1.setStatusOS(StatusOS.AGUARDAPROV);
                JOptionPane.showMessageDialog(null, os1.getStatusOS());
                int aprov = JOptionPane.showConfirmDialog(null, "Cliente Aprovou ? ");
                if (aprov == JOptionPane.YES_OPTION) {
                    os1.setStatusOS(StatusOS.FINALIZADO);
                    JOptionPane.showMessageDialog(null, os1.getStatusOS());
                    os1.setStatusOS(StatusOS.AGUARDRETIRADA);
                    JOptionPane.showMessageDialog(null, os1.getStatusOS());
                } else {
                    os1.setStatusOS(StatusOS.FINALIZADO);
                    JOptionPane.showMessageDialog(null, os1.getStatusOS());
                    JOptionPane.showMessageDialog(null, "Não Fazer/Desfazer serviço");
                    os1.setStatusOS(StatusOS.AGUARDRETIRADA);
                    JOptionPane.showMessageDialog(null, os1.getStatusOS());
                }
            } catch (HeadlessException | NumberFormatException e) {
                System.out.println("formato errado " + e);
            }

        } else {
            try {
                Servico servSemProd = new Servico(funcionarioResp, os1, deft, servf, maoObra);
                JOptionPane.showMessageDialog(null, servSemProd.getVlorMaoObra());
                os1.enviaEmail(servSemProd);
                os1.setStatusOS(StatusOS.AGUARDAPROV);
                int aprov = JOptionPane.showConfirmDialog(null, "Cliente Aprovou ? ");
                if (aprov == JOptionPane.YES_OPTION) {
                    os1.setStatusOS(StatusOS.FINALIZADO);
                    JOptionPane.showMessageDialog(null, os1.getStatusOS());
                    os1.setStatusOS(StatusOS.AGUARDRETIRADA);
                    JOptionPane.showMessageDialog(null, os1.getStatusOS());
                } else {
                    os1.setStatusOS(StatusOS.FINALIZADO);
                    JOptionPane.showMessageDialog(null, os1.getStatusOS());
                    JOptionPane.showMessageDialog(null, "Não Fazer/Desfazer serviço");
                    os1.setStatusOS(StatusOS.AGUARDRETIRADA);
                    JOptionPane.showMessageDialog(null, os1.getStatusOS());
                }
            } catch (HeadlessException e) {
                System.out.println(e.getMessage());
            }

        }

    }
}
