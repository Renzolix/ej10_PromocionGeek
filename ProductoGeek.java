public class ProductoGeek {
    protected String codigo;
    protected String nombre;
    protected double precioBase;

    public ProductoGeek(String codigo, String nombre, double precioBase) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioBase = precioBase;

         System.out.println("Ejecutando constructor de la superclase: ProductoGeek");
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double calcularPrecioVenta() {
    return this.precioBase;
    }

    @Override
    public String toString() {
    return "Código: " + codigo + " | Nombre: " + nombre;
    }
}