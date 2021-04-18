package tarefa06.questao06;

import javax.management.Query;
import java.awt.desktop.QuitEvent;
import java.util.*;

public class Karaoke {
    private Set<String> musicas;
    private Set<String> artistas;
    private Queue<String> listaReprodução;


    public Karaoke(){
        musicas = new HashSet<>();
        artistas = new HashSet<>();
        listaReprodução = new LinkedList<>();

        musicas.add("Qualquer musica");
        musicas.add("Outra musica");

        artistas.add("Jubileu");
        artistas.add("Corona vírus");

    }



    public void mostarMusicas(){
        System.out.println(musicas);
    }

    public void mostrarArtistas(){
        System.out.println(artistas);
    }

    public void tocar(){
        System.out.println("Digite a música que deseja por na fila para tocar:");
        Scanner teclado = new Scanner(System.in);
        String musica = teclado.nextLine();
        for(String index : musicas){
            if(index.equals(musica)){
                listaReprodução.add(musica);
            }
        }
        System.out.println(listaReprodução);
    }

    public void acabouAMusica(){
        listaReprodução.remove();
        System.out.println(listaReprodução);
    }


}
