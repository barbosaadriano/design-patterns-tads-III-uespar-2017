/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author drink
 */
public class TestaComposite {

    public static void main(String[] args) {
        
        Funcionario presidente = new Funcionario();
        presidente.setNome("Alfredo Lang");
        presidente.setCargo("Presidente");
        
        Funcionario dirAdmin = new Funcionario();
        dirAdmin.setCargo("Diretor Administrativo");
        dirAdmin.setNome("Dir. Admin. fulano");
        
        Funcionario dirFinan = new Funcionario();
        dirFinan.setNome("Homen do dinheiro");
        dirFinan.setCargo("Diretor Financeiro");
        
        Funcionario gerComercial = new Funcionario();
        gerComercial.setCargo("Ger. Comercial");
        gerComercial.setNome("Nome do Gerente Comercial");
        
        Funcionario representante = new Funcionario();
        representante.setCargo("Representante comercial");
        representante.setNome("nome do representante");
       
        Funcionario representante1 = new Funcionario();
        representante1.setCargo("Representante comercial");
        representante1.setNome("nome do representante 1");
        
        Funcionario vendedor = new Funcionario();
        vendedor.setCargo("Vendedor");
        vendedor.setNome("Nome do vendedor!");
        
        
        representante1.add(vendedor);
        
        gerComercial.add(representante1);
        gerComercial.add(representante);
        
        dirAdmin.add(gerComercial);
        
        presidente.add(dirAdmin);
        presidente.add(dirFinan);
        
        presidente.passarMetas();
        
        NewJInternalFrame jf = new NewJInternalFrame();
        jf.setVisible(true);
        
    }

}
