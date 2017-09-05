/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author drink Este é o Prototype
 */
public abstract class Veiculo implements Cloneable {

    private String placa;
    private int rodas;
    
    @Override
    protected abstract Object clone() throws CloneNotSupportedException;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
   
    
}
