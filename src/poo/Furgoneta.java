/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Sebas
 */
public class Furgoneta extends Coche {
    
    private int capacidad_carga;
    private int plazas_extra;
    
    public Furgoneta(int plazas_extra,int capacidad_carga){
    
    super();//llamar al constructor de la calase padre    
    this.plazas_extra = plazas_extra;
    this.capacidad_carga = capacidad_carga;
    
    }
    
    public String dimeDatosFurgoneta(){ //método getter
    
    return "la capacidad de carga es: " + capacidad_carga + " Y las plazas son: " + plazas_extra;
    
    
    }
    
    
}
