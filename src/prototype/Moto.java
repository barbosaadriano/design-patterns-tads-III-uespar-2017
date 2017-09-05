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
public class Moto extends Veiculo{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Moto m = new Moto();
        m.setPlaca(this.getPlaca());
        m.setRodas(this.getRodas());
        return m;
    }

    public Moto() {
        this.setRodas(2);
    }
    
}
