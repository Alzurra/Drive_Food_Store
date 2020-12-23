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
public class BkSanduiche extends SanduicheStore {

    @Override
    public void createSanduiche(String lanche) {
        switch (lanche.toUpperCase()) {
            case "STACKER TRIPLO":
                sanduiche = new BkSanduicheStackerTriplo();
                System.out.println("BK Stacker Triplo entregue: " + sanduiche.bread + " + " + sanduiche.sauce
                        + " + " + sanduiche.meat + " + " + sanduiche.salad);
                break;
            case "BK CHEESE BURGUER":
                sanduiche = new BkSanduicheCheeseBurguer();
                System.out.println("BK Cheese Burguer entregue: " + sanduiche.bread + " + " + sanduiche.sauce
                        + " + " + sanduiche.meat + " + " + sanduiche.salad);
                break;
            case "BK CHEDDAR":
                sanduiche = new BkSanduicheCheddar();
                System.out.println("BK Cheddar entregue: " + sanduiche.bread + " + " + sanduiche.sauce
                        + " + " + sanduiche.meat + " + " + sanduiche.salad);
                break;
            case "BK CHICKEN":
                sanduiche = new BkSanduicheChicken();
                System.out.println("BK Chicken entregue: " + sanduiche.bread + " + " + sanduiche.sauce
                        + " + " + sanduiche.meat + " + " + sanduiche.salad);
                break;
            case "BK WHOPPER":
                sanduiche = new BkSanduicheWhopper();
                System.out.println("BK Whopper entregue: " + sanduiche.bread + " + " + sanduiche.sauce
                        + " + " + sanduiche.meat + " + " + sanduiche.salad);
                break;
            default:
                break;
        }
    }
}
