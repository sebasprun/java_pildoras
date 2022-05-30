/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficos;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import javax.swing.*;
import java.awt.geom.*;
/**
 *
 * @author Sebas
 */
public class PruebaDibujo {
    public static void main(String[] args) {
        
        MarcoConDibujos mimarco= new MarcoConDibujos();
        
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
    }
}


class MarcoConDibujos extends JFrame{

public MarcoConDibujos(){

setTitle("prueba de dibyujo");
setSize(400,400);
laminaConFiguras milamina = new laminaConFiguras();
        
add(milamina);

}


}

class laminaConFiguras extends  JPanel{




public void paintComponent(Graphics g){

super.paintComponent(g);
Graphics2D g2 = (Graphics2D) g;

Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);

g2.draw(rectangulo);

Ellipse2D elipse = new Ellipse2D.Double();

elipse.setFrame(rectangulo);

g2.draw(elipse);

g2.draw(new Line2D.Double(100,100,300,250));

//g.drawRect(50, 50, 200, 200);
//g.drawLine(100, 100, 300, 200);
//g.drawArc(50, 100, 100, 200, 120, 150);
}



}