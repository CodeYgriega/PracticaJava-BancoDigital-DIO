public class App {
    public static void main(String[] args) throws Exception {
        Cuenta cuenta1 = new CuentaCorriente(
            "Oliver",
            "Yanicelli",
            "Programador",
            "oliveryanicelli@gmail.com",
            23
        );
        cuenta1.mostrarDatos();
        /*cuenta1.depositar(250);
        System.out.println("El saldo de la cuenta 1 es: " + cuenta1.saldo);*/
        Cuenta cuenta2 = new CuentaDeAhorro(
            "Pepe",
            "Juárez",
            "Profesor",
            "pepeprofe@gmail.com",
            26
        );
        cuenta2.mostrarDatos();
        /*System.out.println("El saldo de la cuenta 2 es: " + cuenta2.saldo);

        cuenta1.transferir(cuenta2, 250);
        System.out.println("El saldo de la cuenta 1 después de la transferencia es: " + cuenta1.saldo);
        System.out.println("El saldo de la cuenta 2 después de la transferencia es: " + cuenta2.saldo);*/
    }
}
