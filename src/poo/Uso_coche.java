/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Sebas
 */
public class Uso_coche {
    public static void main(String[] args) {
        
        Coche micoche = new Coche();
        
        micoche.establece_color("amarillo");
        
        System.out.println(micoche.dime_datos_generales());
        
        System.out.println(micoche.dime_color());
        
        micoche.configura_asientos("SI");
        
        System.out.println(micoche.dime_asientos());
        
    }
}
