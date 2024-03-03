package Guardar;
import java.util.List;

public class Mochila<T> extends Inventario {
    public Mochila(String color, List<T> cosas) {
        super("Mochila", color, cosas, 20);
    }

    @Override
    protected int elementoSiguienteSacar() {
        return this.cosas.size()-1;
    }
}
