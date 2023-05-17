
package abstractfactory;


public class RedShapeFactory extends AbstractFactory{

    @Override
    public Shape getCircle(float ray) {
        return new RedCircle(ray);
    }

    @Override
    public Shape getRectangle(float base) {
        return new RedCircle(base);
    }

    @Override
    public Shape getSquare(float height) {
        return new RedCircle(height);
    }
    
    
}
