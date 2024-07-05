import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear objetos
        Direccion direccion = new Direccion("Calle Principal", "Centro", "Ciudad de México");
        Propietario propietario = new Propietario("Juan Pérez", LocalDate.of(1990, 5, 15), direccion);
        Marca marca = new Marca("Toyota", 10, 1937, "TOY");
        
        Auto auto = new Auto("Corolla", "Rojo", 2023, marca, "ABC123", propietario, 180, 4, false, 6, true);
        
        // Mostrar información
        System.out.println("Auto creado para " + auto.getPropietario().getNombre());
        System.out.println("Marca: " + auto.getMarca().getNombre());
        System.out.println("Modelo: " + auto.getModelo());
        
        // Probar algunos métodos
        auto.acelerar();
        System.out.println("Velocidad actual después de acelerar: " + auto.getVelocidadActual());
        
        auto.frenar();
        System.out.println("Velocidad actual después de frenar: " + auto.getVelocidadActual());
        
        auto.cambiarMarcha(3);
        
        double autonomia = auto.calcularAutonomia(7.5);
        System.out.println("Autonomía estimada: " + autonomia + " km");
        
        double volumenCombustible = auto.mostrarVolumenCombustible();
        System.out.println("Volumen de combustible: " + volumenCombustible + " litros");
    }
}