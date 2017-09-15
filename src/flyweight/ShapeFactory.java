
package flyweight;

import java.awt.Color;
import java.util.HashMap;

/**
 *
 * @author drink
 */
public class ShapeFactory {
    
    private static final HashMap<Color, Shape> circleMap 
            = new HashMap<>();
    
    public static Shape getCircle(Color c) {
        Circle circle = (Circle) circleMap.get(c);
        if (circle == null) {
            circle = new Circle(c);
            circleMap.put(c, circle);
        }
        return circle;
    }
}
