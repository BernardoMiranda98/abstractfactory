
package abstractfactory;


public class BlueShapeFactory extends AbstractFactory{

    @Override
    public Shape getCircle(float ray) {
        return new BlueCircle (ray);
    }

    @Override
    public Shape getRectangle(float base) {
        return new BlueCircle (base);
    }

    @Override
    public Shape getSquare(float height) {
        return new BlueCircle (height);
    }
    
    
}
