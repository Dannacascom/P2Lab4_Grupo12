package p2lab4_gabrielzelaya.dannacasco;

import pieza.Rey;
import pieza.Alfil;
import pieza.Caballo;
import pieza.Peon;
import pieza.Pieza;
import pieza.Reina;
import pieza.Torre;

public class P2Lab4_GabrielZelayaDannaCasco {

    public static Pieza[][] matriz = new Pieza[8][8];

    public static void main(String[] args) {

    }

    public static void imprimirTablero(Pieza[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != null) {
                    if (matriz[i][j] instanceof Alfil) {
                        if (matriz[i][j].getColor().equals("Negro")) {
                            System.out.println("[b]");
                        } else {
                            System.out.println("[B]");
                        }
                    }
                }else{
                    System.out.print("[ ]");
                }
            }
        }
    }

    public static void llenarMatriz() {
        Pieza torreBlanco = new Torre();
        Pieza caballoBlanco = new Caballo();
        Pieza alfilBlanco = new Alfil();
        Pieza reinaBlanco = new Reina();
         Pieza reyBlanco = new Rey();
        Pieza peonBlanco = new Peon();

        Pieza torreNegro = new Torre();
        Pieza caballoNegro = new Caballo();
        Pieza alfilNegro = new Alfil();
        Pieza reinaNegro = new Reina();
        Pieza reyNegro = new Rey();
        Pieza peonNegro = new Peon();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == 1 && j < 8) {
                    matriz[i][j] = peonNegro;
                    peonNegro.setX(i);
                    peonNegro.setY(j);
                } else if (i == 0 && (j == 1 || j == 6)) {
                    matriz[i][j] = caballoNegro;
                    caballoNegro.setX(i);
                    caballoNegro.setY(j);
                } else if (i == 0 && (j == 0 || j == 7)) {
                    matriz[i][j] = torreNegro;
                    torreNegro.setX(i);
                    torreNegro.setY(j);
                } else if (i == 0 && (j == 2 || j == 5)) {
                    matriz[i][j] = alfilNegro;
                    alfilNegro.setX(i);
                    alfilNegro.setY(j);
                } else if (i == 0 && j == 3) {
                    matriz[i][j] = reyNegro;
                    reyNegro.setX(i);
                    reyNegro.setY(j);
                } else if (i == 0 && j == 4) {
                    matriz[i][j] = reinaNegro;
                    reinaNegro.setX(i);
                    reinaNegro.setY(j);
                } else if (i == 6 && j < 8) {
                    
                    matriz[i][j] = peonBlanco;
                    peonBlanco.setX(i);
                    peonBlanco.setY(j);
                } else if (i == 7 && (j == 0 || j == 7)) {
                    matriz[i][j] = torreBlanco;
                    torreBlanco.setX(i);
                    torreBlanco.setY(j);
                } else if (i == 7 && (j == 1 || j == 6)) {
                    matriz[i][j] = caballoBlanco;
                    caballoBlanco.setX(i);
                    caballoBlanco.setY(j);
                } else if (i == 7 && (j == 2 || j == 5)) {
                    matriz[i][j] = alfilBlanco;
                    alfilBlanco.setX(i);
                    alfilBlanco.setY(j);
                } else if (i == 7 && j == 3) {
                    matriz[i][j] = reinaBlanco;
                    reinaBlanco.setX(i);
                    reinaBlanco.setY(j);
                } else if (i == 7 && j == 4) {
                    matriz[i][j] = reyBlanco;
                    reyBlanco.setX(i);
                    reyBlanco.setY(j);
                }
            }
        }
    }
}
