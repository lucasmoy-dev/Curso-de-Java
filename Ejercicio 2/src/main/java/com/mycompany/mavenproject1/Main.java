/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author lucas
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        // Con este codigo pedimos un número
        System.out.println("Ingrese el primer número:");
        Integer numero1 = cargarNumero();
        
        System.out.println("Ingrese el segundo número:");
        Integer numero2 = cargarNumero();
        
        System.out.println("Ingrese el tercer número:");
        Integer numero3 = cargarNumero();
        
        Integer sumatoria = numero1 + numero2 + numero3;
        Double numeroPromedio = Double.valueOf(sumatoria) / 3;
        System.out.println("El número promedio es: " + numeroPromedio);
    }
    
    /**
     * 
     * @return 
     */
    private static Integer cargarNumero() {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }
    
}
