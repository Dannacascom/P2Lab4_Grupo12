package pieza;

public class Caballo extends Pieza {

    public Caballo() {
        super();
    }

    @Override
    public boolean movimiento(int xDestino, int yDestino, int xOrigen, int yOrigen) {
        int dx = Math.abs(xDestino - xOrigen);
        int dy = Math.abs(yDestino - yOrigen);
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}
