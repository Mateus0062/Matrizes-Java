/*Implemente um programa que leia do usuário a quantidade de linhas e 
colunas de uma matriz, em seguida, preencha-a com números inteiros 
aleatórios entre 0 e 9 inclusive e calcule e mostre a matriz transposta. 
Em álgebra linear, a transposição de uma matriz é uma operação que vira 
uma matriz sobre sua diagonal; ou seja, troca os índices de linha e 
coluna da matriz A produzindo outra matriz, muitas vezes 
denotada por AT. Por exemplo:

MATRIZ

1  3  5
2  4  6

MATRIZ TRANSPOSTA

1  2
3  4
5  6
 */

 import java.util.Scanner;
 import java.security.SecureRandom;
 public class ex008 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
 
        int linhas = 0;
        int colunas = 0;

        System.out.println("Digite a quantidade de linhas da matriz: ");
        linhas = tc.nextInt();
 
        System.out.println("Digite a quantidade de colunas da matriz: ");
        colunas = tc.nextInt();
 
        int Matriz[][] = new int[linhas][colunas];
 
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                Matriz[i][j] = new SecureRandom().nextInt(10);
            }
        }
 
        System.out.println("\nMATRIZ\n");
 
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(" " + Matriz[i][j]);
            }
            System.out.println();
        }
 
        System.out.println();
        System.out.println("\nMATRIZ TRANSPOSTA\n");
 
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(" " + Matriz[j][i]);
            }
            System.out.println();
        }
        tc.close();
    }
 }
 