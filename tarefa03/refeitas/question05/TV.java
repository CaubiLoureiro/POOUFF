package tarefa02.question05;

public class TV {
    private boolean on;
    private boolean off;
    private boolean mute;
    private int channel;
    private int volume;
    private int lastVol;


    public TV(){
        this.disconnectTv();
        this.volume = 5;
        this.lastVol = 0;
        this.mute = false;
        this.channel = 1;
    }



    public void connectTv(){
        if ( on ){
            System.out.println("The TV is on");
        }else{
            this.on = true;
            this.off = false;
        }
    }

    public void disconnectTv(){
        this.on = false;
        this.off = true;
    }

    public void moreChannel() {
        if ( channel == 99) {
            this.channel = 0;

        }else{
            this.channel += 1;

        }
    }

    public void lessChannel(){
        if ( channel == 0) {
            this.channel = 99;

        }else{
            this.channel -= 1;

        }
    }

    public void chooseChannel(int channel){
        if( channel > 0 && channel < 99){
            this.channel = channel;

        }else{
            System.out.println("Invalid channel");

        }
    }

    public void moreVol() {
        if (this.lastVol != 0) {
            this.volume = this.lastVol + 1;
            this.mute = false;

        }else if(this.volume < 10){
            this.volume += 1;

        }
    }

    public void lessVol(){
        if(this.lastVol != 0){
            this.volume = this.lastVol - 1;
            this.mute = false;

        }else if(this.volume > 0){
            this.volume -= 1;

        }
    }

    public void setMute(){
        if ( this.mute) {
            this.lastVol = this.volume;
            this.mute = true;

        }else{
            this.mute = false;
            this.lastVol = 0;
        }
    }

    public void printVol(){
        for (int i = 0; i < this.volume; i ++){
            if (i == this.volume - 1){
                System.out.print("|");
            }else{
                System.out.print("| ");
            }
        }
        System.out.println();
    }
    public void status() {
        if ( this.off ){
            System.out.println("OFF");
        }else{
            System.out.println("ON");
            System.out.println(this.channel);
            if (this.mute){
                System.out.println("Mute");
            }else{
                this.printVol();
            }
        }
    }
}
