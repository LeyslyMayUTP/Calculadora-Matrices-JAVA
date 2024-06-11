import java.util.List;
import java.util.ArrayList;

public class operaciones {
    //Fuente de los siguientes metodos http://www.taringa.net/posts/ciencia-educacion/14534230/Algunos-Ejemplos-De-Matrices-Java.html
    public static int[][] sumarDosMatrices(int[][] a, int[][] b) {

        // En este metodo se supone que las 2 matrices tienen el mismo tamaño
        int matrizResultante[][];
        int i, j, filasA, columnasA;
        filasA = a.length;
        columnasA = a[0].length;

        matrizResultante = new int[filasA][columnasA];

        for (i = 0; i < filasA; i++) {
            for (j = 0; j < columnasA; j++) {
                matrizResultante[i][j] = a[i][j] + b[i][j];
            }
        }

        return matrizResultante;
    }

    public static int[][] restarDosMatrices(int[][] a, int[][] b) {

        // En este metodo se supone que las 2 matrices tienen el mismo tamaño
        int matrizResultante[][];
        int i, j, filasA, columnasA;

        filasA = a.length;
        columnasA = a[0].length;

        matrizResultante = new int[filasA][columnasA];

        for (i = 0; i < filasA; i++) {
            for (j = 0; j < columnasA; j++) {
                matrizResultante[i][j] = a[i][j] - b[i][j];
            }
        }

        return matrizResultante;
    }

    public static int[][] multiplicarDosMatrices(int[][] a, int[][] b) {

        int sum, c [][] = new int [a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                sum=0;
                for(int k=0;k < a[0].length;k++){
                    sum += a[i][k]*b[k][j];
                }
                c[i][j]=sum;
            }
        }

        return c;

    }

    //Fin metodos de Taringa

    public static List<int[][]> desarrolloMultiplicacionMatrices(int[][] a, int[][] b) {
        List<int[][]> pasos = new ArrayList<>();

        // Añadir la matriz original A al inicio de la lista
        pasos.add(a.clone());

        for (int i = 0; i < b[0].length; i++) {
            int[][] pasoIntermedio = new int[a.length][b.length];

            // Realizar el producto de la columna de B con la fila de A
            for (int j = 0; j < a.length; j++) {
                int suma = 0;
                for (int k = 0; k < a[0].length; k++) {
                    suma += a[j][k] * b[k][i];
                }
                pasoIntermedio[j][i] = suma;
            }

            // Añadir el paso intermedio a la lista
            pasos.add(pasoIntermedio.clone());
        }

        return pasos;
    }
}
