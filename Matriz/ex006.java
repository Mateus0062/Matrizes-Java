/*Em matemática, uma matriz quadrada é uma matriz com o mesmo 
número de linhas e colunas. Uma matriz n por n é conhecida como uma 
matriz quadrada de ordem n. Crie um programa que leia do 
usuário um número inteiro representando o tamanho n de uma matriz 
quadrada e preencha seus valores com números aleatórios entre 0 e 9 
inclusive. Imprima na tela a matriz quadrada aleatória gerada e, em 
seguida, calcule e mostre: 

MATRIZ QUADRADA
1  5  4  9
2  3  7  8
6  4  3  5
2  0  3  7

DIAGONAL PRINCIPAL
1  0  0  0
0  3  0  0
0  0  3  0
0  0  0  7

DIAGONAL SECUNDÁRIA
0  0  0  9
0  0  7  0
0  4  0  0
2  0  0  0

MATRIZ TRIANGULAR SUPERIOR
1  5  4  9
0  3  7  8
0  0  3  5
0  0  0  7

MATRIZ TRIANGULAR INFERIOR
1  0  0  0
2  3  0  0
6  4  3  0
2  0  3  7
*/

import java.security.SecureRandom;
import java.util.Scanner;
public class ex006 {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int tamMatriz = 0;

       System.out.println("Digite o tamanho da matriz quadrada: ");
       tamMatriz = teclado.nextInt();
       
       int Matrizquadrada[][] = new int[tamMatriz][tamMatriz];

       for (int i = 0; i < Matrizquadrada.length; i++) {
           for (int j = 0; j < Matrizquadrada.length; j++) {
               Matrizquadrada[i][j] = new SecureRandom().nextInt(10);
           }
       }

       System.out.println("MATRIZ QUADRADA");

       for (int i = 0; i < Matrizquadrada.length; i++) {
           for (int j = 0; j < Matrizquadrada.length; j++) {
               System.out.print(" " + Matrizquadrada[i][j]);
           }
           System.out.println();
       }

       System.out.println("\nDIAGONAL PRINCIPAL");

       for (int i = 0; i < tamMatriz; i++) {
           for (int j = 0; j < tamMatriz; j++) {
               if (i == j) {
                   System.out.print(" " + Matrizquadrada[i][j]);
               } else {
                   System.out.print(" 0");
               }
           }
           System.out.println();
       }

       System.out.println("\nDIAGONAL SECUNDÁRIA");

       for (int i = 0; i < tamMatriz; i++) {
           for (int j = 0; j < tamMatriz; j++) {
               if (i + j == tamMatriz - 1) {
                   System.out.print(" " + Matrizquadrada[i][j]);
               } else {
                   System.out.print(" 0");
               }
           }
           System.out.println();
       }

       System.out.println("\n MATRIZ TRIANGULAR SUPERIOR");

       for (int i = 0; i < tamMatriz; i++) {
           for (int j = 0; j < tamMatriz; j++) {
               if (i <= j) {
                   System.out.print(" " + Matrizquadrada[i][j]);
               } else {
                   System.out.print(" 0");
               }
           }
           System.out.println();
       }

       System.out.println("\nMATRIZ TRIANGULAR INFERIOR");

       for (int i = 0; i < tamMatriz; i++) {
           for (int j = 0; j < tamMatriz; j++) {
               if (i >= j) {
                   System.out.print(" " + Matrizquadrada[i][j]);
               } else {
                   System.out.print(" 0");
               }
           }
           System.out.println();
       }
       teclado.close();
   }
}
