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
public class TestAdapter {

    public static void main(String[] args) {
        SerialInterface aparelho = new Adapter();
        Client c = new Client();
        c.enviarMensagem(aparelho);
    }

}
