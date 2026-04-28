/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebarepositorio;

/**
 *
 * @author nacho
 */
abstract class Vehiculo {
    String marca;
    int anio;
    
    Vehiculo(String marca, int anio){
        this.marca = marca;
        this.anio = anio;
    }
    
    abstract void mostrarInfo(); 
            
            
}
