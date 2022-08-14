package co.com.diplomado.ia.estructuras.de.control;

import java.util.Scanner;

public class NestedConditionals {

    Scanner scanner = new Scanner(System.in);

    /**
     * Confeccionar un programa que pida por teclado tres notas de un alumno,
     * calcule el promedio e imprima alguno de estos mensajes:
     * Si el promedio es >=7 mostrar "Promocionado".
     * Si el promedio es >=4 y <7 mostrar "Regular".
     * Si el promedio es <4 mostrar "Reprobado".
     * Punto 6 de la actividad de condicionales Anidadas
     */
    public void averageStudent(){
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
        else if(average >= 4 && average < 7){
            System.out.println("Regular");
        }else{
            System.out.println("Reprobado");
        }
    }


    /**
     * Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.
     * Punto 7 de la actividad de condicionales Anidadas
     */
    public void threeDifferentNumbersDisplayTheLargestOfThem(){

        int num1, num2, num3;
        System.out.println("Ingrese 3 numeros distintos");

        System.out.println("Ingrese primer valor: ");
        num1 = scanner.nextInt();
        System.out.println("Ingrese segundo valor:");
        num2 = scanner.nextInt();;
        System.out.println("Ingrese tercer valor: ");
        num3 = scanner.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El mayor de los tres es: " + num1);
            } else {
                System.out.println("El mayor de los tres es: " + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("El mayor de los tres es: " + num2);
            } else {
                System.out.println("El mayor de los tres es: " + num3);
            }
        }

    }

    /**
     * Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo o negativo.
     * Punto 8 de la actividad de condicionales Anidadas
     */
    public void showIfTheNumberIsPositiveNullOrNegative(){
        System.out.println("Ingrese un numero" );
        int num = scanner.nextInt();

        if(num >= 1){
            System.out.println("Positivo" );
        }else if(num <= -1){
            System.out.println("Negativo" );
        }else{
            System.out.println("Nulo" );
        }
    }

    /**
     * Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y muestre un mensaje
     * indicando si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el número de cifras es mayor.
     * Punto 9 de la actividad de condicionales Anidadas
     * TODO: realizar punto 9
     */
    public void positiveIntegerOfUpToThreeDigits(){

    }

    /**
     * Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información:
     * cantidad total de preguntas que se le realizaron y la cantidad de preguntas que contestó correctamente.
     * Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo según el
     * porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
     * Nivel máximo: Porcentaje>=90%.
     * Nivel medio: Porcentaje>=75% y <90%.
     * Nivel regular: Porcentaje>=50% y <75%.
     * Fuera de nivel: Porcentaje<50%.
     * Punto 10 de la actividad de condicionales Anidadas
     */
    public void takeATrainingTest(){
        System.out.println("Digite la cantidad total de preguntas");
        int question = scanner.nextInt();
        System.out.println("Digite cantidad de preguntas que contesto correctamente");
        int correctQuestions = scanner.nextInt();

        float average = correctQuestions/question;

        if(average >= 90){
            System.out.println("Nivel Maximo");
        } else if (average >= 75 && average < 90) {
            System.out.println("Nivel Medio");
        } else if (average >= 50 && average < 75) {
            System.out.println("Nivel Regular");
        }else if(average < 50){
            System.out.println("Fuera de Nivel");
        }

    }


}
