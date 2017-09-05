/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author drink
 */
public class Programador implements Colaborador {

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
