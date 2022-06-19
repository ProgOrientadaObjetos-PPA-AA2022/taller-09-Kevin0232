/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author USUARIO 2020
 */
public class Persona {
    protected String nombre;
    protected String apellido;
    protected String username;
    
    public Persona(String n, String a, String u){
        nombre =n;
        apellido = a;
        username = u;
    }
    public void establecerNombre(String c){
        nombre = c ;
    }
    public void establecerApellido(String c){
        apellido = c ;
    }
    public void establecerUsername(String c){
        username = c;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerApellido(){
        return apellido;
    }
    public String obtenerUsername(){
        return username;
    }
    @Override
    public String toString(){
        String cadena = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Username: %s\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerUsername());
        return cadena;
    }
}
