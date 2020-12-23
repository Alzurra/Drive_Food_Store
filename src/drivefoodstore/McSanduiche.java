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
public class McSanduiche extends SanduicheStore {

    @Override
    public void createSanduiche(String lanche) {
        switch (lanche.toUpperCase()) {
            case "BIG MAC":
                sanduiche = new McSanduicheBigMac();
                System.out.println("Big Mac entregue: " + sanduiche.bread + " + " + sanduiche.sauce
                        + " + " + sanduiche.meat + " + " + sanduiche.salad);
                break;
            case "MC BURGUER":
                sanduiche = new McSanduicheMcBurguer();
                System.out.println("Mc Burguer entregue: " + sanduiche.bread + " + " + sanduiche.sauce
                        + " + " + sanduiche.meat + " + " + sanduiche.salad);
                break;
            case "MC CHICKEN":
                sanduiche = new McSanduicheMcChicken();
                System.out.println("Mc Chicken entregue: " + sanduiche.bread + " + " + sanduiche.sauce
                        + " + " + sanduiche.meat + " + " + sanduiche.salad);
                break;
            case "MC FISH":
                sanduiche = new McSanduicheMcFish();
                System.out.println("Mc Fish entregue: " + sanduiche.bread + " + " + sanduiche.sauce
                        + " + " + sanduiche.meat + " + " + sanduiche.salad);
                break;
            case "MC LANCHE FELIZ":
                sanduiche = new McSanduicheMcLancheFeliz();
                System.out.println("Mc Lanche Feliz entregue: " + sanduiche.bread + " + " + sanduiche.sauce
                        + " + " + sanduiche.meat + " + " + sanduiche.salad);
                break;
            default:
                break;
        }
    }

}
