package pieza;

public class Torre extends Pieza{

    public Torre() {
        super();
    }

    @Override
    public boolean movimiento(int xDestino, int yDestino, int xOrigen, int yOrigen) {
        return xOrigen == xDestino || yDestino == yOrigen;
    }
    
}
