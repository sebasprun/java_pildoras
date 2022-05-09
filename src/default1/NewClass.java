/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package default1;
import java.util.Scanner;
/**
 *
 * @author Sebas
 */
public class NewClass {
    
    //enum Talla {mini,mediano,grande,muy_grande};
    
    enum Talla {
        
        MINI("s"),mediano("M"),GRANDE("L"),MUY_GRANDE("XL");
    
        private Talla(String abreviatura){
         
        this.abreviatura = abreviatura;
        }
        
        
    public String dameAbreviatura(){
    
    return abreviatura;
    
    }    
        
    private String abreviatura;
    
    }
    
    
    
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("EScribe una tall: MINI,MEDIANO,GRANDE,MUY_GRANDE");
        
    String entrada_datos = entrada.next().toUpperCase();    
     
    Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);
    
    System.out.println("Talla= " + la_talla);
     
    System.out.println("Abreviatura= "+ la_talla.dameAbreviatura());
        
    }
}
