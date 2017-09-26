package chain;

/**
 *
 * @author drink
 */
public class Gerente extends PoderDeCompra {

    @Override
    public double getValorPermitido() {
        return 2*BASE;
    }

    @Override
    public String getPapel() {
        return "Gerente";
    }
    
}
