package co.com.diplomado.ia.estructuras.de.control;

import java.util.Scanner;

public class SimpleAndCompoundConditionals {

    static Scanner scanner = new Scanner(System.in);

    /**
     * Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un mensaje en pantalla indicando
     * que debe abonar impuestos.
     * Punto 1 de la actividad de condicionales simples y compuestas
     */
    public void payTaxes(){
        System.out.println("");
        int salary = scanner.nextInt();

        if(salary > 3000){
            System.out.println("Debe abonar impuestos!!!");
        }else{
            System.out.println("No debe abonar impuestos!!!");
        }
    }

    /**
     * Realizar un programa que solicite ingresar dos números distintos y muestre por pantalla el mayor de ellos.
     * Punto 2 de la actividad de condicionales simples y compuestas
     */
    public void biggerNumber(){
        System.out.println("Ingrese el primer numero");
        int numberOne = scanner.nextInt();

        System.out.println("Ingrese el segundo numero");
        int numberTwo = scanner.nextInt();

        if(numberOne > numberTwo)
            System.out.println("El numero mayor es : " + numberOne);
        else
            System.out.println("El numero mayor es : " + numberTwo);
    }

    /**
     * Realizar un programa que lea por teclado dos números, si el primero es mayor al segundo informar su suma y
     * diferencia, en caso contrario informar el producto y la división del primero respecto al segundo.
     * Punto 3 de la actividad de condicionales simples y compuestas
     */
    public void sumAndDifferenceProductAndDivision(){

        System.out.println("Ingrese el primer numero");
        int numberOne = scanner.nextInt();

        System.out.println("Ingrese el segundo numero");
        int numberTwo = scanner.nextInt();

        if(numberOne > numberTwo){
            int sum = numberOne + numberTwo;
            int diff = numberOne - numberTwo;
            System.out.println("La suma de los numeros es : " + sum);
            System.out.println("La diferencia entre los dos numeros es : " + diff);
        }
        else{
            int division = numberOne/numberTwo;
            int multi = numberOne * numberTwo;

            System.out.println("El producto es : " + multi);
            System.out.println("La división de " + numberOne + "%" + numberTwo + "es : "  + division);
        }
    }

    /**
     * Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado".
     * Punto 4 de la actividad de condicionales simples y compuestas
     */
    public void average(){
        double[] notas = new double[3];
        double sum = 0;
        double average;

        for(int x = 0; x < 2; x++){
            System.out.println("Ingrese la nota :");
            notas[x] = scanner.nextInt();
            sum = sum + notas[x];
        }

        average = sum/3;

        if(average >= 7){
            System.out.println("Promocionado");
        }

    }

    /**
     * Se ingresa por teclado un número positivo de uno o dos dígitos (1..99)
     * mostrar un mensaje indicando si el número tiene uno o dos dígitos.
     * (Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)
     * Punto 5 de la actividad de condicionales simples y compuestas
     */
    public void aPositiveNumberOfOneOrTwoDigits (){

        System.out.println("Ingrese un número positivo de uno o dos digitos, ejemplo (1..99) ");
        int number = scanner.nextInt();
        validateLength(number);

    }

    private void validateLength(int number) {

        String numberString = Integer.toString(number);

        if (numberString.length() == 1) {
            System.out.println("El número tiene un digito");
        } else if (numberString.length() == 2) {
            System.out.println("El número tiene dos digitos");
        } else {
            System.out.println("Ingreso un numero que no se encuentra dentro del rango 1 y 99");
        }
    }

}
