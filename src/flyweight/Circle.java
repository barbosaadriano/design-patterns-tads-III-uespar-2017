package flyweight;

import java.awt.Color;

/**
 *
 * @author drink
 */
public class Circle implements Shape {

    private static long mem = 0;
    public static void registraMemoria(){
        Circle.mem++;
    }
    public static void limpaMemoria(){
        Circle.mem = 0;
    }
    public static long getMemoria() {
        return Circle.mem;
    }
    private Color cor;
    private int x;
    private int y;
    private int diametro;
    
    @Override
    public void drawn() {
        System.out.println("Desenhando um circulo"
                + " em x:"+x+",y:"+y+" com "
                + ""+diametro+" de diametro "
                + "na cor "+cor);
    }

    public Circle(Color cor) {
        this.cor = cor;
        System.out.println("Criando 1 Circulo!");
        Circle.registraMemoria();
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }
    
    
    
}
