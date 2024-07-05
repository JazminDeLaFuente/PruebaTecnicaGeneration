public class Auto {
    private String modelo;
    private String color;
    private int año;
    private Marca marca;
    private String chasis;
    private Propietario propietario;
    private int velocidadMaxima;
    private int velocidadActual;
    private int numeroPuertas;
    private boolean tieneTechoSolar;
    private int numeroMarchas;
    private boolean tieneTransmisionAutomatica;
    public int getVelocidadActual() {
        return velocidadActual;
    }
    public Auto(String modelo, String color, int año, Marca marca, String chasis, 
                Propietario propietario, int velocidadMaxima, int numeroPuertas, 
                boolean tieneTechoSolar, int numeroMarchas, boolean tieneTransmisionAutomatica) {
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.marca = marca;
        this.chasis = chasis;
        this.propietario = propietario;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = 0;
        this.numeroPuertas = numeroPuertas;
        this.tieneTechoSolar = tieneTechoSolar;
        this.numeroMarchas = numeroMarchas;
        this.tieneTransmisionAutomatica = tieneTransmisionAutomatica;
    }

    public void acelerar() {
        if (velocidadActual < velocidadMaxima) {
            velocidadActual++;
        }
    }

    public void frenar() {
        velocidadActual = 0;
    }

    public void cambiarMarcha(int nuevaMarcha) {
        if (nuevaMarcha > 0 && nuevaMarcha <= numeroMarchas) {
            // Lógica para cambiar de marcha
            System.out.println("Cambiando a marcha " + nuevaMarcha);
        }
    }

    public void reducirMarcha() {
        // Lógica para reducir marcha
        System.out.println("Reduciendo marcha");
    }

    public double calcularAutonomia(double consumoMedio) {
        // Implementar lógica para calcular autonomía
        return 500.0; // Valor de ejemplo
    }

    public double mostrarVolumenCombustible() {
        // Implementar lógica para mostrar volumen de combustible
        return 50.0; // Valor de ejemplo
    }

    // Getters y setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

}