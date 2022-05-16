/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficos;

import javax.swing.*;

/**
 *
 * @author Sebas
 */
public class CreandoMarcos {
    public static void main(String[] args) {
      
     miMarco marco1 = new miMarco();
     
     marco1.setVisible(true);
     marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}

class miMarco extends JFrame{

public miMarco(){
    
    //setSize(500,300);
    //setLocation(0,0);
    setBounds(800,600,800,600);
   // setResizable(false);
    setExtendedState(6);
    setTitle("MI ventana");
    
    
 
}

}