/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Sebas
 */
public class Coche {
  
   private int ruedas;
   private int largo;
   private int ancho;
   private int motor;
   private int peso_plataforma;
   private String color;
   private int peso_total;
   private boolean asientos_cuero, climatizador;
   
    
    public Coche(){
    
    ruedas = 4;
    largo= 2000;
    ancho=300;
    motor=1600;
    peso_plataforma=500;
    
    }
    
    public String dime_datos_generales(){ //getter
    
    
    return "la plataforma del vehiculo tiene  " + ruedas + " ruedas " + ". Mide" + largo/1000 + " metros con un ancho de  " + ancho + " cm y un peso de plataforma de  " + peso_plataforma + "kg";
    
    
    }
    
    public void establece_color(String color_coche){ //setter
    
        color = color_coche;
    
    
    
    }
    
    public String dime_color(){
    
    return "el color de tu coche es " + color;
    }
    
    
    
}
