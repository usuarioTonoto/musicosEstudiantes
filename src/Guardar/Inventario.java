package Guardar;

import java.util.List;

abstract public class Inventario<T> {
    String nombre;
    String color;
    List<T> cosas;
    int limite;

    public Inventario(String nombre, String color, List<T> cosas, int limite) {
        this.nombre = nombre;
        this.color = color;
        this.cosas = cosas;
        this.limite = limite;
    }

    public void guardar(T cosa) {
        this.cosas.add(cosa);
    }

    public T sacar() {
        return this.cosas.get(this.elementoSiguienteSacar());
    }

    abstract protected int elementoSiguienteSacar();
}
