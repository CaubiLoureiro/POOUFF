package tarefa05.questão06;



import java.io.*;

public class Lendo {




    public static void ler(String nomeArquivo){
        File file = new File(nomeArquivo);

        try{
            String string = null;
            FileReader fw = new FileReader(nomeArquivo);
            BufferedReader br = new BufferedReader(fw);

            while((string = br.readLine()) != null){
                System.out.println(string);

            }
            br.close();

        }catch(IOException ioe){
            ioe.printStackTrace();
        }


    }



}
