package interpreter;

import java.util.ArrayList;

/**
 *
 * @author drink
 */
public class TestaInterpreter {
    
    public static void main(String[] args) {
   
        ArrayList<NumeroRomanoInterpreter>
                interpretadores = new ArrayList<>();
        
        interpretadores.add(new QuatroDigitos());
        interpretadores.add(new TresDigitos());
        interpretadores.add(new DoisDigitos());
        interpretadores.add(new UmDigito());
        
        String numeroRomano = "CXCIV";
        Contexto contexto = new Contexto(numeroRomano);
        
        for (NumeroRomanoInterpreter inte : interpretadores) {
            inte.interpretar(contexto);
        }
        System.out.println(numeroRomano+" = "
                +Integer.toString(contexto.getOutput()));       
        
        
        
    }
      
}
