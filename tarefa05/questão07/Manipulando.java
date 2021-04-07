package tarefa05.questão07;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Manipulando {

    public static void escritor(String nomeArquivo) {
        File file = new File(nomeArquivo);
        try{
            FileOutputStream escritor = new FileOutputStream(file, true);
            BufferedOutputStream bw = new BufferedOutputStream(escritor);
            System.out.println("Digite o registro para salvar no arquivo:");
            Scanner teclado = new Scanner(System.in);
            String registro = teclado.nextLine();
            bw.write(registro.getBytes());
            bw.write("\n".getBytes());
            bw.flush();
            bw.close();


        }catch (IOException ioException){
            System.out.println("Erro ao manipular arquivo");

        }
    }

    public static void leitor(String nomeArquivo){
        File file = new File(nomeArquivo);
        try{
            FileInputStream leitura = new FileInputStream(file);
            BufferedInputStream br = new BufferedInputStream(leitura);
            int cont;
            while((cont = br.read()) != -1){
                System.out.print((char) cont);

            }


        }catch (IOException ioException){
            System.out.println("Erro ao manipular arquivo");
        }
    }
}
