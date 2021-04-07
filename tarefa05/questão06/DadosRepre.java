package tarefa05.questão06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DadosRepre {



    public static void repre(String nomeArquivo){
        File file = new File(nomeArquivo);

        try{
            String string = null;
            FileReader fw = new FileReader(nomeArquivo);
            BufferedReader br = new BufferedReader(fw);
            int dia, indice, registo = 1;
            double max, min;

            while((string = br.readLine()) != null){
                String[] linhaSeparada = string.split(", ");
                dia = Integer.parseInt(linhaSeparada[0]);
                min = Double.parseDouble(linhaSeparada[1]);
                max = Double.parseDouble(linhaSeparada[2]);
                indice = Integer.parseInt(linhaSeparada[3]);
                System.out.printf("Registro%d\nDia: %d\nMin: %.2f\nMax: %.2f\nIndi: %d\n\n", registo, dia, min, max, indice);
                registo++;


            }
            br.close();

        }catch(IOException ioe){
            ioe.printStackTrace();
        }


    }
}
