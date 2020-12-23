/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drivefoodstore;

/**
 *
 * @author Thiago
 */
public class SanduicheStore {

    public Sanduiche sanduiche;

    public SanduicheStore orderSanduiche(String loja) {
        if (loja.toUpperCase().equals("MC DONALDS")) {
            return new McSanduiche();
        } else if (loja.toUpperCase().equals("BURGUER KING")) {
            return new BkSanduiche();
        }
        return null;
    }

    public void createSanduiche(String lanche) {

    }
}
