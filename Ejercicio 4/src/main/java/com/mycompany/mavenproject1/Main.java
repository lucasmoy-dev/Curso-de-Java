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
       String resultado = "";
       
       int contador = 0;
       int numero = 1;
       while(contador < 100) {
           if (esPrimo(numero)) {
               resultado += numero + ", ";
               contador++;
           }
           numero++;
       }
       System.out.println("Los primeros 100 números primos son: " + resultado);
    }
    
    private static Boolean esPrimo(Integer numero) {
        Boolean esUnNumeroPrimo = true;
        
        for (int i = 2; i < numero; i++) {
            
            if (numero % i == 0) {
                esUnNumeroPrimo = false;
            }
        }
       return esUnNumeroPrimo;
    }
   
    
}
