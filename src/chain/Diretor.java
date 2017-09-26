
package chain;

/**
 *
 * @author drink
 */
public class Diretor extends PoderDeCompra {

    @Override
    public double getValorPermitido() {
        return 10*BASE;
    }

    @Override
    public String getPapel() {
        return "The big boss";
    }
    
}
