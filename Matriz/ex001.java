/*Implemente um programa que leia do usuário a quantidade de linhas e 
colunas de uma matriz. Em seguida, preencha a matriz com números 
aleatórios entre 0 e 9 inclusive e imprima a matriz na tela no formato 
tabular, semelhante ao exemplo abaixo:

Linhas: 3
Colunas: 5

1  5  4  9  2
2  3  7  8  0
6  4  3  5  3

 */


import java.util.Scanner;
import java.security.SecureRandom;
public class ex001 {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

       int linha = 0;
       int coluna = 0;

       System.out.println("Digite o número de linhas da matriz: ");
       linha = teclado.nextInt();

       System.out.println("Digite o número de colunas da matriz: ");
       coluna = teclado.nextInt();

       int matriz[][] = new int[linha][coluna];

       for (int l = 0; l < linha; l++) {
           for (int c = 0; c < coluna; c++) {
               matriz[l][c] = new SecureRandom().nextInt(10);
           }
       }

       System.out.println();
       System.out.println("Linhas: " + linha);
       System.out.println("Colunas: " + coluna);
       System.out.println();

       for (int l = 0; l < linha; l++) {
           for (int c = 0; c < coluna; c++) {
               System.out.print(" " + matriz[l][c]);
           }
           System.out.println();
       }
       teclado.close();
   }
}
