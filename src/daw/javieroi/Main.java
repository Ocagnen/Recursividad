/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.javieroi;

import java.util.ArrayList;

/**
 *
 * @author Javier
 */
public class Main {

    public static void main(String[] args) {

        Main.multiplicar(2, 10);

        System.out.println("--------------------------------");

        int[] array = {1, 2, 3, 3, 2, 1};
        boolean prueba = Main.simetrico(array, 0);
        System.out.println(prueba);

        System.out.println("---------------------------------------");
        int[] array2 = {1, 3, 2, 6, 9, 7};
        Main.burbuja(array2, 0, 0);

        for (int i : array2) {
            System.out.println(i);
        }

        System.out.println("---------------------------------");
        Main.binarioIt(3);
        System.out.println("-------------------");
        Main.binarioR(10);

    }

    public static int multiplicar(int numero, int veces) {

        if (veces == 0) {
            return numero * veces;
        }

        System.out.println(numero * veces);

        return multiplicar(numero, veces - 1);

    }

    public static boolean simetrico(int[] a, int posicion) {

        if ((a[(a.length) - 1 - posicion] == a[posicion]) && a.length / 2 >= posicion) {

            return simetrico(a, posicion + 1);
        }

        if (a.length / 2 <= posicion) {
            return true;
        }

        return false;

    }

    public static void burbuja(int[] a, int posicion, int numeroevaluar) {

        int tmp;

        if (a[numeroevaluar] > a[posicion]) {
            tmp = a[numeroevaluar];
            a[numeroevaluar] = a[posicion];
            a[posicion] = tmp;
        } else if (posicion < a.length - 1) {
            burbuja(a, posicion + 1, numeroevaluar);
        }

        if (numeroevaluar < a.length - 1) {
            burbuja(a, numeroevaluar + 1, numeroevaluar + 1);
        }

    }

    public static void binarioIt(int numero) {

        ArrayList<Integer> l = new ArrayList<>();
        Integer numBin = numero % 2;

        do {
            l.add(numBin);
            numero = numero / 2;
            numBin = numero % 2;

        } while (numero >= 2);
        l.add(numero);

        for (int i = l.size() - 1; i >= 0; i--) {
            System.out.print(l.get(i));
        }
        System.out.println("");
    }

    public static void binarioR(int numero) {

        if (numero >= 1) {
            int numBin = numero % 2;
            binarioR(numero / 2);
            System.out.print(numBin);

        }

    }

    /*
    Método iterativo para pasar de decimal a binario
    
    Luego hacer mismo método recursivo
     */
}
