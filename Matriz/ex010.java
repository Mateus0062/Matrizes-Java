/*Quando trabalhamos com imagens digitais, cada pixel é composto por três componentes de cor: vermelho, verde e azul (RGB). 
No entanto, em muitos casos, precisamos trabalhar com imagens em escala de cinza, onde cada pixel é representado por um único valor de 
intensidade que varia de 0 (preto) a 255 (branco). Para converter uma imagem colorida em escala de cinza, podemos calcular a média dos valores de RGB dos seus pixels e usar esse 
valor como a intensidade do pixel na imagem em escala de cinza. Uma matriz bidimensional é comumente usada para armazenar a informação de uma imagem digital. 
Cada elemento da matriz representa um pixel da imagem e seu valor representa a cor do pixel. 
Faça um programa que carregue uma imagem fornecida pelo usuário, calcule e mostre uma matriz que armazena os valores de cinza dos pixels da imagem. 
Para resolver este problema você deverá pesquisar como carregar imagens na memória e obter os valores dos pixels.   */

import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class ex010{
   public static void main(String[] args) {

       JFileChooser fileChooser = new JFileChooser();
       fileChooser.showOpenDialog(null);

       File selectedFile = fileChooser.getSelectedFile();
       String imagePath = selectedFile.getAbsolutePath();

       BufferedImage image = null;

       try {
           image = ImageIO.read(new File(imagePath));
       } catch (IOException e) {
           e.printStackTrace();
       }

      int matriz[][] = new int[image.getWidth()][image.getHeight()];

       for (int i = 0; i < image.getWidth(); i++) {
           for (int j = 0; j < image.getHeight(); j++) {
               int cor = image.getRGB(i, j);

               int vermelho = (cor >> 16) & 0xff;
               int verde = (cor >> 8) & 0xff;
               int azul = cor & 0xff;

               int cinza = (vermelho + verde + azul) / 3;

               matriz[i][j] = cinza;
           }
       }

       for (int i = 0; i < image.getWidth(); i++) {
           for (int j = 0; j < image.getHeight(); j++) {
               System.out.print(" " + matriz[i][j]);
           }
           System.out.println();
       }
   }
}
