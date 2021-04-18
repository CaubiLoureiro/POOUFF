package tarefa06.questao04;
import java.awt.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String entrada = teclado.nextLine();

        String[] lista = entrada.split(" ");

        Map<String, Integer> cont = new TreeMap<String, Integer>();

        for (String palavra : lista) {
            if (!cont.containsKey(palavra))
                cont.put(palavra, 0);
            cont.put(palavra, cont.get(palavra) + 1);
        }

        for(Map.Entry<String, Integer> entry : cont.entrySet()){
            System.out.println("Palavra: "+entry.getKey()+", Ocorrência: "+entry.getValue()+"\n");
        }


    }
}