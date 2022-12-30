public class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    // método get para obtener la edad de la persona
    public int getEdad() {

        return edad;
    }

    // método set para establecer la edad de la persona
    public void setEdad(int edad) {

        this.edad = edad;
    }

    // método get para obtener el nombre de la persona
    public String getNombre() {

        return nombre;
    }

    // método set para establecer el nombre de la persona
    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    // método get para obtener el teléfono de la persona
    public String getTelefono() {

        return telefono;
    }

    // método set para establecer el teléfono de la persona
    public void setTelefono(String telefono) {

        this.telefono = telefono;
    }


    //constructor
    public Persona() {
        System.out.println("Esto en el constructor de Persona");
    }

}
