/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficos;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Sebas
 */
public class escribiendoenmarco {
    public static void main(String[] args) {
        
    MarcoConTexto mimarco = new MarcoConTexto();
    
    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    
        
        
    }
}


class MarcoConTexto extends JFrame{

public MarcoConTexto(){

    setVisible(true);
    setSize(600,450);
    setLocation(400,200);
    setTitle("primer texto");
    Lamina milamina= new Lamina();
    add(milamina);

}


}


class Lamina extends JPanel{

    @Override
    public void paintComponent(Graphics g){
    
    super.paintComponent(g);
    g.drawString("estamos aprendienfo Swing", 100, 100);
    
    }
    
  


}
