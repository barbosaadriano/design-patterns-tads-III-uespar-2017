/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author drink
 */
public class Funcionario {

    private String cargo;
    private String nome;

    private List<Funcionario> subordinados;

    public Funcionario() {
        this.subordinados = new ArrayList<Funcionario>();
    }
    
    

    public void add(Funcionario func) {
        this.subordinados.add(func);
    }

    public void remove(Funcionario func) {
        this.subordinados.remove(func);
    }

    public List<Funcionario> getSubordinados() {
        return subordinados;
    }

    public void passarMetas() {
        System.out.println("Funcionário " + this.toString()
                + " " + this.getCargo() + " passando as metas para"
                + " seus subordinados :");
        for (Funcionario subordinado : subordinados) {
            System.out.println("\t\t\t" + subordinado.toString());
             subordinado.passarMetas();
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }

}
