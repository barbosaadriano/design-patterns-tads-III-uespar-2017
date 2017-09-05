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
public class BlogBuilder extends ArtigoBuilder {

    public BlogBuilder() {
        this.artigo = new Blog();
    }

    public static ArtigoBuilder builder() {
        return new BlogBuilder();
    }

}
