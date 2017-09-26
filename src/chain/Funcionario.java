package chain;

/**
 *
 * @author drink
 */
public class Funcionario extends PoderDeCompra {

    @Override
    public double getValorPermitido() {
        return BASE;
    }

    @Override
    public String getPapel() {
        return "Funcionario";
    }
    
}
