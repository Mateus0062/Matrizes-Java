/*Faça um programa que crie e mostre para o usuário uma matriz identidade. 
Uma matriz identidade In de tamanho n, é uma matriz n x n onde todos os elementos da diagonal principal 
são iguais a 1 e todos os outros elementos iguais a zero. */

import java.util.Scanner;
public class ex007 {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
      
       int tamMatriz = 0;

       System.out.println("DIGITE O TAMANHO DA MATRIZ QUADRADA: ");
       tamMatriz = teclado.nextInt();

       int matrizIdentidade[][] = new int[tamMatriz][tamMatriz];

       for (int i = 0; i < tamMatriz; i++) {
           for (int j = 0; j < tamMatriz; j++) {
               if (i == j) {
                   matrizIdentidade[i][j] = 1;
                   System.out.print(" " + matrizIdentidade[i][j]);
               } else {
                   System.out.print(" 0");
               }
           }
           System.out.println();
       }
       teclado.close();
   }
}
