package piramideelaboradainversa;

import javax.swing.JOptionPane;

public class PiramideElaboradaInversa {

    public static void main(String[] args) {

        int linha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de linhas:"));
        
        for (int altura = 1; altura <= linha; altura++) {

            //espaços lado esquerdo
            for (int espacos = 1; espacos <= altura; espacos++) {
                System.out.print(" ");
            }

            //asteriscos
            for (int asteriscos = 0; asteriscos < ((linha-altura+1)*2)-1; asteriscos++) {
                System.out.print("*");
            }

            //espaços lado direito
            for (int espacos = 1; espacos <= altura; espacos++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
