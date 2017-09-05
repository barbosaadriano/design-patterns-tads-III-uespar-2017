
package bridge;

/**
 *
 * @author drink
 */
public class Analista implements Colaborador{
    
    private Tarefa tarefa; 
    
    @Override
    public void produz() {
        this.tarefa.realizarTarefa();
    }

    @Override
    public void recebeTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }
    
}
