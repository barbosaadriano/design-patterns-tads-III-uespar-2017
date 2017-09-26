
package command;

/**
 *
 * @author drink
 */
public class Lampada implements LigaDesliga{

    @Override
    public void liga() {
        System.out.println("Lampada ligada!");
    }

    @Override
    public void desliga() {
        System.out.println("Lampada desligada!");
    }
    
    
}
