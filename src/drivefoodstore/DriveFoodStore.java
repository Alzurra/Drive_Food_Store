/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drivefoodstore;

import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class DriveFoodStore {

    public static void main(String[] args) {
        SanduicheStore lanchonete = new SanduicheStore();
        
        JOptionPane.showMessageDialog(null,"\nLISTA COM OS PEDIDOS REALIZADOS!!" + "\nMC DONALDS" + "\nBURGUER KING");

        lanchonete = lanchonete.orderSanduiche("MC DONALDS");
        lanchonete.createSanduiche("BIG MAC");
        System.out.println("");
        System.out.println("");
        lanchonete = lanchonete.orderSanduiche("BURGUER KING");
        lanchonete.createSanduiche("BK CHICKEN");
        System.out.println("");
        System.out.println("");
        lanchonete = lanchonete.orderSanduiche("BURGUER KING");
        lanchonete.createSanduiche("BK WHOPPER");
        System.out.println("");
        System.out.println("");
        lanchonete = lanchonete.orderSanduiche("MC DONALDS");
        lanchonete.createSanduiche("MC CHICKEN");
    }
}

