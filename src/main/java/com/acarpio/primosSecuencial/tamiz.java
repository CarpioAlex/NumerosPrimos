package com.acarpio.primosSecuencial;
// Java program to find the nth prime number 
import java.util.ArrayList;

public class tamiz {

    // initializing the max value 
    static int MAX_SIZE = 200000000;
    
    // To store all prime numbers
    static ArrayList<Integer> primes = new ArrayList<Integer>();
    
    // Function to generate N prime numbers using Sieve of Eratosthenes
    public static void SieveOfEratosthenes() {
        boolean[] IsPrime = new boolean[MAX_SIZE];
        
        // Initialize all entries of IsPrime[] as true
        for (int i = 0; i < MAX_SIZE; i++) {
            IsPrime[i] = true;
        }

        // Sieve of Eratosthenes
        for (int p = 2; p * p < MAX_SIZE; p++) {
            if (IsPrime[p]) {
                for (int i = p * p; i < MAX_SIZE; i += p) {
                    IsPrime[i] = false;
                }
            }
        }

        // Store all prime numbers in the array list
        for (int p = 2; p < MAX_SIZE; p++) {
            if (IsPrime[p]) {
                primes.add(p);
            }
        }
    }

    // Method to get the nth prime number
    public static int getNthPrime(int n) {
        if (primes.isEmpty()) {
            SieveOfEratosthenes(); // Generate primes if not already done
        }
        return primes.get(n - 1); // Return the nth prime (1-indexed)
    }
}

// This code is contributed by ihritik