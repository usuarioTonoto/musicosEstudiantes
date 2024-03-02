public class Persona {
    String nombre;
    int edad;
    Persona madre;
    Persona padre;

    public Persona(String nombre, int edad, Persona madre, Persona padre) {
        this.nombre = nombre;
        this.edad = edad;
        this.madre = madre;
        this.padre = padre;
    }
}
