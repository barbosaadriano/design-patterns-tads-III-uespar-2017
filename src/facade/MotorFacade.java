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
public class MotorFacade {

    private Motor motor;
    
    public MotorFacade() {
        Freio f = new Freio();
        f.frear();
        this.motor = new Motor(f, new Embreagem());
    }
    
    public void start() {
        this.motor.ligarMotor();
    }
    
}
