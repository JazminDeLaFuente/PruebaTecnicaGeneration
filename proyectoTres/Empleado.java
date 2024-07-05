public class Empleado {
    private String nombre;
    private String apellido;
    private double salario;
    private int contadorEmpresa;
    public Empleado(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.contadorEmpresa = 0;
    }
    public void setApellido(String nuevoApellido){
        this.apellido = nuevoApellido;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setSalario(double nuevoSalario){
        this.salario = nuevoSalario;
    }
    public double getSalario(){
        return this.salario;
    }
    public int getContadorEmpresa(){
        return this.contadorEmpresa;
    }
    public void aumentarContadorEmpresa(){
        this.contadorEmpresa++;
    }
}
