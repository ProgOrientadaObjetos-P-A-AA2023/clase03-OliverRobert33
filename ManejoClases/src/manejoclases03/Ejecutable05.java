/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Ejecutable05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
           
        Hospital miHospital = new Hospital();

        // Dar valoresa a los atributos 
        // Los valores ingresar por teclado
        System.out.println("Ingrese el nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese el numero de camas: ");
        int nmro = entrada.nextInt();

        System.out.println("Ingrese el presopuesto: ");
        double presupuesto = entrada.nextDouble();

        miHospital.establecerNombre(nombre);
        miHospital.establecerNumeroCamas(nmro);
        miHospital.establecerPresupuesto(presupuesto);
        
        System.out.printf("Nombre: %s\n"
                + "Numero de Camas: %d\n"
                + "Presupuesto: %.2f\n"
                , miHospital.obtenerNombre(), 
                miHospital.obtenerNumeroCamas(), miHospital.obtenerPresupuesto());


    }
}
