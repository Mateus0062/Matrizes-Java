/*Implemente um programa que preencha uma matriz A12,4 com valores 
aleatórios de vendas semanais de uma loja ao longo do ano. 
Cada linha representa um mês do ano e cada coluna representa uma 
semana do mês. O programa deverá calcular e mostrar:

O total vendido em cada mês do ano, mostrando o nome do mês por extenso;
O total vendido em cada semana durante todo o ano;
O total vendido pela loja no ano.
*/

import java.security.SecureRandom;
public class ex009 {
   public static void main(String[] args) {

       int matriz[][] = new int[12][4];
       String meses[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

       for (int i = 0; i < 12; i++) {
           for (int j = 0; j < 4; j++) {
               matriz[i][j] = new SecureRandom().nextInt(10);
           }
       }

       for (int i = 0; i < 12; i++) {
           for (int j = 0; j < 4; j++) {
               System.out.print(" " + matriz[i][j]);
           }
           System.out.println();
       }
       System.out.println();


       System.out.print("TOTAL DE VENDAS POR MÊS\n");
       int totalmes[] = new int[12];
       for (int i = 0; i < 12; i++) {
           for (int j = 0; j < 4; j++) {
               totalmes[i] += matriz[i][j];
           }
           System.out.println(meses[i] + ": " + totalmes[i]);
       }
       System.out.println();
      
       int totalsemana[] = new int[4];
       for (int j = 0; j < 4; j++) {
           for (int i = 0; i < 12; i++) {
               totalsemana[j] += matriz[i][j];
           }
           System.out.println("Semana " + (j+1) + ": " + totalsemana[j]);
       }
       System.out.println();


       int totalano = 0;
       for (int i = 0; i < 12; i++) {
           for (int j = 0; j < 4; j++) {
               totalano += matriz[i][j];
           }
       }
       System.out.println("Total de vendas no ano: " + totalano);
   }
}
