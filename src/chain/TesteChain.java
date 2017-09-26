package chain;

/**
 *
 * @author drink
 */
public class TesteChain {
    
    public static void main(String[] args) {
        
        PoderDeCompra func1 =new Funcionario();
        PoderDeCompra func2 =new Funcionario();
        PoderDeCompra ger = new Gerente();
        PoderDeCompra dir = new Diretor();
        
        func1.setSuccessor(func2);
        func2.setSuccessor(ger);
        ger.setSuccessor(dir);
        
        for (int i = 0; i < 200; i++) {
            
            double valor 
                    = Math.random() * i * 20;
            
            func1.processaRequisicao(valor);
            
            
        }
        
    }
    
}
