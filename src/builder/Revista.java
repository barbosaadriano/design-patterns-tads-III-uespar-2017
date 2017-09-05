/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.Date;
import java.util.List;

/**
 *
 * @author drink
 */
public class Revista implements Artigo {

    private String autor;
    private String titulo;
    private List<String> marcacoes;
    private int paginas;
    private Date publicado;
    private String texto;
    
    @Override
    public void setAutor(String nome) {
       this.autor = nome;
    }

    @Override
    public void setTitulo(String titulo) {
       this.titulo = titulo; 
    }

    @Override
    public void setMarcacoes(List<String> marcacoes) {
       this.marcacoes = marcacoes;
    }

    @Override
    public void setPaginas(int paginas) {
       this.paginas = paginas; 
    }

    @Override
    public void setDataDaPublicacao(Date data) {
        this.publicado = data;
    }

    @Override
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
     @Override
    public String toString() {
        return "Revista{"
                + "autor='" + autor + '\''
                + ", titulo='" + titulo + '\''
                + ", marcacoes=" + marcacoes
                + ", paginas=" + paginas
                + ", publicado=" + publicado
                + ", texto='" + texto + '\''
                + '}';
        
    }
    
}
