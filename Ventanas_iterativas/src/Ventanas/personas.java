/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas;

/**
 *
 * @author USER
 */
public class personas {
    
    private String nombre;
    private String manga;
    private float edad;
    
     public float venta(){
        return edad * (float)10.45;
    }


    public  personas(String nom, String manga, float edad){
        this.nombre = nom;
        this.manga = manga;
        this.edad = edad;
    }
   
    
    public String getmanga(){
        return manga;
    }
    
    public double getEdad(){
        return edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setcant(String nombre){
        this.nombre= nombre;
    }
    
    public void setmanga(String manga){
        this.manga= manga;
    }
    
    public void setedad(float edad){
        this.edad= edad;
    }
    @Override
    public String toString(){
        return "Nombre del mangaka:  "+ nombre + "\n" +
                "nombre del manga:   "+ manga +
                "\n"+"pagar:  "+ edad  * (float)10.45+"\n";
    }
    
    
}

