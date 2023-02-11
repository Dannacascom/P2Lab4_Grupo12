package pieza;

public class Reina extends Pieza{

    public Reina() {
        super();
    }

    @Override
    public boolean movimiento(int xDestino, int yDestino, int xOrigen, int yOrigen) {
        if (xDestino == xOrigen || yOrigen == yDestino) {
            return true;
        }
        return Math.abs(xOrigen - xDestino) == Math.abs(yOrigen - yDestino);
    }
}
