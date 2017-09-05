package decorator;

/**
 *
 * @author drink
 */
public class CreamCheeseDecorator extends PizzaDecorator {

    public CreamCheeseDecorator(Pizza pizza) {
        super(pizza);
        super.addValorExtra((float)4.5);
    }

    @Override
    public void montarPizza() {
        super.montarPizza(); 
        System.out.println("Um pouquinho de cream cheese!!!");
    }

}
