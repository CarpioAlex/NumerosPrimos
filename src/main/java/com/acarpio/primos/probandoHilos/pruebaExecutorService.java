/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acarpio.primos.probandoHilos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author alexc
 */
public class pruebaExecutorService {
    // Executor proporciona un mecanismo para gestionar tareas concurrentes abstrayendo la creación de hilos.
    
    
    
    public static void main(String[] args) {
        // Crea 3 hilos
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        
        for (int i = 0; i < 5; i++) {
            Runnable tarea = new MiTarea("Tarea: " + i);
            executorService.execute(tarea);
        }
        
        executorService.shutdown();
        
    }
    
    
}

class MiTarea implements Runnable {

    private String mensaje;

    public MiTarea(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override

    public void run() {
        // Identificar que hilo hace que tarea 
        System.out.println(Thread.currentThread().getName() + ": " + mensaje);
    }

}