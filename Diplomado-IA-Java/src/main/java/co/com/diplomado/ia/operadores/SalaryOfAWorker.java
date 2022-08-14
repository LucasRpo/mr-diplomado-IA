package co.com.diplomado.ia.operadores;

import java.util.Scanner;

public class SalaryOfAWorker {

    /**
     * El metodo permite calcular el nuevo salario de un obrero si tuvo un incremento del 25 % sobre el salario anterior
     * Punto numero 9 de la practica de Operadores
     */
    public void salaryOfAWorkerIfHeHadAnIncreaseOf25Percent(){
        Scanner scanner = new Scanner(System.in);
        float newSalary;

        System.out.println("Ingrese el salario");
        double salary = scanner.nextDouble();

        newSalary = (float) (salary + (salary * 0.25));

        System.out.println("El nuevo salario con un incremento del 25% es : " + newSalary);

    }
}
