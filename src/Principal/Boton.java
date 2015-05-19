
package Principal;

import javax.swing.JButton;

/**
 *
 * @author Daniel López
 * La clase botón almacena si es una bomba o no
 * y la posición (x,y) en el array
 */
public class Boton extends JButton{
   int bomba = 0;
   int x,y;
   int numeroMinasAlrededor = 0;
   //constructor básico para iniciar la x y la y 
   public Boton(int _x, int _y){
       x = _x;
       y = _y;
   }
}
