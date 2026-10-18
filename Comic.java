public class Comic extends ProductoGeek {
    private int numeroTomo;

    public Comic(String codigo, String nombre, double precioBase, int numeroTomo) {
        super(codigo, nombre, precioBase);
        this.numeroTomo = numeroTomo;
    }

    public int getNumeroTomo() {
        return numeroTomo;
    }

    public void setNumeroTomo(int numeroTomo) {
        this.numeroTomo = numeroTomo;
    }

    public static void main(String[] args) {
        Comic comic = new Comic("COM-001", "Watchmen", 18500.0, 1);

        System.out.println("--- Datos del Cómic ---");
        // Acceso a atributos/métodos heredados de ProductoGeek
        System.out.println("Código: " + comic.getCodigo());
        System.out.println("Nombre: " + comic.getNombre());
        System.out.println("Precio Base: $" + comic.getPrecioBase());
        
        // Acceso a atributo propio de Comic
        System.out.println("Número de Tomo: #" + comic.getNumeroTomo());
    }
}