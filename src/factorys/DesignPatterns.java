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
public class DesignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CelularCreator cc =  
                CelularCreator.getFactory(CelularEnum.GALAXYS);
        Celular criar = cc.criar();
        criar.enviaSMS();
        criar.ligar();
        criar.whatsApp();
    }
    
}
