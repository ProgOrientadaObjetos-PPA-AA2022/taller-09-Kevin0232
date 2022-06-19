/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author USUARIO 2020
 */
public class InstitucionEducativa {
    private String nombre;
    private String siglas;
    
    public InstitucionEducativa(String n, String s){
        nombre = n;
        siglas = s;
    }
    public void establecerNombre(String c){
        nombre = c ;
    }
    public void establecerSiglas(String c){
        siglas = c ;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerSiglas(){
        return siglas;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Nombre de la Institución: %s\n"
                + "Siglas: %s\n",
                obtenerNombre(),
                obtenerSiglas());
        return cadena;
    }
}
