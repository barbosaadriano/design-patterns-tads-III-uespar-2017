/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author drink
 */
public class Pizzaria {

    public static void main(String[] pizzaiolo) {

        Pizza massa = new PizzaBase();
        Pizza borda = new BordaDecorator(massa);
        Pizza bacon = new BaconDecorator(borda);
        Pizza cheese = new CreamCheeseDecorator(bacon);
        
        cheese.montarPizza();
        
        Pizza italiana  = new PizzaBase();
        Pizza maisBacon = new BaconDecorator(italiana);
        
        maisBacon.montarPizza();
        
    }

}
