public class Cliente extends Persona {
    private double credito;  // variable privada para almacenar el crédito del cliente

    // método get para obtener el crédito del cliente
    public double getCredito() {

        return credito;
    }

    // método set para establecer el crédito del cliente
    public void setCredito(double credito) {

        this.credito = credito;
    }
}
