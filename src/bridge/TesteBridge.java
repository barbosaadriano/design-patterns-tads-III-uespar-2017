package bridge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author drink
 */
public class TesteBridge {

    public static void main(String[] args) {

        Colaborador prog = new Programador();
        Colaborador analista = new Analista();
        Colaborador suporte = new Suporte();

        Tarefa analise = new AnaliseDeNegocios();
        Tarefa progM = new ProgramacaoMobile();
        Tarefa progW = new ProgramacaoWeb();

        List<Colaborador> colaboradores = new ArrayList<Colaborador>();
        List<Tarefa> tarefas = new ArrayList<Tarefa>();
        colaboradores.add(prog);
        colaboradores.add(analista);
        colaboradores.add(suporte);
        tarefas.add(analise);
        tarefas.add(progM);
        tarefas.add(progW);

//        Iterator<Colaborador> it1 = colaboradores.iterator();
//        Iterator<Tarefa> it2 = tarefas.iterator();
//        while (it1.hasNext()) {
//            Colaborador c = it1.next();
//            while (it2.hasNext()) {
//                Tarefa t = it2.next();
//                System.out.print("Colaborador ");
//                System.out.println(c.getClass().getCanonicalName());
//                c.recebeTarefa(t);
//                c.produz();
//                System.out.println("------------");
//            }
//        }

        for (Tarefa tarefa : tarefas) {
            for (Colaborador colaborador : colaboradores) {
                System.out.print("Colaborador ");
                System.out.println(colaborador.getClass().getCanonicalName());
                colaborador.recebeTarefa(tarefa);
                colaborador.produz();
                System.out.println("------------");
            }
        }

    }

}
