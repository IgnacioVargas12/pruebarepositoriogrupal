/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebarepositorio;

/**
 *
 * @author nacho
 */
public class Auto extends Vehiculo {
    int cantPuertas;
    
    Auto(String marca, int anio, int cantPuertas){
        super (marca,anio);
        this.cantPuertas = cantPuertas;
    }
    
        public void tocarBocina() {
            System.out.println("Beep beep!");
        }
        
        @Override
        void mostrarInfo(){
            if (cantPuertas == 2){
                System.out.println("Soy un auto de la marca " + marca + " del anio " + anio + ", y lo mejor de todo, soy una coupe");
            }
            else{
                System.out.println("Soy un auto de la marca " + marca + " del anio " + anio + " que tiene " + cantPuertas + " puertas");
            }
        }
    
}

