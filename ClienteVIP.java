public class ClienteVIP extends Cliente {
    private float creditoExtra;

    public ClienteVIP(String nome, String email, float credito, float creditoExtra) {
        super(nome, email, credito);
        this.creditoExtra = creditoExtra;
    }

    public String toString() {
        return "(VIP) " + super.toString() + " credito Extra U$ " + creditoExtra;
    }

    public boolean fazendoCompra(float valor) {
        if (valor > creditoExtra + super.getCredito()) {
            return false;
        } else {
            super.setCredito(super.getCredito() - valor);
            return true;
        }
    }
}
