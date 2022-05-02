/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;
//import javax.swing.JOptionPane;
/**
 *
 * @author Sebas
 */
public class Uso_Vehiculo {
    public static void main(String[] args) {
      /*  clase coche 
        Coche micoche = new Coche();
        
        micoche.establece_color(JOptionPane.showInputDialog("introduce color"));
        
        System.out.println(micoche.dime_datos_generales());
        
        System.out.println(micoche.dime_color());
        
        micoche.configura_asientos(JOptionPane.showInputDialog("tiene asientos de cuero?"));
        
        System.out.println(micoche.dime_asientos());
        
        micoche.configura_climatizador(JOptionPane.showInputDialog("¿tiene climatizador?sdsd"));
        
        System.out.println(micoche.dimeClimatizador());
        
        System.out.println(micoche.dime_peso_coche());
        
        System.out.println("el precio final de coche es: " + micoche.precio_coche());
        
        */
        
        Coche micoche1 = new Coche();
        
        micoche1.establece_color("Rojo");
        
        Furgoneta mifurgoneta1 = new Furgoneta(7,580);
        
        mifurgoneta1.establece_color("azul");
        
        mifurgoneta1.configura_asientos("si");
        mifurgoneta1.configura_climatizador("si");
        
        
        System.out.println(micoche1.dime_datos_generales() + " " + micoche1.dime_color());
        
        System.out.println(mifurgoneta1.dime_datos_generales()+ " " + mifurgoneta1.dimeDatosFurgoneta());
        
    }
}
