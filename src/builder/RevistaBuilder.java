/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Adriano Barbosa
 */
public class RevistaBuilder extends ArtigoBuilder {

    public RevistaBuilder() {
        this.artigo = new Revista();
    }

    public static ArtigoBuilder builder() {
        return new RevistaBuilder();
    }

}
