package pieza;

public class Rey extends Pieza {

    public Rey() {
        super();
    }

    @Override
    public boolean movimiento(int xDestino, int yDestino, int xOrigen, int yOrigen) {
        return Math.abs(xOrigen - xDestino) <= 1 && Math.abs(yOrigen - yDestino) <= 1;
    }
}
