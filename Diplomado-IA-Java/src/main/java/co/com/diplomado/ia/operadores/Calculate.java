package co.com.diplomado.ia.operadores;

import java.util.Scanner;

public class Calculate {

    Scanner scanner = new Scanner(System.in);

    /**
     * Permita leer 5 números y calcule el máximo y el mínimo entre los 5 números,
     * la raíz 5 del 3 número, la potencia del primero con el último número,
     * Punto numero 1 de la practica de Operadores
     */
    public void mathematicalOperations (){

        int[] input = new int[5];
        double raiz;
        double potencia;
        int min = 100000;
        int max = 0;

        System.out.println("Ingrese cinco numeros");
        System.out.println();

        for(int x = 0; x < input.length; x++){

            System.out.println("Ingrese el número");
            input[x] = scanner.nextInt();

            if(input[x] > max){
                max = input[x];
            }
            if(input[x] < min ){
                min = input[x];
            }
        }
        raiz = Math.sqrt(input[3]);
        potencia = Math.pow(input[0], input[4]);

        System.out.println("La máximo de la lista es " + max);
        System.out.println("La mínimo de la lista es " + min);
        System.out.println("La raiz 5 de " + input[3] + " es " + raiz);
        System.out.println(input[0]+"^"+input[4]+" = "+potencia);

    }

    /**
     * Este metodo permite Leer un número y escribir el valor absoluto del mismo
     * Punto numero 5 y 7 de la practica de Operadores
     */
    public void readNumberAndWriteItsAbsoluteValue(){
        int num;

        System.out.print("ingrese el numero:");
        num = scanner.nextInt();

        if (num < 0)
            System.out.println("negativo");
        else if (num > 0) {
            System.out.println("positivo");
        }
        else
            System.out.println("neutro");
    }

    /**
     * Realizar un algoritmo que obtenga e imprima el valor de y a partir de la ecuación. Y= 3*x2 + 7x –1
     * Punto numero 10 de la practica de Operadores
     * TODO: por hacer punto 10
     */
    public void a(){

    }
}
