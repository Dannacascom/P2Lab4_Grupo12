package pieza;

public abstract class Pieza {
    
    protected int x;
    protected int y;
    protected String color;

    public Pieza() {
    }

    public Pieza(int x, int y,String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    
    public abstract boolean movimiento(int x, int y);
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Posición: "+x+","+y;
    }
}
