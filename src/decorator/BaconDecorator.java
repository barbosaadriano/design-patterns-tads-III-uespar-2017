package decorator;

/**
 *
 * @author drink
 */
public class BaconDecorator extends PizzaDecorator {

    public BaconDecorator(Pizza pizza) {
        super(pizza);
        super.addValorExtra((float)2.5);
    }

    @Override
    public void montarPizza() {
        super.montarPizza(); 
        System.out.println("Muito bacon!!");
    }
   
}
