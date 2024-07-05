public class Factura {
    private String numero;
    private String descripcion;
    private int cantidad;
    private double precio;

    // Constructor
    public Factura(String numero, String descripcion, int cantidad, double precio) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Métodos Getters y Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método para calcular el total de la factura
    /**
     * @return
     */
    public double getTotalFactura() {
        // Si la cantidad o el precio no son positivos, establecer en 0
        if (cantidad <= 0 || precio <= 0.0) {
            return 0.0;
        }
        return cantidad * precio;
    }
}
