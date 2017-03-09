package figuras2;

import java.awt.Graphics;

/**
 *
 * @author 209506012
 */
public class Circulo extends Figura{
public void dibujar(Graphics g, int a){
    g.drawOval(A, A, a, a);
    }
    public void borrar(Graphics g, int a){
    g.clearRect(A, A, a, a);
    }
}
