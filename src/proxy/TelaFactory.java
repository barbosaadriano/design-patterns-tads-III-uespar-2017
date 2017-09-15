/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author drink
 */
public class TelaFactory {
    
    public static Tela createTela(String screenName,String userName) {
        if (screenName.equals("faturamento")) {
            return new TelaFatProxy(userName);
        }
        return null;
    }
    
}
