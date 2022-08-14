package co.com.diplomado.ia.operadores;

public class QuadraticEquation {

    /**
     * El metodo permite resolver cualquier ecuación cuadrática propuesta por un usuario.
     * Punto numero 4 de la practica de Operadores
     */
    public static void secondDegreeEquation(int a, int b, int c) {

        double[] results = new double[2];
        double[] solutions;
        double discriminating = (Math.pow(b, 2) - (4 * a * c));

        if (discriminating >= 0) {

            if(discriminating == 0){ // One solutions

                solutions = new double[1];

                solutions[0] = ((-b) - (4 * a * c)) / (2 * a);

            }else{ // two solutions

                solutions = new double[2];

                solutions[0] = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

                solutions[1] = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

            }

        } else { // without solution
            results = null;
        }

        if (results == null) {
            System.out.println("No tiene solucion");
        } else {
            for (double result : results) {
                System.out.println(result);
            }
        }
    }
}
