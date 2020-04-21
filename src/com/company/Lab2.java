package com.company;

public class Lab2 {


    public static void main(String[] args) {
        System.out.println("Rezultat adunare " + adunare(2, 4));
        System.out.println("Rezultat scadere " + scadere(4, 2));
        System.out.println("Rezultat inmultire " + inmultire(2, 2));
        System.out.println("Rezultat impartire " + impartire(2, 2));
        System.out.println("Rezultat medie " + sum(1, 2, 3));
        System.out.println("Rezultat rest impartire " + resta(7, 3));
        System.out.println("Rezultat temp C: " + temperatura(332));
        System.out.println("Rezultat distanta in m " + distanta(332));
        System.out.println("Rezultat viteza in m/s " + vitezam(100000, 3, 2, 4));
        System.out.println("Rezultat viteza in km/h " + vitezakm(100000, 3, 2, 4));
        System.out.println("Rezultat viteza in mi/h " + vitezami(100000, 3, 2, 4));


    }

    public static int adunare(int a, int b) {
        int rezultat = a + b;
        return rezultat;
    }

    public static int scadere(int a, int b) {
        int scadere = a - b;
        return scadere;
    }

    public static int inmultire(int a, int b) {
        int produs = a * b;
        return produs;
    }

    public static int impartire(int a, int b) {
        int cat = a * b;
        return cat;
    }

    public static float sum(int firstnumber, int secondnumber, int thridnumber) {
        float med = (firstnumber + secondnumber + thridnumber) / 3;
        return med;
    }

    public static double resta(int a, int b) {
        double rezultatrest = b % a;
        return rezultatrest;
    }

    public static double temperatura(int a) {
        double t = 5.0 / 9.0 * (a - 32);
        return t;
    }

    public static double distanta(int a) {
        double d = 2.54 * a / 100;
        return d;
    }

    public static double vitezam(int a, int b, int c, int d) {
        double s = b * 60 * 60 + c * 60 + d;
        double mps = a / s;
        return mps;
    }

    public static double vitezakm(int a, int b, int c, int d) {
        double s = b * 60 * 60 + c * 60 + d;
        double kmph = a / s / 1000 * 3600;
        return kmph;
    }

    public static double vitezami(int a, int b, int c, int d) {
        double s = b * 60 * 60 + c * 60 + d;
        double mph = a / s / 1600 * 3600;
        return mph;

    }
}





