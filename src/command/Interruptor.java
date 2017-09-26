package command;

/**
 *
 * @author drink
 */
public class Interruptor implements LigaDesliga{
    
    private Command ligar;
    private Command desligar;

    public Interruptor(Command ligar, Command desligar) {
        this.ligar = ligar;
        this.desligar = desligar;
    }

    @Override
    public void liga() {
        ligar.execute();
    }

    @Override
    public void desliga() {
        desligar.execute();
    }
    
    
    
}
