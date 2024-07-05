public class FacturaTest {
        public static void main(String[] args) {
            // Crear una instancia de Factura
            Factura factura1 = new Factura("001", "Teclado mecánico", 2, 35.99);
    
            // Mostrar detalles de la factura
            System.out.println("Número de factura: " + factura1.getNumero());
            System.out.println("Descripción: " + factura1.getDescripcion());
            System.out.println("Cantidad: " + factura1.getCantidad());
            System.out.println("Precio por artículo: $" + factura1.getPrecio());
    
            // Calcular y mostrar el total de la factura
            System.out.println("Total de la factura: $" + factura1.getTotalFactura());
        }
}
    
