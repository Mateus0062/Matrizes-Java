/*Faça um programa que preencha uma matriz A3,5 com números 
inteiros aleatórios entre [0 - 9]. Em seguida, calcule e mostre a 
quantidade de elementos entre 3 e 7 */


import java.security.SecureRandom;
public class ex002 {
   public static void main(String[] args) {
       int matriz[][] = new int[3][5];
       int contador = 0;

       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 5; j++) {
               matriz[i][j] = new SecureRandom().nextInt(10);
           }
       }

       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 5; j++) {
               System.out.print(" " + matriz[i][j]);
           }
           System.out.println();
       }

       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 5; j++) {
               if (matriz[i][j] >= 3 && matriz[i][j] <= 7) {
                   contador++;
               }
           }
       }
       System.out.println("Quantidade de números entre 3 - 7 é igual a " + contador);
   }
}
