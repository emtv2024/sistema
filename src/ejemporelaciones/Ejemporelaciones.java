/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemporelaciones;

/**
 *
 * @author UCLAB800
 */
public class Ejemporelaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Chip c1 = new Chip("Movistar", "95875853");
        c1.verDatos();
        SmartPhone s1 = new SmartPhone("Galaxy", 2, "4500","Compatible" );
        s1.agregarChip(c1);
        s1.verDatos();
    }
    
}
