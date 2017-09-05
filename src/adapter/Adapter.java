/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author drink
 */
public class Adapter extends AparelhoUSB 
implements SerialInterface{

    @Override
    public void enviarDados(String dados) {
        super.enviarDadosUsb(dados);
    }
    
}
