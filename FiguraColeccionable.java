public class FiguraColeccionable extends ProductoGeek {
    private boolean esEdicionLimitada;

    public FiguraColeccionable(String codigo, String nombre, double precioBase, boolean esEdicionLimitada) {
        super(codigo, nombre, precioBase);
        this.esEdicionLimitada = esEdicionLimitada;
    }

    @Override
    public double calcularPrecioVenta() {
        if (this.esEdicionLimitada) {
            return this.precioBase * 1.25; // Incremento del 25%
        }
        return super.calcularPrecioVenta();
    }

    public static void main(String[] args) {
        ProductoGeek prodEstandard = new ProductoGeek("GEN-01", "Llavero Gamer", 5000.0);
        FiguraColeccionable figuraLimitada = new FiguraColeccionable("FIG-99", "Estatua Goku SSJ", 80000.0, true);

        System.out.println("Producto Estándar (" + prodEstandard.getNombre() + "): $" + prodEstandard.calcularPrecioVenta());
        System.out.println("Figura Limitada (" + figuraLimitada.getNombre() + "): $" + figuraLimitada.calcularPrecioVenta());
    }
}