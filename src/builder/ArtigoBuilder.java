/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.Arrays;
import java.util.Calendar;

/**
 *
 * @author drink
 */
public abstract class ArtigoBuilder {
    
    protected Artigo artigo;
    
    public ArtigoBuilder autor(String autor) {
        this.artigo.setAutor(autor);
        return this;
    }
    public ArtigoBuilder titulo(String titulo) {
        this.artigo.setTitulo(titulo);
        return this;
    }
    public ArtigoBuilder assuntos(String... assuntos) {
        this.artigo.setMarcacoes(Arrays.asList(assuntos));
        return this;
    }
    public ArtigoBuilder totalDePaginas(int total) {
        this.artigo.setPaginas(total);
        return this;
    }
    
    public ArtigoBuilder publicadoEm(int dia, int mes
    ,int ano) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(ano, mes, dia);
        this.artigo.setDataDaPublicacao(calendar.getTime());
        return this;
    }
    public ArtigoBuilder texto(String texto) {
        this.artigo.setTexto(texto);
        return this;
    }
    public Artigo get() {
        return this.artigo;
    }
}
