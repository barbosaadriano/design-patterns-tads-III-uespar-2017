/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author drink
 */
public class TestaPrototype {
    
    
    public static void main(String[] args) throws CloneNotSupportedException {
        
        Carro original = new Carro();
        original.setPlaca("ALF-5557");
        
        System.out.println(original.getPlaca());
        System.out.println(original.getRodas());
        
        Carro clone = (Carro) original.clone();
        clone.setPlaca("NOVA-PLACA");
        System.out.println(clone.getPlaca());
        System.out.println(clone.getRodas());
        Moto m = new Moto();
        m.setPlaca("AOH-7550");
        m.setRodas(3);
        Moto moto = (Moto) m.clone();
        System.out.println(moto.getPlaca());
        System.out.println(moto.getRodas());
        
        for (int i = 0; i < 1000; i++) {
            Moto mx = (Moto) moto.clone();
            System.out.println("Clone "+i);
            System.out.println(mx.getPlaca());
            System.out.println(mx.getRodas());
        }
        
    }
    
}
