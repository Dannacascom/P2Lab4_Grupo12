package pieza;

public class Peon extends Pieza {

    public Peon() {
        super();
    }

    @Override
    public boolean movimiento(int xDestino, int yDestino, int xOrigen, int yOrigen) {
    return (xDestino == xOrigen && yDestino == yOrigen + 1 || 
            xDestino == xOrigen && yDestino == yOrigen + 2 && yOrigen == 1) || (xDestino == xOrigen && yDestino == yOrigen - 1 
            || xDestino == xOrigen && yDestino == yOrigen - 2 && yOrigen == 6);
    }
}
