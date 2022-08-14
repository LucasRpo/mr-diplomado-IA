package co.com.diplomado.ia.operadores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateGeometry {

    public static Scanner scanner = new Scanner(System.in);

    /**
     * El metodo permite calcular el área de un triángulo, de un cuadrado y de un círculo.
     * Punto numero 3 de la practica de Operadores
     */
    public static void calculateTheAreaOfATriangleASquareAndACircle(){
        int opcion = -1;
        double base, altura, radio;

        while(opcion != 0){
            opcion = menu();
            switch (opcion) {
                case 1 -> {
                    // area de un cuadrado
                    base = requestValue("Indica la base o altura: ");
                    System.out.println("\nEl area del cuadrado es " + (base * base));
                }
                case 2 -> {
                    // area de un rectangulo
                    base = requestValue("Indica la base: ");
                    altura = requestValue("Indica la altura: ");
                    System.out.println("\nEl area del rectangulo es " + (base * altura));
                }
                case 3 -> {
                    // area de un circulo
                    radio = requestValue("Indica el radio: ");
                    System.out.printf("\nEl area de la circunferencia es %1.2f\n", Math.PI * (Math.pow(radio, 2)));
                }
                case 4 -> {
                    // area de un triangulo
                    base = requestValue("Indica la base: ");
                    altura = requestValue("Indica la altura: ");
                    System.out.printf("\nEl area del triangulo es %1.2f\n", (base * altura) / 2);
                }
            }
        }
        scanner.close();
    }

    private static int menu() {
        int opcion=-1;
        System.out.println("\n\n---------------------------");
        System.out.println("1-Area de un cuadrado");
        System.out.println("2-Area de un rectangulo");
        System.out.println("3-Area de un circulo");
        System.out.println("4-Area de un trinagulo");
        System.out.println("0-Salir");
        System.out.println("Selecciona una opción");

        while(opcion<0) {
            try {

                opcion = scanner.nextInt();
            }catch(InputMismatchException e) {
                // Controlamos que siempre introduzca un valor numerico
                System.out.println("El valor tiene que ser numerico...");
                scanner.nextLine();
                opcion=-1;
            }
        }

        return opcion;
    }

    private static double requestValue(String texto) {

        while(true){
            try {
                System.out.print(texto);
                return scanner.nextDouble();
            }catch(InputMismatchException e) {
                // Controlamos que siempre introduzca un valor numerico
                System.out.println("El valor tiene que ser numerico...");
                scanner.nextLine();
            }
        }
    }

    /**
     * El metodo muestra el área y el perímetro de un circulo
     * Punto numero 8 de la practica de Operadores
     */
    public void areaAndPerimeterOfACircle(){

        double radio, perimetro;

        // area de un circulo
        radio = requestValue("Indica el radio: ");

        perimetro = 2*Math.PI*radio;

        System.out.printf("\nEl area de la circunferencia es %1.2f\n", Math.PI*(Math.pow(radio,2)));
        System.out.printf("\nEl perimetro de la circunferencia es\n" + perimetro);

    }
}
