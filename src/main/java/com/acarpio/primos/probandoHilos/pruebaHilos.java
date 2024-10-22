/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acarpio.primos.probandoHilos;

/**
 *
 * @author alexc
 */
public class pruebaHilos extends Thread {
    private int id;
    public pruebaHilos(int id) {
        this.id = id;
    }
    
    
    
    @Override
    public void run() {
        System.out.println("Soy el hilo " + id);
    }
    
    
    public static void main(String[] args) {
        // Lanzando hilos
        
        /* Un hilo es una forma de planificar una serie de tareas
         * Secuencialmente, hasta ahora solo hemos usado un hilo para programar
         * Generabamos una serie de tareas, y se iban ejecutando de 1 en 1 en una cola (secuencialmente)
         * Ahora con hilos, podemos planificar estas tareas para que se ejecuten a la vez
        */
        
        // Para lanzar hilos, una parte importante es heredar de la clase Thread
        // Y sobreescribimos el método run
        // Los hilos se lanzan desde objetos que heredan desde la clase Thread
        // start() Lanza un hilo
        
        
        pruebaHilos hilo1 = new pruebaHilos(1);
        pruebaHilos hilo2 = new pruebaHilos(2);
        pruebaHilos hilo3 = new pruebaHilos(3);
        
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        System.out.println("Soy el hilo principal");
        
        
        
    }
    
}
