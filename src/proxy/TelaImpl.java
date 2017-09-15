package proxy;

/**
 *
 * @author drink
 */
public abstract class TelaImpl implements Tela{
    
    protected String usuario;
    
    public TelaImpl(String usuario){
        this.usuario = usuario;
    }
    
}
