public class Cuenta {
    String  nombre,
            apellido,     
            ocupacion,    //DATOS DEL PROPIETARIO DE LA CUENTA
            email;
    int     edad;
    double  saldo;

    public void depositar(double saldo){
        this.saldo += saldo;
        System.out.println("¡Depósito realizado con éxito, depositaste " + saldo + ", ahora tu saldo es " + this.saldo + ".");
    }
    public void retirar(double saldo){
        if(this.saldo >= saldo){
            this.saldo -= saldo;
            System.out.println("¡Retiro realizado con éxito, retiraste " + saldo + ", ahora tu saldo es " + this.saldo + ".");
        }else{
            System.out.println("Intentas retirar " + saldo + " pero tu saldo es " + this.saldo + ".\nInténtalo nuevamente.");
        }
    }
    public void transferir(Cuenta cuenta, double saldo){
        if(this.saldo >= saldo){
            this.saldo -= saldo;
            cuenta.saldo += saldo;
            System.out.println("Transferencia realizada con éxito, transferiste " + saldo + ", ahora tu saldo es " + this.saldo + ".");
        }else{
            System.out.println("No se puede realizar la transferencia, tu saldo no es suficiente.");
        }
    }
    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre + "\n" +
                           "Apellido: " + this.apellido + "\n" +
                           "Ocupación: " + this.ocupacion + "\n" +
                           "Email: " + this.email + "\n" +
                           "Edad: " + this.edad + "\n" +
                           "Saldo: " + this.saldo + "\n");
    }
}
