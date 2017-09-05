/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Adriano Barbosa
 */
public class CadastraArtigo {

    public static void main(String[] args) {

        
        List<Artigo> artigos = new ArrayList<Artigo>();
        Tipos[] values = Tipos.values();
        for (int i = 0; i < values.length; i++) {
            Tipos value = values[i];
            ArtigoBuilder ab = null;
            switch (value) {
                case Jornal:
                    ab = JornalBuilder.builder();
                    break;
                case Blog:
                    ab = BlogBuilder.builder();
                    break;
                case Revista:
                    ab = RevistaBuilder.builder();
                    break;
            }
            
            Artigo a = ab.autor("Adriano Barbosa")
                .titulo("Builder "+ab.getClass())
                .assuntos("builder pattern", "java")
                .publicadoEm(20, 3, 2005)
                .texto("O padrão de projeto builder...")
                .get();
            artigos.add(a);
        }
        Iterator<Artigo> it = artigos.iterator();
        while(it.hasNext()) {
            Artigo next = it.next();
            System.out.println(next);
        }
        
    }
}
