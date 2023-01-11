package com.Ejer_4_OpenBootCamp;

import java.util.Scanner;

public class numeroPosNeg {
    public static void main(String[] args) {
        System.out.println("Por favor ingrese un numero: ");

        Scanner entrada_teclado = new Scanner(System.in); //Creamos un OBJETO con la clase SCANNER

        int numeroIf = entrada_teclado.nextInt(); //Declaro la variable

        if (numeroIf<0){
            System.out.println("La variable numeroIf es negativa y tiene valor: " + numeroIf );
        }else {
            System.out.println("La variable numeroIf es positiva y tiene valor: " + numeroIf );
        }
    }
}