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
public class Carro extends Veiculo{

    public Carro() {
       this.setRodas(4);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       Carro cl = new Carro();
       cl.setPlaca(this.getPlaca());
       cl.setRodas(this.getRodas());
       return cl;
    }
    
}
