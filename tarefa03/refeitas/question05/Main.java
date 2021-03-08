package tarefa02.question05;

public class Main {
    public static void main( String[] args){
        TV tv = new TV();

        tv.connectTv();
        tv.moreChannel();
        tv.moreVol();
        tv.chooseChannel(70);
        tv.moreChannel();
        tv.lessChannel();
        tv.setMute();
        tv.lessChannel();
        tv.lessVol();
        tv.lessVol();
        tv.status();

    }
}
