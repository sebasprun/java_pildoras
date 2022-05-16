/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficos;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;

/**
 *
 * @author Sebas
 */
public class Creandomarcocentrado {
    public static void main(String[] args) {
        
    MarcoCentrado mimarco = new MarcoCentrado();
    
    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    mimarco.setVisible(true);

        
    
        
        
    }
}


class MarcoCentrado extends JFrame{

    public MarcoCentrado(){
    
    Toolkit mipantalla = Toolkit.getDefaultToolkit();
    Dimension tamanoPantalla = mipantalla.getScreenSize();
    
    int alturaPantalla = tamanoPantalla.height;
    int anchoPantalla = tamanoPantalla.width;
    
    setSize(anchoPantalla/2, alturaPantalla/2);
    
    setLocation(anchoPantalla/4,alturaPantalla/4);
    
    setTitle("marcocentrado");
    
    Image miIcono = mipantalla.getImage("icono.gif");
    
    setIconImage(miIcono);
    
    
    
    
    
    
    }



}