
package proxy;

/**
 *
 * @author drink
 */
public class FaturamentoImpl implements Faturamento{

    private float valorFaturado;

    public FaturamentoImpl() {
        this.valorFaturado =
               (float)( 80000 * (Math.random()) );
    }
       
    
    @Override
    public void setToken(String token) {
    }

    @Override
    public float getValor() {
        return this.valorFaturado;
    }
    
}
