/*Faça um programa que leia do usuário duas matrizes 
quadradas A2,2 e B2,2 com números inteiros. 
Em seguida, calcule a soma das duas matrizes e mostre a matriz resultante  para o usuário, por exemplo:

MATRIZ A
1     2
3     4


MATRIZ B
5     6
7     8


MATRIZ RESULTANTE
6     8
10    12
*/

import java.security.SecureRandom;
public class ex005 {
   public static void main(String[] args) {

       int matrizA[][] = new int[2][2];
       int matrizB[][] = new int[2][2];

       for (int i = 0; i < matrizA.length; i++) {
           for (int j = 0; j < matrizA.length; j++) {
               matrizA[i][j] = new SecureRandom().nextInt(10);
           }
       }
       System.out.print("Matriz A\n");

       for (int i = 0; i < matrizA.length; i++) {
           for (int j = 0; j < matrizA.length; j++) {
               System.out.print(" " + matrizA[i][j]);
           }
           System.out.println();
       }
       System.out.println();

       for (int i = 0; i < matrizB.length; i++) {
           for (int j = 0; j < matrizB.length; j++) {
               matrizB[i][j] = new SecureRandom().nextInt(10);
           }
       }
       System.out.print("Matriz B\n");

       for (int i = 0; i < matrizB.length; i++) {
           for (int j = 0; j < matrizB.length; j++) {
               System.out.print(" " + matrizB[i][j]);
           }
           System.out.println();
       }

       int matrizC[][] = new int[2][2];
       System.out.println();
       System.out.print("Matriz resultante\n");

       for (int i = 0; i < matrizB.length; i++) {
           for (int j = 0; j < matrizB.length; j++) {
               matrizC[i][j] = matrizA[i][j] + matrizB[i][j];


               System.out.print(" " + matrizC[i][j]);
           }
           System.out.println();
       }
   }
}
