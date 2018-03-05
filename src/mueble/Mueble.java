/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mueble;

/**
 *
 * @author David
 */
public class Mueble {
    
    final private static String ERR="DESCONOCIDO";
    private String tipo,color;
    private float alto,ancho,largo;
    
    public Mueble(String tipo){
        if(setTipoMueble(tipo)){
            this.tipo=tipo;
        }
        else this.tipo=ERR;
    }
    public boolean setTipoMueble(String e){
        boolean vuelta=false;
        switch(e){
            case "MESA":vuelta=true;
            break;
            case "SILLA":vuelta=true;
            break;
            case "ARMARIO":vuelta=true;
            
        }
        return vuelta;
    }
    
    public String getTipoMueble(){
        return this.tipo;
    }
    
     public void Color(String color){
        if(setColor(color)){
            this.color=color;
        }
        else this.color=ERR;
     }
    
    public boolean setColor(String e){
        boolean vuelta=false;
        switch(e){
            case "BLANCO":vuelta=true;
            break;
            case "NEGRO":vuelta=true; 
        }
        return vuelta;
    }
    
    
    public String getColor(){
        return this.color;
    }
}
