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
public class PizzaBase implements Pizza {

    private float valor = (float) 0.0;

    public PizzaBase() {
      this.addValorExtra((float)5.50);
    }
    
    
    @Override
    public void montarPizza() {
        System.out.println("Valor total :"+this.valor);
        System.out.println("Eis uma pizza básica!");
    }

    @Override
    public void addValorExtra(float valor) {
        this.valor += valor;
    }
    
}
