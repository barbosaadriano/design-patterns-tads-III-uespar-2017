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
public class AparelhoSerial implements SerialInterface{

    @Override
    public void enviarDados(String dados) {
        System.out.println("Enviando dados pela Serial!");
        System.out.println(dados);
        System.out.println("Dados enviados!");
    }
    
}
