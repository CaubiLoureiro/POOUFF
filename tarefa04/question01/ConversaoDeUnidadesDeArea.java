package tarefa04.question01;

public class ConversaoDeUnidadesDeArea {


    public static double metroQuadradoParaPesQuadrados(double emMetro){
        double conversao = emMetro * 10.76;
        return conversao;
    }

    public static double peQuadradoParaCentimetrosQuadrados(double emPes){
        double conversao = emPes * 929;
        return conversao;
    }

    public static double milhaQuadradaParaAcres(double milhas){
        double conversao = milhas * 640;
        return conversao;
    }

    public static double acresParaPesQuadrados(double emAcres){
        double conversao = emAcres * 43.560;
        return conversao;
    }

}
