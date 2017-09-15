/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import javax.swing.JOptionPane;

/**
 *
 * @author drink
 */
public class TelaFatProxy extends TelaImpl{

    public TelaFatProxy(String usuario) {
        super(usuario);
    }

    @Override
    public void abrir() {
        if (usuario.equals("adriano")) {
            TelaFat tf = new TelaFat();
            tf.setLocationRelativeTo(null);
            tf.setVisible(true);
        } else {
            JOptionPane
                   .showMessageDialog(null,
                           "Você não tem permissão!");
        }
    }
    
}
