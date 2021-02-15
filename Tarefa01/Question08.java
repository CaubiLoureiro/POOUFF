import java.util.Scanner;
public class Question08 {
    public static void main(String[] args){
        int dimensao, diagonalPrimaria = 0, diagonalSecundaria = 0, sumLinha = 0, sumColuna = 0;
        Scanner teclado = new Scanner(System.in);
        dimensao = teclado.nextInt();
        int[][] matriz = new int[dimensao][dimensao];


        /* Pega as entradas para completar a matriz*/
        for (int lin = 0; lin < dimensao; lin++){
            for (int col = 0; col < dimensao; col++){

                System.out.printf("Digite o elemento [%d][%d]: ", lin+1, col+1);

                matriz[lin][col] = teclado.nextInt();

            }
        }

        /* Soma os elementos das diagonais*/
        for (int i = 0; i < dimensao; i++){
            diagonalPrimaria += matriz[i][i];
            diagonalSecundaria += matriz[i][(dimensao-1) - i];
        }


        /* Soma os elementos das linhas*/
        for (int lin = 0; lin < dimensao; lin++){
            int sum = 0;
            for (int col = 0; col < dimensao; col++){
                sum += matriz[lin][col];
            }
            sumLinha = sum;

            if ((sum != diagonalPrimaria) || (sum != diagonalSecundaria)){
                break;
            }
        }


        /* Soma os elementos das colunas*/
        for (int col = 0; col < dimensao; col++){
            int sum = 0;
            for (int lin = 0; lin<dimensao; lin++){
                sum += matriz[lin][col];
            }
            sumColuna = sum;

            if ((sum != diagonalPrimaria) || (sum != diagonalSecundaria)){
                break;
            }
        }


        /* Verifica se é é quadrado mágico*/
        if ((diagonalPrimaria == diagonalSecundaria) && (diagonalSecundaria == sumLinha) && (sumLinha == sumColuna)){
            System.out.println("A matriz é um quadrado mágico");
        }else{
            System.out.println("A não matriz é um quadrado mágico");
        }

    }
}
