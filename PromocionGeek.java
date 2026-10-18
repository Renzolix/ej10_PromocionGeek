import java.util.ArrayList;
import java.util.List;

public class PromocionGeek {

    public static void procesarLiquidacion(List<ProductoGeek> productos) {
        System.out.println("=== PROCESAMIENTO DE LIQUIDACIÓN DE STOCK ===");
        double granTotal = 0.0;

        for (ProductoGeek p : productos) {
            double precioCalculado = p.calcularPrecioVenta();
            double precioFinal = precioCalculado;
            String promocionAplicada = "Sin descuento adicional";

            if (p instanceof Comic) {
                precioFinal = precioCalculado * 0.90; // 10% adicional
                promocionAplicada = "10% OFF Categoría Cómic";
            } else if (p instanceof FiguraColeccionable) {
                precioFinal = precioCalculado * 0.95; // 5% adicional
                promocionAplicada = "5% OFF Categoría Figura";
            }

            granTotal += precioFinal;

            System.out.println("Producto: " + p.getNombre());
            System.out.println(" Price Regular: $" + precioCalculado + " | Promoción: " + promocionAplicada);
            System.out.println(" Price Cobrado: $" + precioFinal);
            System.out.println("-----------------------------------------------------");
        }

        System.out.println("TOTAL RECAUDADO EN LIQUIDACIÓN: $" + granTotal);
    }

    public static void main(String[] args) {
        List<ProductoGeek> lote = new ArrayList<>();

        lote.add(new Comic("C-01", "V for Vendetta", 20000.0, 1));
        lote.add(new FiguraColeccionable("F-01", "Figura Batman", 60000.0, false));
        lote.add(new FiguraColeccionable("F-02", "Figura Joker Limited", 80000.0, true));
        lote.add(new IndumentariaGeek("I-01", "Campera Star Wars", 40000.0, "L", "Cuero Sintético"));

        procesarLiquidacion(lote);
    }
}