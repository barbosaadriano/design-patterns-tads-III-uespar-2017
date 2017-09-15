
package flyweight;

import java.awt.Color;

/**
 *
 * @author drink
 */
public class TesteSemFlyWeight {
    
    private static final Color cores[] =
    {Color.RED,Color.GREEN,Color.BLUE,Color.ORANGE,
    Color.GRAY};
    
    public static void main(String[] args) {
        Tela t = new Tela();
        t.setLocationRelativeTo(null);
        t.setVisible(true);
        Circle.limpaMemoria();
        for (int i = 0; i < 200; i++) {
            Circle c = new Circle(getRandomColor());
            c.setY(getRandomY());
            c.setX(getRandomX());
            c.setDiametro(getRandomDiam());
            c.drawn();
            t.getCirculos().add(c);
        }
        t.redesenhar();
        System.out.println(Circle.getMemoria());
    }
    
    private static Color getRandomColor() {
        return cores[(int)(Math.random()*cores.length)];
    }
    
    private static int getRandomX(){
        return (int) (Math.random()*250);
    }
    private static int getRandomY(){
        return getRandomX();
    }
    private static int getRandomDiam() {
        return (int) (Math.random()*100);
    }
}
