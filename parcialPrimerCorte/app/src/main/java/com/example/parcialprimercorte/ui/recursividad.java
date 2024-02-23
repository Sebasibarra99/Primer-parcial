package com.example.parcialprimercorte.ui;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class recursividad {
    public static void main(String[] args) {
        int num = 16;
        long factorial = numeroDividido(num);
        System.out.println("El numero dividio es: " + num + " es: " + factorial);
    }

    public static long numeroDividido(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n / numeroDividido(n - 2);
        }
    }
}