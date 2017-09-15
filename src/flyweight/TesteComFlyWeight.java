
package flyweight;

import java.awt.Color;

/**
 *
 * @author drink
 */
public class TesteComFlyWeight {
    
    private static final Color cores[] =
    {Color.RED,Color.GREEN,Color.BLUE};
    
    public static void main(String[] args) {
        Circle.limpaMemoria();
        for (int i = 0; i < 200; i++) {
//            Circle c = new Circle(getRandomColor());
            Circle c = (Circle) ShapeFactory.getCircle(getRandomColor());
            c.setY(getRandomY());
            c.setX(getRandomX());
            c.setDiametro(getRandomDiam());
            c.drawn();
        }
        System.out.println(Circle.getMemoria());
    }
    
    private static Color getRandomColor() {
        return cores[(int)(Math.random()*cores.length)];
    }
    
    private static int getRandomX(){
        return (int) (Math.random()*200);
    }
    private static int getRandomY(){
        return getRandomX();
    }
    private static int getRandomDiam() {
        return (int) (Math.random()*50);
    }
}
