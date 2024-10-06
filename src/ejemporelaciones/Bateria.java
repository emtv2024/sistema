/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemporelaciones;

/**
 *
 * @author UCLAB800
 */
public class Bateria {
    private String capacidad;
    private String marca;

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Bateria(String capacidad, String marca) {
        this.capacidad = capacidad;
        this.marca = marca;
    }
    
    
    
    public void verDatos(){
        System.out.println("Los Datos de la bateria son:");
        System.out.println("CAPACIDAD: "+ this.capacidad);
        System.out.println("MARCA: " + this.marca);
        
    }
}
