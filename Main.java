public class Main {
    public static void main(String[] args) {
        // crea una nueva instancia de la clase Cliente
        Cliente cliente = new Cliente();

        // establece la edad, nombre, teléfono y crédito del cliente utilizando los métodos set
        cliente.setEdad(48);
        cliente.setNombre("José");
        cliente.setTelefono("902-4252-524");
        cliente.setCredito(10000.0);

        // muestra la edad, nombre, teléfono y crédito del cliente utilizando los métodos get
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito());
    }

}

class Trabajador extends Persona {
    double salario;
}
