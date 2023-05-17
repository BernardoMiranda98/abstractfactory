
package abstractfactory;


public class BlueSquare extends Square{
    private BlueSquare (float height){
        super (height, "BLUE");
    }

    @Override
    public void draw() {
 System.out.println("Dentro do quadrado " + getColor()
    + " de altura" + getHeight() + " no método Draw()");        
    }
    
}
