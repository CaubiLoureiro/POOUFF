package introducaoaoo.question04;

public class Door {
    private boolean open;
    private boolean closed;

    public void setOpen(){
        this.open = true;
        this.closed = false;
    }
    public void setClosed(){
        this.closed = true;
        this.open = false;
    }

    public int estaAberta(){
        if ( open == true ){
            return 1;
        }else{
            return 0;
        }

    }
}
