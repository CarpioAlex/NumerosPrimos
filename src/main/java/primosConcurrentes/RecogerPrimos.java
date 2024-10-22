/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primosConcurrentes;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author alexc
 */
public class RecogerPrimos {

    public static int esPrimoConcurrente(int n, int hilos, int rangoPorHilo) throws Exception {
        // Crea una pool de hilos por parámetro
        ExecutorService executorService = Executors.newFixedThreadPool(hilos);
        
        // Estructura de datos donde se guardarán los resultados de cada tarea
        ArrayList<Future<ArrayList<Integer>>> resultados = new ArrayList<>();
        
        
        
        
        // Bucle que lanza los hilos
        int inicio = 2; 
        while (true) {
            for (int i = 0; i < hilos; i++) {
                int fin = inicio + rangoPorHilo;
                
                // Instanciar cada tarea con su rango
                TareaPrimos tarea = new TareaPrimos(inicio, fin);
                
                // Enviar la tarea y recoger el resultado
                Future<ArrayList<Integer>> resultado = executorService.submit(tarea);
                resultados.add(resultado);
                
                // Actualizar inicio para el siguiente segmento
                inicio = fin;
            }
            
            // Aplanar la lista de primos
            ArrayList<Integer> listaAplanada = new ArrayList<>();
            for (Future<ArrayList<Integer>> futuro : resultados) {
                listaAplanada.addAll(futuro.get());
            }

            // Comprobar si hemos encontrado suficientes primos
            if (listaAplanada.size() >= n) {
                // Apagar el executor
                executorService.shutdownNow();
                return listaAplanada.get(n - 1); 
            }
        }
    }
    
  
}
