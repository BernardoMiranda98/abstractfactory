
package abstractfactory;


public class BlueCircle extends Circle{
    
    public BlueCircle (float ray){
        super (ray, "BLUE");
    }

    @Override
    public void draw() {
    System.out.println("Dentro do circulo " + getColor()
    + " de raio " + getRay() + " no método Draw()");
    }
}
