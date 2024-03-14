package co.edu.uniquindio.parcial1fx.transporteapp.Model;

public class Usuario {
    private String nombreUsuario;
    private int edad;

    private VehiculoTransporte vehiculoAsociado;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, int edad, VehiculoTransporte vehiculoAsociado) {
        this.nombreUsuario = nombreUsuario;
        this.edad = edad;
        this.vehiculoAsociado = vehiculoAsociado;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public VehiculoTransporte getVehiculoAsociado() {
        return vehiculoAsociado;
    }

    public void setVehiculoAsociado(VehiculoTransporte vehiculoAsociado) {
        this.vehiculoAsociado = vehiculoAsociado;
    }

    @Override
    public String toString() {
        return "Usuario: " +
                "nombreUsuario = " + nombreUsuario +
                ", edad = " + edad +
                ", vehiculoAsociado = " + vehiculoAsociado;
    }
}

