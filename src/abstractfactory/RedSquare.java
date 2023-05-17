
package abstractfactory;

public class RedSquare extends Square{
    private RedSquare (float height){
        super (height, "RED");
    }

    @Override
    public void draw() {
 System.out.println("Dentro do quadrado " + getColor()
    + " de altura" + getHeight() + " no método Draw()");        
    }
    
    
}
