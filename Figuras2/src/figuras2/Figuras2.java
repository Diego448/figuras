package figuras2;
import java.awt.Graphics;
import java.util.Scanner;
/**
 *
 * @author 209506012
 */
public class Figuras2 {

    public static void Dibujar(Graphics g,int x, int y, int Ex, int Ey){
        g.drawLine(x, y, Ex, Ey);
    }
    public static void main(String[] args) {
        probarFiguras ventana = new probarFiguras();
        ventana.setVisible(true);
        
    }
}