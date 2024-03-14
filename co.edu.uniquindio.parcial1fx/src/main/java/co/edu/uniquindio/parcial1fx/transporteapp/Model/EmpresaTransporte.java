package co.edu.uniquindio.parcial1fx.transporteapp.Model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {
    private String nombre;
    private List<Propietario> propietarioList = new ArrayList<>();
    private List<VehiculoTransporte> vehiculoTransporteList = new ArrayList<>();
    private List<VehiculoCarga> vehiculoCargaList = new ArrayList<>();
    private List<Vehiculo> vehiculoList = new ArrayList<>();
    private List<Usuario> listaUsuarios = new ArrayList<>();

    public EmpresaTransporte() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Propietario> getPropietarioList() {
        return propietarioList;
    }

    public void setPropietarioList(List<Propietario> propietarioList) {
        this.propietarioList = propietarioList;
    }

    public List<VehiculoTransporte> getVehiculoTransporteList() {
        return vehiculoTransporteList;
    }

    public void setVehiculoTransporteList(List<VehiculoTransporte> vehiculoTransporteList) {
        this.vehiculoTransporteList = vehiculoTransporteList;
    }

    public List<VehiculoCarga> getVehiculoCargaList() {
        return vehiculoCargaList;
    }

    public void setVehiculoCargaList(List<VehiculoCarga> vehiculoCargaList) {
        this.vehiculoCargaList = vehiculoCargaList;
    }

    public List<Vehiculo> getVehiculoList() {
        return vehiculoList;
    }

    public void setVehiculoList(List<Vehiculo> vehiculoList) {
        this.vehiculoList = vehiculoList;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public boolean crearVehiclo(String placa, String modelo, String marca, String color){
        Vehiculo vehiculoEncontrado = obtenerVehiculo(placa);
        if (vehiculoEncontrado == null) {
            Vehiculo vehiculo = getBuildVehiculo(placa, modelo, marca, color);
            getVehiculoList().add(vehiculo);
            return true;
        }else{
            return false;
        }

    }

    private Vehiculo getBuildVehiculo(String placa, String modelo, String marca, String color) {
        return Vehiculo.builder()
                .placa(placa)
                .modelo(modelo)
                .marca(marca)
                .color(color)
                .build();
    }

    private Vehiculo obtenerVehiculo(String placa) {
        Vehiculo vehiculo = null;
        for (Vehiculo vehiculo1: getVehiculoList()){
            if(vehiculo1.getPlaca().equalsIgnoreCase(placa)){
                vehiculo = vehiculo1;
                break;
            }
        }
        return vehiculo;
    }

    public int calcularNumPasajeros(String placa){
        int suma = 0;
        for (VehiculoTransporte vehiculoTransporte :this.vehiculoTransporteList){
            if(vehiculoTransporte.getPlaca().equals(placa)){
                suma += vehiculoTransporte.getListaUsuariosAsociados().size();
            }
        }
        return suma;
    }

    public int calcularMayoresEdad(){
        int contador = 0;
        for (Usuario usuario :this.listaUsuarios){
            if (usuario.getEdad() >= 18){
                contador++;
            }
        }
        return contador;
    }

}








