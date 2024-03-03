public interface Musico {
    default public void tocarInstrumento(Instrumento i) {
        switch (i) {
            case PIANO:
                System.out.println("Tocando el piano");
                break;
            case TECLADO:
                System.out.println("Tocando el teclado");
                break;
            case TROMPETA:
                System.out.println("Brrrum brrrum brrrrumm buuu");
                break;
            case GUITARRA:
                System.out.println("Es la guitarra de Lolo");
                break;
        }
    }
    public String getNombreArtistico();
    public void setNombreArtistico(String nombreArtistico);
}
