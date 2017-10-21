package com.company;

import java.util.Scanner;

//Collatz
//Se citeste un număr n. Afisati fiecare pas al conjecturii Collatz:
//daca n e par se injumatateste. Daca e impar si diferit de 1 devine 3n+1
//Daca e 1 se opreste algoritmul


public class Main {

/*    public static String collatz(int n) {
        String sir = " ";
        String sp = " ";
        while (n!=1) {//daca e 1 se opreste algoritmul
            if (n%2==0){
                n=n/2; //daca nr par se injumatateste
                sir = sir + n + sp; //afiseaza numarul
            }
            else {              //daca nr impac devine 3n+1
                n=3*n+1;
                sir = sir + n + sp; //afiseaza numarul
            }
        }
        return sir;

    }*/



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("1. Introduceti numarul");
            System.out.println("2. Parcurgeti conjectura Collatz");
            System.out.println("x. Exit");

            String optiune = in.next();
            int numar = 0;

            if (optiune.equals("1")) {
                System.out.println("Introduceti numarul:");
                numar = in.nextInt();
            } else if (optiune.equals("2")) {
                numar = 5;
                while (numar != 1) {//daca e 1 se opreste algoritmul
                    if (numar % 2 == 0) {
                        numar = numar / 2; //daca nr par se injumatateste
                        System.out.print(" " + numar); //afiseaza numarul
                    } else {              //daca nr impac devine 3n+1
                        numar = 3 * numar + 1;
                        System.out.print(" " + numar); //afiseaza numarul
                    }
                }
            }
            else if (optiune.equals("x")) {
                break;
            } else {
                System.out.println("Optiune invalida, reincercati!");
            }
        }
    }
}




