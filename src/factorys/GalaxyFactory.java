/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorys;

/**
 *
 * @author drink
 */
public class GalaxyFactory extends CelularCreator{

    @Override
    public Celular criar() {
        return new Galaxy("Eu sou um Galaxy S2");
    }
    
}
