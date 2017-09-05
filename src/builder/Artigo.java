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
public interface Artigo {
    
    void setAutor(String nome);
    
    void setTitulo(String titulo);
    
    void setMarcacoes(List<String> marcacoes);
    
    void setPaginas(int paginas);
    
    void setDataDaPublicacao(Date data);
    
    void setTexto(String texto);

    @Override
    public String toString();
    
        
}
