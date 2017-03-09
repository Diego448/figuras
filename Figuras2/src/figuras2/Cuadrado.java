package figuras2;
import java.awt.Graphics;
/**
 *
 * @author 209506012
 */
public class Cuadrado extends Figura{
    public void dibujar(Graphics g, int a){
    g.drawRect(A, A, a, a);
    
    }
    public void borrar(Graphics g, int a){
    g.clearRect(A, A, a, a);
    }
    public void setCuadrado(int a){
        this.a = a;
    }
}
