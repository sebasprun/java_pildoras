/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.util.Date;
import java.util.GregorianCalendar;



/**
 *
 * @author sebastiaprunera
 */
public class uso_empleado {
    
    public static void main(String[] args) {
    
   /* Empleado empleado1 = new Empleado("sebas",95000,2002,2,15);
    Empleado empleado2 = new Empleado("pol",85000,2003,3,17);
    Empleado empleado3 = new Empleado("sebas",35000,2005,4,20);
    
    empleado1.subeSueldo(6);
    empleado2.subeSueldo(5);
    empleado3.subeSueldo(10);
    
        System.out.println("Nombre: " + empleado1.dameNombre() + " " + "Sueldo: "
        
        + empleado1.dameSueldo() + "Fecha de alta"+ " " + empleado1.dameFechaContrato());
        System.out.println("Nombre: " + empleado2.dameNombre() + " " + "Sueldo: "
        
        + empleado2.dameSueldo() + "Fecha de alta"+ " " + empleado2.dameFechaContrato());
        System.out.println("Nombre: " + empleado3.dameNombre() + " " + "Sueldo: "
        
        + empleado3.dameSueldo() + "Fecha de alta"+ " " + empleado3.dameFechaContrato());
        */
   
   //aqui estamos creando un array de clase empleado    
   Empleado[] misempleados = new Empleado[4];
   
   misempleados[0] = new Empleado("sebas",95000,2004,13,22);
   misempleados[1] = new Empleado("pol",75000,2002,13,25);
   misempleados[2] = new Empleado("filipo",75000,2005,13,27);
   misempleados[3] = new Empleado("sebastian");
   
// bucle for mejorado
   for(Empleado e: misempleados){
    
       e.subeSueldo(5);
  
   }
    
   for(Empleado e: misempleados){
   
   System.out.println("Nombre: " + e.dameNombre() + " " + "Sueldo: "
        
        + e.dameSueldo() + "Fecha de alta"+ " " + e.dameFechaContrato());
   
   }
   
   
   
   
    }
    
}


class Empleado{
    public Empleado(String nom, double sue,int agno, int mes, int dia){
    
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno,mes-1 , dia);
        altaContrato = calendario.getTime();
        
    }
    
    public Empleado(String nom){
    
    this(nom,60000,2002,13,25);
    
    
    }

    public String dameNombre(){ //getter
    
        return nombre;
    
    }
    
    public double dameSueldo(){ //getter
    
    return sueldo;
    }
    
    public Date dameFechaContrato(){ //getter
    
    return altaContrato;
    }
    
    public void subeSueldo(double porcentaje){ //setter
    
    double aumento = sueldo * porcentaje/100;
    
    sueldo+=aumento;
    
    
    }
    
    
    
    private String nombre;
    private double sueldo;
    private Date  altaContrato;
    
    
    
}


class Jefatura extends Empleado{

    public Jefatura(String nom,double sue,int agno,int mes, int dia){
        
        super(nom,sue,agno,mes,dia);
    
    
    }
    
    public void esatbleceIncentivo(double b){ //metodo setter
    
    this.incentivo = b;
    
    }
    
   @Override
   public double dameSueldo(){
    
    double sueldoJefe = super.dameSueldo(); //accesdemos a la clase padre
    
    return sueldoJefe + incentivo;
    
    }
    
    
    
    
    private double incentivo;
    
    
    



}