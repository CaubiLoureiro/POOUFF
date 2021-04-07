package tarefa05.questão06;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escrever {


    public static void escrever(String nomeArquivo){
        File file = new File(nomeArquivo);


        try{
            System.out.println("\nDigite o registo para gravar no arquivo:");
            Scanner teclado = new Scanner(System.in);
            String registo = teclado.nextLine();
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(registo);
            bw.flush();
            System.out.println("O registro foi salvo\n");
            bw.close();




        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }




}
