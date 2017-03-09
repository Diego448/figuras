/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras2;

import java.awt.Graphics;

/**
 *
 * @author 209506012
 */
public class Rectangulo extends Figura{
public void dibujar(Graphics g, int a, int b){
    g.drawRect(A, A, a, b);
    }
    public void borrar(Graphics g, int a, int b){
    g.clearRect(A, A, a, b);
    }
}
