package co.com.diplomado.ia.operadores;

import java.util.Scanner;

public class AveragePlusAddition {

    Scanner scanner = new Scanner(System.in);

    int[] input = new int[5];
    int sum = 0;
    double average;


    /**
     * El metodo permite calcular el promedio de 5 números, y mostrar la suma y el promedio
     * Punto numero 6 de la practica de Operadores
     */
    public void averagePlusAddition(){
        System.out.println("Ingrese cinco numeros");
        System.out.println();

        for(int x = 0; x < input.length; x++){
            System.out.println("Ingrese el número");
            input[x] = scanner.nextInt();
            sum = sum + input[x];
        }

        average = sum/5;

        System.out.println("La suma total de los numeros ingresados es " + sum);
        System.out.println("El promedio " + average);
    }
}
