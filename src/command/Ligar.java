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
public class Ligar implements Command {

    @Override
    public void execute() {
        this.objeto.liga();
    }
    
    private LigaDesliga objeto;

    public Ligar(LigaDesliga objeto) {
        this.objeto = objeto;
    }
    
}
