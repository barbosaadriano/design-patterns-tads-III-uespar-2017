package command;

/**
 *
 * @author drink
 */
public class TestaCommand {
    
    public static void main(String[] args) {
        
        LigaDesliga motor = new Motor();
        LigaDesliga lampada = new Lampada();
        
        Command ligar = new Ligar(lampada);
        Command desligar = new Desligar(lampada);
        
        Interruptor i = new Interruptor(ligar, desligar);
        
        i.liga();
        i.desliga();
        
    }
            
    
}
