/*Um Passeio Aleatório (Random Walk) é uma técnica que consiste em fazer movimentos aleatórios em uma grade ou matriz. 
Essa técnica é comumente utilizada em diversas áreas, tais como: física, biologia e economia; para modelar o comportamento de sistemas complexos. 
O Random Walk é um problema matemático que pode ser descrito como o movimento de um andarilho em um espaço discreto, como por exemplo uma grade (grid). 
O andarilho começa em um ponto específico e em cada etapa escolhe aleatoriamente um dos possíveis movimentos disponíveis. 
Ele pode se mover em diferentes direções, como para cima, para baixo, para esquerda ou para direita, e a escolha da direção é feita de forma aleatória em cada passo. 
O algoritmo do problema do Random Walk em uma matriz pode ser descrito da seguinte forma:

Definir o tamanho da matriz a ser utilizada e o número de passos que o andarilho deve realizar.

Criar uma matriz bidimensional com o tamanho definido anteriormente e preenchê-la com valores padrão.

Posicionar o andarilho em uma célula da matriz, escolhida aleatoriamente.

Iniciar o processo de Random Walk com um loop que se repete por um número de vezes igual ao número de passos desejados.

Em cada etapa do loop, escolher aleatoriamente uma direção para o andarilho se mover. As direções podem ser para cima, para baixo, para a esquerda ou para a direita.

Verificar se o movimento escolhido é possível, isto é, se o andarilho não sairá da matriz. Se o movimento for possível, atualizar a posição do andarilho na matriz com o valor apropriado.

Repetir o processo de escolha de direção e atualização da posição do andarilho até que o número de passos definido seja alcançado.

Imprimir a matriz resultante com o caminho percorrido pelo andarilho.

Implemente o algoritmo do Random Walk, utilizando matrizes para representar a grade. Será necessário criar uma matriz bidimensional, posicionar o andarilho em uma célula da matriz e realizar movimentos aleatórios em cada etapa do processo. 
O resultado final será a impressão da matriz com o caminho percorrido pelo andarilho, por exemplo:

.  x  x  x  x  x  x  .  .  .
.  x  x  x  x  x  x  x  .  .
.  .  .  x  .  x  x  x  x  .
.  .  .  .  .  x  x  x  x  .
.  .  .  .  .  x  x  x  x  x
.  .  .  .  x  x  x  .  x  .
.  .  .  .  .  .  .  .  .  .
.  .  .  .  .  .  .  .  .  .
.  .  .  .  .  .  .  .  .  .
.  .  .  .  .  .  .  .  .  .


Neste exemplo, a matriz tem um tamanho de 10 x 10 e o caminho percorrido pelo andarilho é indicado pelos caracteres 'x'. O andarilho iniciou no centro da matriz e percorreu aleatoriamente por 100 passos, de forma a criar o padrão impresso na matriz.
*/

import java.util.Scanner;
import java.security.SecureRandom;
public class ex011 {
   public static void main(String[] args) {
       Scanner tc = new Scanner(System.in);
       int tamMatriz = 0;
       int passos = 0;
       int confirmacao = 1;

       do {
           System.out.println("Digite o tamanho da matriz: ");
           tamMatriz = tc.nextInt();

           System.out.println("Digite quantos passos vc deseja dar: ");
           passos = tc.nextInt();

           int matriz[][] = new int[tamMatriz][tamMatriz];

           int linhaInicial = new SecureRandom().nextInt(tamMatriz);
           int colunaInicial = new SecureRandom().nextInt(tamMatriz);
           matriz[linhaInicial][colunaInicial] = 1;

           for (int i = 0; i < passos; i++) {
               int direcao = new SecureRandom().nextInt(4);
               int novalinha = linhaInicial, novacoluna = colunaInicial;


               if (direcao == 0) {
                   novalinha = linhaInicial - 1;
               } else if (direcao == 1) {
                   novalinha = linhaInicial + 1;
               } else if (direcao == 2) {
                   novacoluna = colunaInicial - 1;
               } else if (direcao == 3) {
                   novacoluna = colunaInicial + 1;
               }

               if (novalinha >= 0 && novalinha < tamMatriz && novacoluna >= 0 && novacoluna < tamMatriz) {
                   linhaInicial = novalinha;
                   colunaInicial = novacoluna;
                   matriz[linhaInicial][colunaInicial] = 1;
               }
           }

           for (int i = 0; i < tamMatriz; i++) {
               for (int j = 0; j < tamMatriz; j++) {
                   System.out.print(matriz[i][j] + " ");
               }
               System.out.println();
           }

           System.out.println();
           System.out.println("Deseja realizar uma nova corrida aleatória? [1 para 'sim',  0 para 'não']: ");
           confirmacao = tc.nextInt();

        } while (confirmacao == 1);

        tc.close();
   }
}
