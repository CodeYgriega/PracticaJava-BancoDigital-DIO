public class CuentaCorriente extends Cuenta{
    public CuentaCorriente(String nombre,
                           String apellido,
                           String ocupacion,
                           String email,
                           int edad){
        super.nombre = nombre;
        super.apellido = apellido;
        super.ocupacion = ocupacion;
        super.email = email;
        super.edad = edad;
    }
}
