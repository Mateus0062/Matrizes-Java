/*Faça um programa que preencha uma matriz quadrada A6,6 com números 
inteiros aleatórios entre [0 - 9]. Em seguida, imprima a matriz gerada 
na tela, verifique e mostre:

O maior elemento da matriz e sua respectiva posição, ou seja, linha e coluna;
O menor elemento da matriz e sua respectiva posição, ou seja, linha e coluna.
*/

import java.security.SecureRandom;


public class ex004 {
   public static void main(String[] args) {

       int matrizquadrada[][] = new int[6][6];
       int maior = matrizquadrada[0][0];
       int linhamaior = 0;
       int colunamaior = 0;

       for (int i = 0; i < 6; i++) {
           for (int j = 0; j < 6; j++) {
               matrizquadrada[i][j] = new SecureRandom().nextInt(10);
           }
       }

       for (int i = 0; i < 6; i++) {
           for (int j = 0; j < 6; j++) {
               System.out.print(" " + matrizquadrada[i][j]);
           }
           System.out.println();
       }

       for (int i = 0; i < 6; i++) {
           for (int j = 0; j < 6; j++) {
               if (matrizquadrada[i][j] > maior) {
                   maior = matrizquadrada[i][j];
                   linhamaior = i;
                   colunamaior = j;
               }
           }
       }

       int menor = matrizquadrada[0][0];
       int linhamenor = 0;
       int colunamenor = 0;
       for (int i = 0; i < 6; i++) {
           for (int j = 0; j < 6; j++) {
               if (matrizquadrada[i][j] < menor) {
                   menor = matrizquadrada[i][j];
                   linhamenor = i;
                   colunamenor = j;
               }
           }
       }

       System.out.println();
       System.out.println("O maior elemento dessa matriz é: " + maior);
       System.out.println("Este elemento está localizado na linha: " + linhamaior);
       System.out.println("Na coluna: " + colunamaior);
       System.out.println("\n");

       System.out.println("O menor elemento dessa matriz é: " + menor);
       System.out.println("Este elemento está na linha: " + linhamenor);
       System.out.println("Na coluna: " + colunamenor);
   }
}