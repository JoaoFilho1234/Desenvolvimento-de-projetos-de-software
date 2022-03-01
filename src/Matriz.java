import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matriz = new double[3][3];
        double determinante, det_1, det_2, det_3;

        System.out.println("======= INFORME OS VALORES DA MATRIZ 3X3 =======\n");

        //for aninhado para preenchimento da matriz.

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Informe o valor da linha %d coluna %d : \n",i+ 1 ,j+1);
                matriz[i][j] = sc.nextDouble();

            }
        }

        det_1 = 1 * (matriz[1][1]*matriz[2][2] - matriz[1][2]*matriz[2][1]) * matriz[0][0];
        det_2 = -1 * (matriz[1][0]*matriz[2][2] - matriz[1][2]*matriz[2][0]) * matriz[0][1];
        det_3 = 1 * (matriz[1][0]*matriz[2][1] - matriz[1][1]*matriz[2][0]) * matriz[0][2];

        determinante = det_1 + det_2 + det_3;   //Calculo do determinante.

        System.out.println("O determinante da matriz eh: "+determinante);

        sc.close();
    }
}
