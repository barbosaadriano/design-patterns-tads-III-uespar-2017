package proxy;

/**
 *
 * @author drink
 */
public class FaturamentoProxy extends FaturamentoImpl{
    
    private final String validToken = "meuTokenSecreto";
    private String tokenUsuario;

    public FaturamentoProxy() {
        super();
        tokenUsuario = "";
    }
    
    
        
    @Override
    public void setToken(String token) {
        this.tokenUsuario = token;
    }

    @Override
    public float getValor() {
       if (this.tokenUsuario.isEmpty()) {
           throw new RuntimeException("Seu Token não é Válido!");
       }
       if (!this.tokenUsuario.equals(validToken)) {
           throw new RuntimeException("Sem permissão!");
       }
       return super.getValor();
    }
    
    
}
