/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases02;

public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        
        // Se asigna valores particulares al objeto
        hospital.establecerNombre("Isidro Ayora");
        hospital.establecerNumeroCamas(100);
        hospital.establecerPresupuesto(56546.453);
        
        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.2f\n", hospital.obtenerNombre(),
                hospital.obtenerNumeroCamas(), hospital.obtenerPresupuesto());
    }
}
