/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.acarpio.primosSecuencial;
// Primo 10001 104743 

import com.google.common.base.Stopwatch;

import primosConcurrentes.RecogerPrimos;
/**
 *
 * @author alexc
 */
public class MainProgram {
    
    // Constantes
    private static final int N = 100000001;
    private static final int HILOS = 3;
    private static final int HILOS_DEFAULT = Runtime.getRuntime().availableProcessors();;
    private static final int RANGOPORHILO = N/4;
    
    // Driver code de los métodos
    public static void main(String[] args) {

        Stopwatch crono = Stopwatch.createStarted();
        int primo1 = SecuencialNormal.obtenerPrimo(N);
        System.out.println("Tiempo de ejecucion secuencial normal: "  + crono.stop());
        Stopwatch crono1 = Stopwatch.createStarted();
        int primo2 = tamiz.getNthPrime(N);
        System.out.println("Tiempo de ejecucion secuencial tamiz de Erastotenes: "  + crono1.stop());
        Stopwatch crono2 = Stopwatch.createStarted();
        
        try {
            int primo3 = RecogerPrimos.esPrimoConcurrente(N, HILOS, RANGOPORHILO);
            System.out.println("Tiempo de ejecucion concurrente: "  + crono2.stop());        
            if (primo1 == primo2 && primo2 == primo3) {
                       System.out.println("El primo es: " + primo1);
        }
        } catch (Exception e){}
        
        
        


    }
    
    
}
