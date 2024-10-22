/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primosConcurrentes;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/**
 *
 * @author alexc
 */




public class TareaPrimos implements Callable {
    private int inicio;
    private int fin;
    
    /**
     * 
     * @param inicio
     * @param fin 
     */
    public TareaPrimos(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
    
    
    // Sobreescritura del método call(), devuelve una lista de enteros.
    @Override
    public ArrayList<Integer> call() throws Exception {
        ArrayList<Integer> listaDePrimosSegmentada = new ArrayList<>();
        
        
        for (int i = inicio; i < fin; i++) {
            if (esPrimo(i)) {
                listaDePrimosSegmentada.add(i);
            }
            
        }
        return listaDePrimosSegmentada;
    
    }
    
        // Método auxiliar para verificar si un número es primo
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

