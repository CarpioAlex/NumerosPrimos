/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acarpio.primos.probandoHilos;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author alexc
 */
public class pruebaExecutorServiceCallable {
    // Executor proporciona un mecanismo para gestionar tareas concurrentes abstrayendo la creación de hilos.
    
    
    
    public static void main(String[] args) {
        // Crea 3 hilos
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        
        for (int i = 0; i < 5; i++) {
            Future<String> tarea = executorService.submit(new MiTareaCallable("Tarea: " + i));
            
            try {
                System.out.println("Resultado: " + tarea.get());
            } catch (Exception e) {
                System.out.println(":(");
            }
            
        }
        
        executorService.shutdown();
        
    }
    
    
}

class MiTareaCallable implements Callable {

    private String mensaje;

    public MiTareaCallable(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String call() {
        try {
            Thread.sleep(1000);
            return mensaje;
        } catch (Exception e) {
            
        }
        return "Algo ha salido mal.";
    }
}