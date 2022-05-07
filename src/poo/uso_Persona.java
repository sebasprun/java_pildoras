/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Sebas
 */
public class uso_Persona {
    public static void main(String[] args) {
        
     persona[] laspersonas = new persona[2];
     
     laspersonas[0] = new Empleado2("luis conde",50000,2009,02,25);
     laspersonas[1] = new alumno("ana lopez", "biológicas");
        
     for (persona p: laspersonas){
     
         System.out.println(p.damenombre() + ", " + p.damedescripcion());
     
     }
        
        
        
    }
}

abstract class persona{

public persona(String nom){
nombre = nom;

}

public String damenombre(){ //getter

return nombre;
}

public abstract String damedescripcion(); //marca el diseño de la herencia

    
private String nombre;


}




class Empleado2 extends persona{
    public Empleado2(String nom, double sue,int agno, int mes, int dia){
    
        super(nom);
        
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno,mes-1 , dia);
        altaContrato = calendario.getTime();
        
    }
    
 @Override
    public String damedescripcion(){
    
    return "este empleado tiene un id = " + "con un sueldo" + sueldo ;
    
    }
    
    
    public  double dameSueldo(){ //getter
    
    return sueldo;
    }
    
    public Date dameFechaContrato(){ //getter
    
    return altaContrato;
    }
    
    public void subeSueldo(double porcentaje){ //setter
    
    double aumento = sueldo * porcentaje/100;
    
    sueldo+=aumento;
    
    
    }
    
    
    
    
    private double sueldo;
    private Date  altaContrato;
    
    
    
}

class  alumno extends persona{

public alumno(String nom,String car){

super(nom);

carrera = car;

}
@Override
public String damedescripcion(){

return "este alumno esta estudianod la carrera de " + carrera;

}

private String carrera;

}
