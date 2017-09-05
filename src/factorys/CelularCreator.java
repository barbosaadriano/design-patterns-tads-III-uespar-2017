/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorys;

/**
 *
 * @author drink
 */
public abstract class CelularCreator {
    
    public abstract Celular criar();
    
    public static CelularCreator getFactory(CelularEnum e){
       switch(e) {
           case IPHONE6 :
               return new IPhoneFactory();
           case GALAXYS :
               return new GalaxyFactory();
               default:
                   System.out.println("opção não encontrada!");
       }
       return null;
    }
    
}
