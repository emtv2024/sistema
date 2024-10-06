/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemporelaciones;

import java.util.ArrayList;

/**
 *
 * @author UCLAB800
 */
public class SmartPhone {
    private String modelo;
    private int nrochips=2;
    
    ArrayList<Chip> lista_chips = new ArrayList();
    
    Bateria bateria;
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNrochips() {
        return nrochips;
    }

    public void setNrochips(int nrochips) {
        this.nrochips = nrochips;
    }

    public SmartPhone(String modelo, int nrochips,String capacidad_bateria, String marca_bateria ) {
        this.modelo = modelo;
        this.nrochips = nrochips;
        Bateria b1 = new Bateria(capacidad_bateria,marca_bateria);
        this.bateria = b1;
    }

    
    
    
    
    public void verDatos(){
        System.out.println("Los datos del Smart Phone son: ");
        System.out.println("MODELO: "+ this.modelo);
        System.out.println("NRO CHIPS:" + this.nrochips);
        System.out.println("y tiene los chips: " + this.lista_chips);
        System.out.println("Y su bateria es: ");
        this.bateria.verDatos();
    }
    
    public void agregarChip( Chip varchip){
        if(this.lista_chips.size()< this.nrochips){
            this.lista_chips.add(varchip);
            System.out.println("Chip agregado");
        }            
        else{
            System.out.println("Ya no se puede agregar otro chip");
        }
    }
           
}
