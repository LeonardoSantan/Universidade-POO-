package Atividade1;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int tam = entrada.nextInt();
        int matriz[][] = new int[tam][tam];

        for (int i=0; i<tam; i++){
            for (int j=0; j<tam; j++){
                matriz[i][j] = entrada.nextInt();
            }
        }
        printDiagonalPrincipal(matriz);
    }


    public static void printDiagonalPrincipal(int matriz[][]){
        for(int i = 0;i<matriz.length;i++){
            for(int j = 0; j < matriz.length; j++){
                if(i == j) System.out.print(matriz[i][j] + " ");
            }

        }
    }
}
