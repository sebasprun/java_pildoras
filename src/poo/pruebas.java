/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Sebas
 */
public class pruebas {
    public static void main(String[] args) {
       
     Empleados trabajador1 = new Empleados("sebas");   
     Empleados trabajador2 = new Empleados("pol");
     Empleados trabajador3 = new Empleados("Iván");
     Empleados trabajador4 = new Empleados("Billy");
     
     trabajador1.cambiarSeccion("rrhh");
     
     
     
     System.out.println(trabajador1.devuelveDatos() + "\n" + 
             trabajador2.devuelveDatos() + "\n" + trabajador3.devuelveDatos()
             + "\n" + trabajador4.devuelveDatos());
     
     System.out.println(Empleados.dameIdSiguiente());   
    
     
     
     
     
        
    }
}  

class Empleados{

    
    public Empleados(String nom){ 
            
    nombre = nom;
    seccion = "administracion";
    Id  = IdSiguiente; //el id es = a id siguiente
    
    IdSiguiente++; // se incrementa cada vez que se instancia.
    
    
 
    
    
    
    }
    
    
    
    public void cambiarSeccion(String seccion){ //setter
    
    this.seccion = seccion;
    
    }
    
    

    
    
    public String devuelveDatos(){
    
    return "el nombre es  " + nombre + "  la seecion es " + this.seccion + " y el Id=" +Id;
            
    }
    public static String dameIdSiguiente(){ // solo puede acceder a la variable porquue es estática
        return "El IdSiguiente es: " + IdSiguiente;
    
    
    
    
    }

   
    
    
    private final String nombre;
    private String seccion;
    private int Id;
    private static int IdSiguiente = 1;
    

}
