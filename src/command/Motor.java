/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author drink
 */
public class Motor implements LigaDesliga {

    @Override
    public void liga() {
        System.out.println("Motor girando!");
    }

    @Override
    public void desliga() {
        System.out.println("Motor Parado!!");
    }
    
}
