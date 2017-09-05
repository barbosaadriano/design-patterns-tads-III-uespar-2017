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
public class TesteSemFacade {
    
    public static void main(String[] args) {
        Freio f = new Freio();
        f.frear();
        Embreagem e = new Embreagem();
        Motor m = new Motor(f, e);
        m.ligarMotor();
        
    }
    
}
