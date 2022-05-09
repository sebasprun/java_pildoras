/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;
import java.awt.Toolkit;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author Sebas
 */
public class PruebaTemporizador {
    public static void main(String[] args) {
        
        DamelaHora oyente = new DamelaHora();
        
        Timer mitemporizador = new Timer(5000,oyente);
        
        mitemporizador.start();
        
        JOptionPane.showMessageDialog(null, "pulsa aceptar para detener");
        
        System.exit(0);
      
        
        
    } 
}


class DamelaHora implements ActionListener{

public void actionPerformed(ActionEvent e){

    
    
    Date ahora = new Date();
    
    System.out.println("Te pongop la hora cada 5 segundos: " + ahora);
    
    Toolkit.getDefaultToolkit().beep();

}


}
