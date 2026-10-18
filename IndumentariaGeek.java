public class IndumentariaGeek extends ProductoGeek {
    private String talle;
    private String material;

    public IndumentariaGeek(String codigo, String nombre, double precioBase, String talle, String material) {
        super(codigo, nombre, precioBase);
        this.talle = talle;
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + " | Talle: " + talle + " | Material: " + material;
    }

    public static void main(String[] args) {
        IndumentariaGeek remera = new IndumentariaGeek("IND-10", "Remera Cyberpunk", 12000.0, "L", "Algodón");
        System.out.println(remera);
    }
}