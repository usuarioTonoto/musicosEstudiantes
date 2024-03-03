public class Animal implements Estudiantes {
    @Override
    public void leer(String libro) {
        System.out.println("Este animal esta leyendo " + libro);
    }

    @Override
    public void comer(String comida) {
        System.out.println("El animal ta tragando " + comida);
    }
}
