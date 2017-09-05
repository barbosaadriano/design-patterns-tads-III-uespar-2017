/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author drink
 */
public class Motor {

    private Freio freio;
    private Embreagem embreagem;

    public Motor(Freio f, Embreagem e) {
        this.freio = f;
        this.embreagem = e;
    }

    private void arranque() {
        System.out.println("Motor de arranque girando...!");
    }

    private void admissao() {
        System.out.println("Entrada de ar e combustível !!!");
        System.out.println("Compressão do ar e combustível!");
    }

    private void ignicao() {
        System.out.println("Explosão do combustível!!!");
    }

    private void escape() {
        System.out.println("Saída dos gazes após combustão!!!");
    }

    public void ligarMotor() {
        if (this.freio.isAcionado()) {
            this.arranque();
            this.admissao();
            this.ignicao();
            this.escape();
            System.out.println("Motor ligado!!!");
        } else {
            System.out.println("Motor não ligado,"
                    + " é necessário acionar o freio "
                    + "para dar a partida!!!");
        }
    }

}
