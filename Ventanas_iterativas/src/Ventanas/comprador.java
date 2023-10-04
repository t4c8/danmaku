/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas;

/**
 *
 * @author USER
 */
public class comprador {
    private String manga;
    private int cantidad;
    private float precio;

    public comprador(String manga, int cant,float prec){
        this.manga=manga;
        this.cantidad=cant;
        this.precio=prec;
    }
    
    public String getmanga(){
     return manga;
    }
    
    public int getcant(){
     return cantidad;
    }
    
    public float getprec(){
     return precio;
    }
    
    public void setmanga(String manga){
        this.manga=manga;
    }
    
    public void setmanga(int cantidad){
        this.cantidad=cantidad;
    }
    
    public void setmanga(float precio){
        this.precio=precio;
    }
}

