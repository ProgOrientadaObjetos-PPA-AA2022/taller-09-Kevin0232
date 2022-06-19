/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Prestamo {
    protected Persona beneficiario;
    protected int tiempoPrestamo; 
    protected String ciudadPrestamo;
    
    public Prestamo(Persona b,int tp,String cp){
        beneficiario = b;
        tiempoPrestamo = tp;
        ciudadPrestamo = cp;
    }
    public void establecerBeneficiario(Persona c){
        beneficiario = c;
    }
    public void establecerTiempoPrestamo(int c){
        tiempoPrestamo = c;
    }
    public void establecerCiudadPrestamo(String c){
        ciudadPrestamo = c;
    }
    
    public Persona obtenerBeneficiario(){
        return beneficiario;
    }
    public int obtenerTiempoPrestamo(){
        return tiempoPrestamo;
    }
    public String obtenerCiudadPrestamo(){
        return ciudadPrestamo;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Beneficiario: %s\n"
                + "Tiempo de Prestamo: %s\n"
                + "Ciudad del Prestamo: %s\n",
                beneficiario,
                tiempoPrestamo,
                ciudadPrestamo);
        return cadena;
    }
}
