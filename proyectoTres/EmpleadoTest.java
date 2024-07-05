public class EmpleadoTest {
    public static void main(String[] args) {
        Empleado jazmin = new Empleado("Jazmin", "De La Fuente", 400000.00);
        System.out.println(jazmin.getNombre());
        System.out.println(jazmin.getSalario());
        Empleado daniel = new Empleado("Eduardo Daniel", "De La Fuente", 300000.00);
        System.out.println(daniel.getNombre());
        System.out.println(daniel.getSalario());
        System.out.println("Aumentando salario 10%");
        jazmin.setSalario(jazmin.getSalario() * 1.1);
        daniel.setSalario(daniel.getSalario() * 1.1);
        System.out.println(jazmin.getSalario());
        System.out.println(daniel.getSalario());
        System.out.println("Aumentando contador");
        jazmin.aumentarContadorEmpresa();
        jazmin.aumentarContadorEmpresa();
        System.out.println(jazmin.getContadorEmpresa());
    }
}
