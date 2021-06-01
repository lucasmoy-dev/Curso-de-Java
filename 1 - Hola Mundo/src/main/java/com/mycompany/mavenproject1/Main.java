/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author lucas
 */
public class Main {
    
    public static void main(String[] args) {
        
        String nombre = "Lucas";
        Integer followersInstagram = 2183;
        Integer followersYoutube = 5650;
        String frase = "Hola, mi nombre es " + nombre + ". Tengo " + (followersInstagram + followersYoutube) + " followers.";
        System.out.println(frase);
        
    }
    
}
