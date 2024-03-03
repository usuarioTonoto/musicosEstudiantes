import Guardar.ObjetoGuardable;

// Solo se puede heredar de 1 a 2 clases
public class Persona implements Estudiantes, Musico, ObjetoGuardable {
    String nombre;
    int edad;
    Persona madre;
    Persona padre;
    private String nombreArtistico;

    public Persona(String nombre, int edad, Persona madre, Persona padre, Instrumento i) {
        this.nombre = nombre;
        this.edad = edad;
        this.madre = madre;
        this.padre = padre;
    }

    @Override
    public void leer(String libro) {
        System.out.println(this.nombre + " esta leyendo " + libro);
    }

    @Override
    public void comer(String comida) {
        System.out.println(this.nombre + " esta comiendo " + comida);
    }

    @Override
    public String getNombreArtistico() {
        return this.nombreArtistico;
    }

    @Override
    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }
}
