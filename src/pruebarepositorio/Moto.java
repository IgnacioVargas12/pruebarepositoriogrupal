package pruebarepositorio;

public class Moto {
    
    String marca;
    int anio;
    int cilindrada;

    // Constructor
    public Moto(String marca, int anio, int cilindrada) {
        this.marca = marca;
        this.anio = anio;
        this.cilindrada = cilindrada;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + anio);
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }

    // Método para simular bocina
    public void tocarBocina() {
        System.out.println("Pi pi pi!");
    }
}