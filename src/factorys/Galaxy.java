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
class Galaxy implements Celular {

    private String msg = null; 
    
    public Galaxy(String par) {
        this.msg = par;
    }

    @Override
    public void enviaSMS() {
        System.out.println(this.msg+" estou enviando SMS");
    }

    @Override
    public void ligar() {
         System.out.println(this.msg+" estou ligando");
    }

    @Override
    public void whatsApp() {
        System.out.println(this.msg+" estou enviando um zAP"); 
    }
    
}
