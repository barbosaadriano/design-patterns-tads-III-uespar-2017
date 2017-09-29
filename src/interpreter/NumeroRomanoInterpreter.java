/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author drink
 */
public abstract class NumeroRomanoInterpreter {

    public abstract String um();

    public abstract String quatro();

    public abstract String cinco();

    public abstract String nove();

    public abstract int multiplicador();

    private void consumirUmaCasaInput(Contexto contexto) {
        contexto.setInput(contexto.getInput().substring(1));
    }

    private void consumirDuasCasasDoInput(Contexto contexto) {
        contexto.setInput(contexto.getInput().substring(2));
    }

    private void adicionarValorOutput(Contexto c, int num) {
        c.setOutput(c.getOutput() + (num * multiplicador()));
    }

    public void interpretar(Contexto contexto) {
        if (contexto.getInput().length() == 0) {
            return;
        }
        if (contexto.getInput().startsWith(nove())) {
            adicionarValorOutput(contexto, 9);
            consumirDuasCasasDoInput(contexto);
        } else if (contexto.getInput().startsWith(quatro())) {
            adicionarValorOutput(contexto, 4);
            consumirDuasCasasDoInput(contexto);
        } else if (contexto.getInput().startsWith(cinco())) {
            adicionarValorOutput(contexto, 5);
            consumirUmaCasaInput(contexto);
        }
        while (contexto.getInput().startsWith(um())) {
            adicionarValorOutput(contexto, 1);
            consumirUmaCasaInput(contexto);
        }

    }
}
