/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases02;

public class Hospital {

    private String nombre;
    private int numeroCamas;
    private double presupuesto;

    public void establecerNombre(String n) { // establecer (Procedimientos)
        nombre = n;
    }

    public void establecerNumeroCamas(int n) { // establecer (Procedimientos)
        numeroCamas = n;
    }

    public void establecerPresupuesto(double n) { // establecer (Procedimientos)
        presupuesto = n;
    }

    public String obtenerNombre() { //obtener (Funciones)
        return nombre;
    }

    public int obtenerNumeroCamas() { // obtener (Funciones)
        return numeroCamas;
    }

    public double obtenerPresupuesto() { // obtener (Funciones)
        return presupuesto;
    }

}
