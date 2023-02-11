package pieza;

public class Alfil extends Pieza{

    public Alfil() {
        super();
    }

    @Override
    public boolean movimiento(int xDestino, int yDestino, int xOrigen, int yOrigen) {
        return Math.abs(xDestino-xDestino) == Math.abs(yDestino - yOrigen);
    }
    
}
