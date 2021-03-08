package tarefa02.question03;

public class Door {
    private boolean open;
    private boolean closed;
    private String color;
    private double height;
    private double width;


    public Door(String color, double height, double width){
        this.setClosed();
        this.setColor(color);
        this. setHeight(height);
        this.setWidth(width);
    }

    public void setOpen(){
        this.open = true;
        this.closed = false;
    }
    public void setClosed(){
        this.closed = true;
        this.open = false;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }
    public String estaAberta(){
        String openOrClosed;
        if ( open == true ){
            openOrClosed = "The door is open";
        }else{
            openOrClosed = "The door is closed";
        }
        return openOrClosed;
    }
}
