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
public class TestaProxy1 {
    
    public static void main(String[] args) {
        Faturamento fat = new FaturamentoProxy();
        TestaProxy1 teste = new TestaProxy1();
        fat.setToken("meuTokenSecreto");
        teste.mostraFaturamento(fat);
    }
    
    private void mostraFaturamento(Faturamento f) {
        float valor = f.getValor();
        System.out.println("O valor é: "+String.valueOf(valor));
    }
    
}
