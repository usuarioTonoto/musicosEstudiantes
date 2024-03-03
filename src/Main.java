public class Main {
    public static void main(String[] args) {
        Persona daniel = new Persona("Daniel", 18, null, null, null);
        daniel.setNombreArtistico("TheDaniel");
        daniel.tocarInstrumento(Instrumento.GUITARRA);

        Animal zebra = new Animal();

        Main prog = new Main();
        prog.molestarEstudiante(daniel);
        prog.molestarEstudiante(zebra);

        prog.pagarMusico(daniel);
    }

    public void molestarEstudiante(Estudiantes e) {
        System.out.println("Molestando al estudiante");
        e.leer("El principito");
    }

    public void pagarMusico(Musico m) {
        System.out.println("Se le esta pagando 10$ al musico " + m.getNombreArtistico());
    }
}