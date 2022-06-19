/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.*;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo{
    private String tipoAuto;
    private String marcaAuto;
    private Persona garante1;
    private double valorAuto;
    private double valorMensual;
    
    public PrestamoAutomovil(Persona b, int tp, String cp, String tA,
        String mA,double vA, Persona g){
        super(b, tp, cp.toLowerCase());
        tipoAuto = tA;
        marcaAuto = mA;
        valorAuto = vA;
        garante1 = g;
    }
    
    public void establecerTipoAuto(String c){
        tipoAuto = c;
    }
    public void establecerMarcaAuto(String c){
        marcaAuto = c;
    }
    public void establecerGarante1(Persona c){
        garante1 = c;
    }
    public void establecerValorAuto(double c){
        valorAuto = c;
    }
    public void calcularValorMensualPrestamo(){
        valorMensual = valorAuto / 12;
    }
    
    public String obtenerTipoAuto(){
        return tipoAuto; 
    }
    public String obtenerMarcaAuto(){
        return marcaAuto; 
    }
    public Persona obtenerGarante1(){
        return garante1; 
    }
    public double obtenerValorAuto(){
        return valorAuto; 
    }
    public double obtenerValorMensualPrestamo(){
        return valorMensual; 
    }
    
    public String toString(){
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s\n"
                + "Tipo de Auto: %s\n"
                + "Marca del Auto : %s\n"
                + "Garante 1: \n%s\n"
                + "Valor del Auto: %.2f\n"
                + "Valor Mensual de Pago Prestamo Automovil: %.2f\n",
                cadenaFinal,
                obtenerTipoAuto(),
                obtenerMarcaAuto(),
                obtenerGarante1(),
                obtenerValorAuto(),
                obtenerValorMensualPrestamo());
        
        return cadenaFinal;
    }
}
