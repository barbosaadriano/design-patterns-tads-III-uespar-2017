/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author drink
 */
public class Embreagem {
    
    private boolean acionada; 
    
    public void acionar() {
        this.acionada = true;
        System.out.println("A embreagem foi acionada!");
    }
    
    public void soltar() {
        this.acionada = false;
        System.out.println("A embreagem foi soltada!");
    }

    public boolean isAcionada() {
        return acionada;
    }
    
    
}
