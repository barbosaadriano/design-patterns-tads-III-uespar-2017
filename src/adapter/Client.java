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
public class Client {

    public void enviarMensagem(SerialInterface aparelho) {
        String msg = "Hello Adapter!!";
        aparelho.enviarDados(msg);
    }

}
