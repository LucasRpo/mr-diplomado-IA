package co.com.diplomado.ia.array;

import java.util.*;

public class Array {

    Scanner scanner = new Scanner(System.in);

    /**
     * Elaborar una  clase  que  permita  leer  una  matriz  de m * m  se  debe  de  llenar aleatoriamente,
     * imprima el mayor por columna, el menor por fila y la matriz ordenada descendentemente en un vector
     * Punto 1 de la practica de Array
     */
    public void pointOneArray(){

        System.out.println("Ingrese el número de columnas que quiere que tenga la matriz ");
        int columnArray = scanner.nextInt();

        System.out.println("Ingrese el número de filas que quiere que tenga la matriz ");
        int rowsArray = scanner.nextInt();

        int[] largestPerColumn = new int[columnArray];
        int[] smallestPerRow = new int[rowsArray];
        int[] a = new int[rowsArray * columnArray];
        int[][] matriz = new int[rowsArray][columnArray];
        int cont = 0;

        //Llenamos la matriz y la imprimimos
        System.out.println("Matriz");
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                matriz[x][y] = (int) (Math.random()*9+1);
                a[cont] = matriz[x][y];// Creamos un vector basado en la matriz
                cont++;
                System.out.print("|" + matriz[x][y]);
            }
            System.out.println("|");
        }

        //Menor por fila y Mayor por columna
        for (int z = 0; z < matriz.length; z++) {
            int minorPivot = matriz[z][0];
            int majorPivot = matriz[0][z];
            for (int w = 0; w < matriz[z].length; w++) {
                if(minorPivot >= matriz[z][w] ){ //El menor por fila
                    smallestPerRow[z] = matriz[z][w];
                    minorPivot = smallestPerRow[z];
                }

                if(majorPivot <= matriz[w][z] ) //Mayor por Columna
                    largestPerColumn[z] = matriz[w][z];
                majorPivot = largestPerColumn[z];
            }
        }

        //Imprimir Resultados
        System.out.println();
        System.out.println("Menor por fila");
        for (int x=0; x < smallestPerRow.length; x++) {
            System.out.println("|" + smallestPerRow[x] + "|");
        }

        System.out.println();
        System.out.println("Mayor por Columna");
        for (int x=0; x < largestPerColumn.length; x++) {
            System.out.println("|" + largestPerColumn[x] + "|");
        }

        System.out.println();
        System.out.println("Arreglo");
        for(int x=0; x < a.length; x++){
            System.out.print("|" + a[x]);
        }
        System.out.println();

        int[] sortedDesc = Arrays.stream(a)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println("Arreglo descendente");
        System.out.println(Arrays.toString(sortedDesc));
    }

    /**
     * Elabore un programa que cree un vector de 15 posiciones con números totalmente diferente
     * Punto 2 de la practica de Array
     */
    public void pointTwoArray(){

        Integer nRandom;
        Integer count = 0;
        List<Integer> number = new ArrayList<>();

        while (count < 15) {
            nRandom = (int) (Math.random() * 49 + 1);
            if (number.indexOf(nRandom) < 0) {
                number.add(nRandom);
                count++;
            }
        }

        System.out.println(number);

    }

    /**
     * Dados  50 números enteros almacenarlos en un vector, obtener el promedio de ellos.
     * Mostrar por pantalla dicho promedio y los números ingresados que sean mayores que el mismo.
     * Punto 3 de la practica de Array
     */
    public void pointThreeArray(){
        System.out.println("Point Three Arrays");

        int suma = 0;
        int[] array = new int[50];

        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*9+1);
            suma = suma + array[i];
        }

        float average = suma / array.length;
        System.out.println("Promedio:" + average);

        for (int i = 0; i < array.length; i++){
            if(array[i] > average){

                System.out.print("|" + array[i]);
            }
        }

    }

    /**
     * Un instituto desea controlar los resultados de los alumnos en las distintas asignaturas de  la  facultad  de  Ingeniería.
     * El  programa  debe  ingresar  las  calificaciones  de  los alumnos y visualizar en pantalla la media de notas
     * por alumno y la media de notas por asignatura. Las asignaturas están codificadas de 1 a 6 y hay 30 alumnos. (Matrices)
     * Punto 4 de la practica de Array
     */
    public void pointFourArray(){
        System.out.println("Point Four Arrays");

        int maximumRow = 6;
        int maximumColumn = 30;
        int suma = 0;
        int[] studentAverage = new int[6];
        int[] subjectAverage = new int[6];

        int[][] matriz = new int[maximumRow][maximumColumn];

        for(int i = 0; i < maximumRow; i++){
            for(int j = 0; j < maximumColumn; j++) {
                System.out.println("Ingrese la nota para la materia " + i + " del alumno " + j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < maximumRow; i++){
            suma = 0;
            for(int j = 0; j < maximumColumn; j++) {
                suma= suma + matriz[i][j];
                subjectAverage [i] = suma / (i+1);
            }
        }

        for(int i = 0; i < maximumRow ; i++){
            suma = 0;
            for(int j = 0; j < maximumColumn; j++) {
                suma = suma + matriz[i][j];
                studentAverage[i] = suma / (i+1);
            }
        }

        System.out.println("La suma es: " + suma);
        for(int i = 0; i < maximumRow; i++) {
            System.out.println("El promedio de calificaciones para la asignatura " + i + " es : " + subjectAverage[i]);
        }

        for(int i = 0; i < maximumRow; i++) {
            System.out.println("El promedio de calificaciones para el alumno " + i + " es : " + studentAverage[i]);
        }

    }

    /**
     * Se desea escribir un programa que permita manejar la información de habitantes de un complejo habitacional.
     * El mismo posee 7 torres; a su vez cada torre posee 20 pisos y cada piso 6 departamentos. Se desea saber:
     * a) Cantidad total de habitantes del complejo
     * b) Cantidad promedio de habitantes por piso de cada torre
     * c) Cantidad promedio de habitantes por torre
     * Punto 5 de la practica de Array
     */
    public void pointFiveArray(){
        System.out.println("Point Arrays");

    }

    /**
     * Diseñar  un  algoritmo  que  lea  una  secuencia  de  10  números  como  máximo  y  los almacene en un vector.
     * El programa debe devolver  el vector inverso.
     * Punto 6 de la practica de Array
     */
    public void pointSixArray(){
        System.out.println("Point Six Arrays");

        int array[] = new int[10];

        for(int i = 0; i < array.length; i++){
            System.out.println("Ingrese un número");
            array[i] = scanner.nextInt();
        }

        for(int i = array.length - 1; i >= 0 ; i--){
            System.out.print("|" + array[i] + "|");
        }
    }

    /**
     * Diseñar un algoritmo que llene una matriz de tamaño 3×4.
     * Calcular el promedio de los 12 valores almacenados en dicha matriz.
     * Determinar cuántos son mayores que la media. Visualizar por pantalla los siguientes datos y en éste orden:
     * promedio,  número de datos mayores que el promedio y lista de valores mayores que el promedio
     * Punto 7 de la practica de Array
     */
    public void pointSevenArray(){
        System.out.println("Point Arrays");

        int[][] matriz = new int[3][4];
        float average;
        int suma = 0;

        //Llenamos la matriz y la imprimimos
        System.out.println("Matriz");
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                matriz[x][y] = (int) (Math.random()*9+1);
                System.out.print("|" + matriz[x][y]);
                suma = suma + matriz[x][y];
            }
            System.out.println("|");
        }

        average = suma / 12;

        System.out.println("Promedio: " + average);
        System.out.println("Números mayores que el promedios: ");
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                if(matriz[x][y] > average ){
                    System.out.print("|" + matriz[x][y] + "|");
                }
            }
        }
    }

}
