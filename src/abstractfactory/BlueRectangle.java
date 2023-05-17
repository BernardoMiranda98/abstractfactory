
package abstractfactory;


public class BlueRectangle extends Rectangle{
    
    public BlueRectangle (float base){
        super (base, "BLUE");
    }

    @Override
    public void draw() {
        System.out.println("Dentro do retangulo " + getColor()
        + " de base " + getBase() + " no método Draw()");
               
    }
    
}
