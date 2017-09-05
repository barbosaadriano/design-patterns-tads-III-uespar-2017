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
public class JornalBuilder extends ArtigoBuilder {

    public JornalBuilder() {
        this.artigo = new Jornal();
    }

    public static ArtigoBuilder builder() {
        return new JornalBuilder();
    }

}
