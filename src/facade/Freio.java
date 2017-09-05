
package facade;

/**
 *
 * @author drink
 */
public class Freio {
    
    private boolean acionado;
    
    public void frear(){
        this.acionado = true;
        System.out.println("O freio foi acionado!");
    }
    
    public void liberarFreio() {
        this.acionado = false;
        System.out.println("O freio foi liberado!");
    }

    public boolean isAcionado() {
        return acionado;
    }
    
    
    
}
