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
        llenarMatriz(matriz);
        imprimirTablero(matriz);
    }

    public static void imprimirTablero(Pieza[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != null) {
                    if (matriz[i][j] instanceof Alfil) {
                        if (matriz[i][j].getColor().equals("Negro")) {
                            System.out.print("[b]");
                        } else {
                            System.out.print("[B]");
                        }
                    }else if(matriz[i][j] instanceof Torre){
                        if (matriz[i][j].getColor().equals("Negro")) {
                            System.out.print("[r]");
                        } else {
                            System.out.print("[R]");
                        }
                    }else if(matriz[i][j] instanceof Caballo){
                        if (matriz[i][j].getColor().equals("Negro")) {
                            System.out.print("[n]");
                        } else {
                            System.out.print("[N]");
                        }
                    }else if(matriz[i][j] instanceof Rey){
                        if (matriz[i][j].getColor().equals("Negro")) {
                            System.out.print("[k]");
                        } else {
                            System.out.print("[K]");
                        }
                    }else if(matriz[i][j] instanceof Reina){
                        if (matriz[i][j].getColor().equals("Negro")) {
                            System.out.print("[q]");
                        } else {
                            System.out.print("[Q]");
                        }
                    }else if(matriz[i][j] instanceof Peon){
                        if (matriz[i][j].getColor().equals("Negro")) {
                            System.out.print("[p]");
                        } else {
                            System.out.print("[P]");
                        }
                    }
                }else{
                    System.out.print("[ ]");
                }
            }
            System.out.println("");
        }
    }

    public static void llenarMatriz(Pieza[][] matriz) {
        Pieza torreBlanco = new Torre();
        torreBlanco.setColor("Blanco");
        Pieza caballoBlanco = new Caballo();
        caballoBlanco.setColor("Blanco");
        Pieza alfilBlanco = new Alfil();
        alfilBlanco.setColor("Blanco");
        Pieza reinaBlanco = new Reina();
        reinaBlanco.setColor("Blanco");
         Pieza reyBlanco = new Rey();
         reyBlanco.setColor("Blanco");
        Pieza peonBlanco = new Peon();
        peonBlanco.setColor("Blanco");

        Pieza torreNegro = new Torre();
        torreNegro.setColor("Negro");
        Pieza caballoNegro = new Caballo();
        caballoNegro.setColor("Negro");
        Pieza alfilNegro = new Alfil();
        alfilNegro.setColor("Negro");
        Pieza reinaNegro = new Reina();
        reinaNegro.setColor("Negro");
        Pieza reyNegro = new Rey();
        reyNegro.setColor("Negro");
        Pieza peonNegro = new Peon();
        peonNegro.setColor("Negro");

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
