/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebarepositorio;

/**
 *
 * @author nacho
 */
public class Pruebarepositorio {

  static void Separador()
    {for (int i = 0; i < 30; i++){
        System.out.print("-");
        }
    System.out.println("");
    }
  
    public static void main(String[] args) {
        System.out.println("Prueba de github");
        Separador();
        
        Auto primerauto = new Auto("Toyota", 2010, 2);
        primerauto.mostrarInfo();
        primerauto.tocarBocina();
        Separador();
        
        Moto primeramoto = new Moto("Honda", 2004,2);
        primeramoto.mostrarInfo();
        primeramoto.tocarBocina();
        Separador();
        
        
    }
    
}
