package chain;

/**
 *
 * @author drink
 */
public abstract class PoderDeCompra  {
    
    protected static final double BASE = 200;
    
    protected PoderDeCompra successor = null;
    
    public abstract double getValorPermitido();
    
    public abstract String getPapel();

    public void setSuccessor(PoderDeCompra successor) {
        this.successor = successor;
    }
    
    public void processaRequisicao(double vlCompra) {
        if (this.getValorPermitido()>vlCompra) {
            System.out.println("Compra de "+String.valueOf(vlCompra)+" "
                    + "realizada por "+this.getPapel());
        } else {
            if (this.successor!=null) {
                this.successor.processaRequisicao(vlCompra);
            } else {
                System.out.println("Não há mais sucessor!");
                //throw new RuntimeException("Não foi possível processar sua "
                  //      + "requisição!");
                System.exit(0);
            }
        }
    }
    
}
