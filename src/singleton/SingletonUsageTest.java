/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author drink
 */
public class SingletonUsageTest {
    
    public static void main(String[] args) {
        
        MessageHelper.getInstance()
                .message("Uma mensagem de erro!")
                .type(MessageHelper.Type.error)
                .show();
        
        MessageHelper.getInstance()
                .message("Uma mensagem de Aviso!")
                .type(MessageHelper.Type.alert)
                .show();
        
        MessageHelper.getInstance()
                .message("A information message!")
                .type(MessageHelper.Type.info)
                .show();
        
        
        
    }
    
}
