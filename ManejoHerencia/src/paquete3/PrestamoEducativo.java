/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.*;
import paquete4.*;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private InstitucionEducativa centroEducativo;
    private String nivelEstudio;
    private double valorCarrera;
    private double valorMensual;
    
    
    public PrestamoEducativo(Persona ga, int tpi, String cpr, InstitucionEducativa ce,
        String ne,double vr){
        super(ga, tpi, cpr.toUpperCase());
        centroEducativo = ce;
        nivelEstudio = ne;
        valorCarrera = vr;
    }
    
    public void establecerInstitucionEducativa(InstitucionEducativa c){
        centroEducativo = c;
    }
    public void establecerNivelEstudio(String c){
        nivelEstudio = c;
    }
    public void establecerValorCarrera(double c){
        valorCarrera = c;
    }
    public void calcularValorMensual(){
        valorMensual = (obtenerValorCarrera()/12)-((10*(valorCarrera / 12))/100);
    }
    
    
    public InstitucionEducativa obtenerInstitucionEducativa(){
        return centroEducativo;
    }
    public String obtenerNivelEstudio(){
        return nivelEstudio;
    }
    public double obtenerValorCarrera(){
        return valorCarrera;
    }
    public double obtenerValorMensual(){
        return valorMensual;
    }
    
    public String toString(){
        String cadena = String.format("%s", super.toString());
        cadena = String.format("%s"
                + "Institucion Educativa: %s\n"
                + "Nivel de Estudio : %s\n"
                + "Valor de la Carrera: %.2f\n"
                + "Valor mensual del Prestamo: %.2f\n",
                cadena,
                obtenerInstitucionEducativa(),
                obtenerNivelEstudio(),
                obtenerValorCarrera(),
                obtenerValorMensual());
        
        return cadena;
    }
}
