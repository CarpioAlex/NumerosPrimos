/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acarpio.primosSecuencial;
import java.util.ArrayList;

/**
 *
 * @author alexc
 */
public class SecuencialNormal {
    
    public static boolean esPrimo(int n) {
        if (n<=1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
        
    }
    
    
    public static int obtenerPrimo(int n) {
        
        
        // Comprueba si un número es primo, si lo es, lo añade a una lista.    
        ArrayList<Integer> listaDePrimos = new ArrayList<Integer>(); 
        int tamaño_actual = 0;
        for (int i = 0; tamaño_actual < n; i++) {
            if (esPrimo(i)) {
                listaDePrimos.add(i);
                tamaño_actual++;
            }
            
        }
        
        
        return listaDePrimos.get(listaDePrimos.size()-1);
        
    }
    
    
   
    
    
    
}
