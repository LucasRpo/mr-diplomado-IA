package co.com.diplomado.ia.operadores;

import java.util.Scanner;

public class Persona {

    Scanner scanner = new Scanner(System.in);

    /**
     * Elabore una clase que permita leer el nombre, el sexo, y el peso de una persona imprima los datos leídos
     * Punto numero 2 de la practica de Operadores
     */
    public void enterPerson(){
        System.out.println("Ingrese el Nombre");
        String name = scanner.next();

        System.out.println("Ingrese el Sexo");
        String sex = scanner.next();

        System.out.println("Ingrese el Peso");
        double weight = scanner.nextDouble();

        System.out.println(name + " tiene un peso de " + weight + " Se identifica como " + sex);
    }
}
