/*Faça um programa que preencha uma matriz A2,4 com números 
inteiros aleatórios entre [0 - 9]. Em seguida, calcule e mostre:

A quantidade de elementos ímpares em cada linha;
A média dos elementos pares da matriz.
 */

import java.security.SecureRandom;
public class ex003 {
   public static void main(String[] args) {
       int matriz[][] = new int[2][4];
       int somapar = 0;
       int contpar = 0;
       int media = 0;
       int comunicacao = 0;
       int linha = 0;

       for (int i = 0; i < 2; i++) {
           for (int j = 0; j < 4; j++) {
               matriz[i][j] = new SecureRandom().nextInt(10);
           }
       }

       for (int i = 0; i < 2; i++) {
           for (int j = 0; j < 4; j++) {
               System.out.print(" " + matriz[i][j]);
           }
           System.out.println();
       }

       for (int i = 0; i < matriz.length; i++) {
           int contimpar = 0;
           for (int j = 0; j < matriz[i].length; j++) {
               if (matriz[i][j] % 2 != 0) {
                   contimpar += 1;
                   comunicacao = contimpar;
                   linha = i + 1;
               }
           }
           System.out.print("\n");
           System.out.printf("Linha %d: %d elementos ímpares\n", linha, comunicacao);
       }

       for (int i = 0; i < 2; i++) {
           for (int j = 0; j < 4; j++) {
               if (matriz[i][j] % 2 == 0) {
                   contpar += 1;
                   somapar += matriz[i][j];
                   media = somapar / contpar;


               }
           }
       }
       System.out.println("\nA média dos valores pares na matriz é: " + media);
    }
}
