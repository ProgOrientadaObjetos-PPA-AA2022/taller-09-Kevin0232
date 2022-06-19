/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;
import paquete2.*;
import paquete3.*;
import paquete4.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);
        int opc = 0, tiempoP = 0, cont1 = 0, cont2 = 0;
        Persona per;
        String ciudadP, nombre, ape, user;

        String cadena1 = "****Prestamos de Automoviles: \n";
        String cadena2 = "****Prestamos Educativos: \n";

        String continuar;
        do {
            opc = menu();
            if (opc == 1 || opc == 2) {

                System.out.print("Ingrese el nombre de la persona: ");
                nombre = leer.nextLine();
                System.out.print("\nIngrese el apellido de la persona: ");
                ape = leer.nextLine();
                System.out.print("\nIngrese el username de la persona: ");
                user = leer.nextLine();

                per = new Persona(nombre, ape, user);

                System.out.print("\nIngrese el tiempo del prestamo: ");
                tiempoP = leer.nextInt();
                leer.nextLine();
                System.out.print("\nIngrese la ciudad del prestamo: ");
                ciudadP = leer.nextLine();

                if (opc == 1) {
                    System.out.print("\nIngrese el nombre del garante: ");
                    nombre = leer.nextLine();
                    System.out.print("\nIngrese el apellido del garante: ");
                    ape = leer.nextLine();
                    System.out.print("\nIngrese el username del garante: ");
                    user = leer.nextLine();

                    Persona garante = new Persona(nombre, ape, user);
                    cont1++;
                    System.out.print("\nIngrese el tipo de Automovil: ");
                    String tipoA = leer.nextLine();
                    System.out.print("\nIngrese la marca del Automovil: ");
                    String marca = leer.nextLine();
                    System.out.print("\nIngrese el valor del Automovil: ");
                    double valor = leer.nextDouble();
                    System.out.println("");
                    PrestamoAutomovil pA = new PrestamoAutomovil(per, tiempoP, ciudadP,
                            tipoA, marca, valor, garante);

                    // Calcular: 
                    pA.calcularValorMensualPrestamo();

                    cadena1 = String.format("%s%d)\n%s\n", cadena1, cont1, pA);

                } else {
                    cont2++;
                    System.out.print("\nIngrese el Nombre de la Institución Educativa: ");
                    String nombreI = leer.nextLine();
                    System.out.print("\nIngrese las siglas de la Institución Educativa: ");
                    String siglaI = leer.nextLine();

                    InstitucionEducativa iE = new InstitucionEducativa(nombreI, siglaI);

                    System.out.println("\nIngrese el nivel de estudio: ");
                    String nivel = leer.nextLine();
                    System.out.println("\nIngrese el valor de la carrera: ");
                    double valorC = leer.nextDouble();
                    System.out.println("");

                    PrestamoEducativo pE = new PrestamoEducativo(per, tiempoP, ciudadP,
                            iE, nivel, valorC);

                    pE.calcularValorMensual();
                    
                    cadena2 = String.format("%s%d)\n%s\n", cadena2, cont2, pE);
                }
            } else {
                System.out.println("Error en la opción");
            }
            leer.nextLine();
            System.out.println("¿Desea ingresar mas Prestamos?. \n--Digite la letra"
                    + " S para continuar o digite la letra N para salir--");

            continuar = leer.nextLine();

        } while (continuar.toUpperCase().equals("S"));

        System.out.println("-----------Lista de prestamos------------");
        if (cont1 == 0 && cont2 == 0) {
            System.out.println("No se ha ingresado ningun prestamo");
        } else {
            if (cont1 > 0) {
                System.out.println(cadena1);
            }
            if (cont2 > 0) {
                System.out.println(cadena2);
            }
        }
    }

    public static int menu() {
        Scanner leer = new Scanner(System.in);
        int o = 0;
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese el tipo de Prestamo a realizar: ");
        System.out.println("1). Prestamo de Automovil.");
        System.out.println("2). Prestamo Educativo.");
        System.out.println("-------------------------------------------");
        o = leer.nextInt();
        return o;
    }
}
