import java.util.Scanner;

public class Matriz2 {

    private double determinante;    //determinante
    private double det_1;   //determinante parcial a11 em evidencia
    private double det_2;   //determinante parcial a12 em evidencia
    private double det_3;   //determinante parcial a13 em evidencia

    //Método contrutor da classe.
    public Matriz2() {
        Scanner sc = new Scanner(System.in);
        double[][] matriz = new double[3][3];
        System.out.println("======= INFORME OS VALORES DA MATRIZ 3X3 =======\n");

        //for aninhado para preenchimento da matriz.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Informe o valor da linha %d coluna %d : \n",i+ 1 ,j+1);
                matriz[i][j] = sc.nextDouble();

            }
        }
        //calcula os determinantes parciais.
        this.setDet_1(1 * (matriz[1][1]*matriz[2][2] - matriz[1][2]*matriz[2][1]) * matriz[0][0]);
        this.setDet_2(-1 * (matriz[1][0]*matriz[2][2] - matriz[1][2]*matriz[2][0]) * matriz[0][1]);
        this.setDet_3(1 * (matriz[1][0]*matriz[2][1] - matriz[1][1]*matriz[2][0]) * matriz[0][2]);
        sc.close();
    }

    //Método que calcula o determinante da matriz.
    public void calculoDeterminante() {
        this.setDeterminante(getDet_1() + getDet_2() + getDet_3());
        System.out.println("O determinante da matriz eh: " + getDeterminante());
    }

    public double getDeterminante() {
        return determinante;
    }

    public void setDeterminante(double determinante) {
        this.determinante = determinante;
    }

    public double getDet_1() {
        return det_1;
    }

    public void setDet_1(double det_1) {
        this.det_1 = det_1;
    }

    public double getDet_2() {
        return det_2;
    }

    public void setDet_2(double det_2) {
        this.det_2 = det_2;
    }

    public double getDet_3() {
        return det_3;
    }

    public void setDet_3(double det_3) {
        this.det_3 = det_3;
    }

}
