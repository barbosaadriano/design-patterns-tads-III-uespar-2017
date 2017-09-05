
package decorator;

/**
 *
 * @author drink
 */
public class PizzaDecorator implements Pizza {

    private Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public void montarPizza() {
        this.pizza.montarPizza();
    }

    @Override
    public void addValorExtra(float valor) {
        this.pizza.addValorExtra(valor);
    }
    
}
