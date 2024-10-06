/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemporelaciones;

/**
 *
 * @author UCLAB800
 */
public class Chip {
    private String empresa;
    private String numero;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Chip(String empresa, String numero) {
        this.empresa = empresa;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Chip{" + "empresa=" + empresa + ", numero=" + numero + '}';
    }

   
    
    
    
    public void verDatos(){
        System.out.println("el chip tiene los siguientes adtos");
        System.out.println("EMPRESA: " + this.empresa);
        System.out.println("NÚMERO: " + this.numero);
    }
}
