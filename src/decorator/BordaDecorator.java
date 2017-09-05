package decorator;

/**
 *
 * @author drink
 */
public class BordaDecorator extends PizzaDecorator {

    public BordaDecorator(Pizza pizza) {
        super(pizza);
        super.addValorExtra((float)4.0);
    }

    @Override
    public void montarPizza() {
        super.montarPizza(); 
        System.out.println("Uma borda recheada bem gostosa!!");
    }
    
    
    
}
