/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebarepositorio;

/**
 *
 * @author nacho
 */
public class Triciclo extends Vehiculo{
    int cantRuedas;
    
    Triciclo (String marca, int anio,int cantRuedas){
        super (marca, anio);
        this.cantRuedas = cantRuedas;
    }
    
    public void tocarBocina() {
            System.out.println("Muak muak!");
        }
    
    @Override
        void mostrarInfo(){
            System.out.println("Soy un triciclo de la marca " + marca + " y tengo " + cantRuedas + " ruedas");
        }
    
}


