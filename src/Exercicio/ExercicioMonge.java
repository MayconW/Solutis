package Exercicio;

public class ExercicioMonge {
    public static void main(String[] args) {

        int numeroQuadros = 64;
        int graosNoQuadro = 1;


        long totalGraosLong = 0;
        int totalGraosInt = 0;


        for (int i = 1; i <= numeroQuadros; i++) {


            totalGraosLong += graosNoQuadro;
            totalGraosInt += graosNoQuadro;

            graosNoQuadro *= 2;
            if (Long.MAX_VALUE > totalGraosLong) {
                System.out.println("Overflow ocorre na casa: " +i);
            } else {
                System.out.println("Overflow não ocorre com 'long'.");
            }

        }

        System.out.println("Total de graos int: " + totalGraosInt);
        System.out.println("Total de graos Long: " + totalGraosLong);
    }
}
