/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Programa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner leer = new Scanner(System.in); //Añadimos un Scanner
            String ruta; //Declaramos la ruta como String
            System.out.println("Introduzca el nombre de un archivo"); //Le preguntamos al usuarioo que nos introduzca un nombre de un archivo
            ruta = leer.nextLine(); //Mediante el Scanner nos va a leer la ruta
            ruta = ruta.replace("\\", "\\\\");
            System.out.println(ruta);
            BufferedReader br = new BufferedReader(new FileReader(ruta)); //Aplicamos un bufferedReader con un FileReader con la ruta dentro
            String linea = "";  //Declaramos linea como String 
            while (linea != null) { //Con el while nos va a recorrer linea por linea todo el archivo  
                linea = br.readLine();
                if (linea != null) {
                    System.out.println(linea);
                }
            }

        } catch (IOException ex) {
            System.out.println("No se ha encontrado el archivo." + ex); //Nos va a lanzar la excepcion en el caso de que no se encuentre el archivo
        }

    }
}
