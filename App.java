class App {
    public static void main(String args[]) {
        Cliente[] clientes;

        clientes = new Cliente[5];

        clientes[0] = new Cliente("Sergio", "sergio@gmail.com", 500);
        clientes[1] = new ClienteVIP("Mike", "mike@gmail.com", 600, 300);
        clientes[2] = new Cliente("Jose", "jose@gmail.com", 700);
        clientes[3] = new Cliente("Maria", "maria@gmail.com", 900);
        clientes[4] = new ClienteVIP("Nancy", "nancy@gmail.com", 2000, 300);

        for (Cliente c : clientes) {
            System.out.println(c);
        }
        /*
         * // vou comprar if (v.fazendoCompra(650)) {
         * System.out.println("Conseguiu comprar"); } else {
         * System.out.println("Saldo Insuficiente"); } System.out.println(v);
         */
    }

}
