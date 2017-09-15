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
public class TestaProxy2 {
 
    public static void main(String[] args) {
        String menuSelecionado = "faturamento";
        String usuarioLogado = "alife";
        Tela t = 
          TelaFactory.createTela(menuSelecionado,
                  usuarioLogado);
        if (t!=null) {
            t.abrir();
        }
    }
    
}
